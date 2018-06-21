package module;

import event.Event;
import event.EventType;
import query.Query;
import query.QueryComparator;
import query.QueryType;
import randomvaluegenarator.RandomValueGenerator;
import simulation.Simulation;
import statistics.GlobalStatistics;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class TransactionModule extends  Module {

    // Number of queries that are being analyzed.
    private int queryCount;
    // Tell us if a DDL query is being executed.
    private boolean executingDDL;

    public TransactionModule(Module nextModule, RandomValueGenerator randomValueGenerator, GlobalStatistics globalStatistics, int maxSize, Simulation simulation) {
        super(nextModule, randomValueGenerator, globalStatistics, maxSize, simulation);
        this.queryCount = 0;
        this.executingDDL = false;
        Comparator<Query> comparator = new QueryComparator();
        this.setQueue(new PriorityQueue<>(maxSize, comparator));
    }

    @Override
    public void reset() {
        queryCount = 0;
        executingDDL = false;
        getQueue().clear();
    }

    @Override
    public void checkForTimeout() {

        List<Query> queryList = new LinkedList<>();

        // Check each query in the queue.
        for (Query query : getQueue()) {

            // If the timeout is smaller than the running time, it means the query expired.
            if (query.getTimeout() < getGlobalStatistics().getTimeRunning()) {

                // Now we need to make sure to consider the time the query was on the module, as well as the queue, which should be the same.
                // Since what we have in the timeout variable, is the ending time of the query, we can simply add it as the actual time.
                getGlobalStatistics().getTransactionModule().addQueryToExecution(query, query.getTimeout());
                getGlobalStatistics().getTransactionModule().addAverageTime(query, query.getTimeout());

                // Also, we are going to modify the global statistics.
                getGlobalStatistics().addExecutedQuery();
                getGlobalStatistics().addQueryTime(query.getTimeout()-query.getInitialTime());

                // Now we need to add it to our list in order to later delete it.
                queryList.add(query);

            }
        }

        // Remove the query from the queue.
        for (Query query: queryList) {
            getQueue().remove(query);
            // Reduce the number of connections by one.
            getSimulation().reduceConnections();
        }
    }

    @Override
    public void receiveQuery(Query query) {

        // Reset our query module statistics.
        query.resetQueryModuleStats();

        // Set the initial time in the module of the query.
        query.setInitialTimeInModule(getGlobalStatistics().getTimeRunning());

        // Check if the number of running queries is small than the maximum possible number.
        // Also, check that there is no DDL in execution or there is no DDL query waiting in the queue.
        if(getQueue().peek() == null) {

            // Add the new event.
            addQuery(query);

        } else if(queryCount < getMaxSize() && !executingDDL && getQueue().peek().getQueryType() != QueryType.DDL) {

            // Check if the new query is a DDL. If so, we need to add it to the queue and wait for everything else to finish.
            // We also need to make sure that there is no other query being executed, otherwise we can't go in.
            if(query.getQueryType() == QueryType.DDL && queryCount > 0) {
                // Add it to the queue and set the query initial time in queue.
                query.setInitialTimeInQueue(getGlobalStatistics().getTimeRunning());
                getQueue().add(query);
            } else {

                // Add the new event.
                addQuery(query);

            }

        } else {
            // Add it to the queue and set the query initial time in queue.
            query.setInitialTimeInQueue(getGlobalStatistics().getTimeRunning());
            getQueue().add(query);
        }


    }

    @Override
    public void sendQuery(Query query) {

        // Add to the module statistics the life time of the last query in this module.
        getGlobalStatistics().getTransactionModule().addAverageTime(query, getGlobalStatistics().getTimeRunning());

        // Check that the query's connection time has not expired.
        if(query.getTimeout() >= getGlobalStatistics().getTimeRunning()) {
            // Simply send it to the next module if everything is ok.
            getNextModule().receiveQuery(query);
        } else {
            getSimulation().reduceConnections();
        }

        // First, lets check that we don't have expired queries.
        checkForTimeout();

        // Check if the next query is a DDL. If so, we need to make sure that the query count is 0.
        if(getQueue().peek() != null && getQueue().peek().getQueryType() == QueryType.DDL && queryCount > 1) {

            // If this is the case, simply reduce the number of queries in execution.
            // This is needed, because we need to wait until we have no more queries running
            // in order to run a DDL query.
            queryCount--;
        } else {

            // Get the next query.
            Query queuedQuery = getQueue().poll();

            // Check that the queue is not empty.
            if(queuedQuery != null) {

                // First, we need to see how much time it is required to coordinate the query concurrence.
                double queryTime = getRandomValueGenerator().generateValueTransactionCoordination(getMaxSize());

                // Save the number of blocks needed for the query, in the query.
                queuedQuery.setNumBlocks(getBlocksFromDisk(queuedQuery));

                // Now, we need to check how much time we need to load the needed blocks from disk.
                queryTime += getRandomValueGenerator().generateValueLoadBlocks(queuedQuery.getNumBlocks());

                // Now we need to add the new event to the event queue.
                getSimulation().getEventQueue().add(new Event(EventType.CONCURRENCE_COORDINATION,
                        getGlobalStatistics().getTimeRunning(),
                        getGlobalStatistics().getTimeRunning()+queryTime,
                        queuedQuery));

            } else {
                // If it is, simply reduce the number of queries that are being executed.
                queryCount--;
            }
        }

    }

    /**
     * Auxiliary function that will add a query to execution or the queue.
     * @param query Query to be added.
     */
    private void addQuery(Query query) {

        // Check that if we have a DDL query, then in order to enter, there must be no running queries.
        if(query.getQueryType() == QueryType.DDL && queryCount > 0) {

            query.setInitialTimeInQueue(getGlobalStatistics().getTimeRunning());
            getQueue().add(query);

        } else {

            // Add to the query count.
            queryCount++;

            // First, we need to see how much time it is required to coordinate the query concurrence.
            double queryTime = getRandomValueGenerator().generateValueTransactionCoordination(getMaxSize());

            // Save the number of blocks needed for the query, in the query.
            query.setNumBlocks(getBlocksFromDisk(query));

            // Now, we need to check how much time we need to load the needed blocks from disk.
            queryTime += getRandomValueGenerator().generateValueLoadBlocks(query.getNumBlocks());

            // Now we need to add the new event to the event queue.
            getSimulation().getEventQueue().add(new Event(EventType.CONCURRENCE_COORDINATION,
                    getGlobalStatistics().getTimeRunning(),
                    getGlobalStatistics().getTimeRunning() + queryTime,
                    query));
        }
    }


    /**
     * Determine how many blocks we should be loading from disk, depending on the query type.
     * @param query Query that will be needing the blocks.
     * @return Number of blocks loaded from disk.
     */
    private int getBlocksFromDisk(Query query) {
        // For each possible type of query, add the actual time minus the queries' initial time in module.
        switch(query.getQueryType()) {
            case SELECT:
                return 1;
            case UPDATE:
                return 0;
            case DDL:
                return 0;
            case JOIN:
                return getRandomValueGenerator().generateValueUniformInt(1,64);
        }

        // If not of any of those types, return 0.
        return 0;
    }

    public int getQueueSize() {
        return getQueue().size();
    }
}
