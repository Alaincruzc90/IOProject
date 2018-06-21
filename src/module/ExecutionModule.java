package module;

import event.Event;
import event.EventType;
import query.Query;
import randomvaluegenarator.RandomValueGenerator;
import simulation.Simulation;
import statistics.GlobalStatistics;

import java.util.LinkedList;
import java.util.List;

public class ExecutionModule extends Module {

    // Number of queries that are being analyzed.
    private int queryCount;

    public ExecutionModule(Module nextModule, RandomValueGenerator randomValueGenerator, GlobalStatistics globalStatistics, int maxSize, Simulation simulation) {
        super(nextModule, randomValueGenerator, globalStatistics, maxSize, simulation);
        this.queryCount = 0;
        setQueue(new LinkedList<>());
    }

    @Override
    public void reset() {
        queryCount = 0;
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
                getGlobalStatistics().getExecutionModule().addQueryToExecution(query, query.getTimeout());
                getGlobalStatistics().getExecutionModule().addAverageTime(query, query.getTimeout());

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

        // Check that we are not processing more queries than we are allow to.
        if(queryCount < getMaxSize()) {

            // Add to the query count.
            queryCount++;

            // Now we need to check how much time we will need to load the blocks and how much time it will need to
            // execute the query, depending on the type of the query.
            double queryTime = getRandomValueGenerator().generateValueExecuteQuery(query.getQueryType(), query.getNumBlocks());

            // Now we need to create the event.
            getSimulation().getEventQueue().add(new Event(EventType.QUERY_EXECUTION,
                    getGlobalStatistics().getTimeRunning(),
                    getGlobalStatistics().getTimeRunning()+queryTime,
                    query));

        } else {

            // Add the query to the queue and set it's initial time in queued.
            query.setInitialTimeInQueue(getGlobalStatistics().getTimeRunning());
            getQueue().add(query);

        }

    }

    @Override
    public void sendQuery(Query query) {

        // Add to the module statistics the life time of the last query in this module.
        getGlobalStatistics().getExecutionModule().addAverageTime(query, getGlobalStatistics().getTimeRunning());

        // Check that the query's connection time has not expired.
        if(query.getTimeout() >= getGlobalStatistics().getTimeRunning()) {
            // Simply send it to the next module if everything is ok.
            getNextModule().receiveQuery(query);
        } else {
            getSimulation().reduceConnections();
        }

        // First, lets check that we don't have expired queries.
        checkForTimeout();

        // Get the next element from the queue.
        Query queuedQuery = getQueue().poll();

        if(queuedQuery != null) {

            // Modify the average wait time in the queue.
            getGlobalStatistics().getExecutionModule().addQueryToExecution(queuedQuery, getGlobalStatistics().getTimeRunning());

            // Now we need to check how much time we will need to load the blocks and how much time it will need to
            // execute the query, depending on the type of the query.
            double queryTime = getRandomValueGenerator().generateValueExecuteQuery(queuedQuery.getQueryType(), queuedQuery.getNumBlocks());

            // Now we need to create the event.
            getSimulation().getEventQueue().add(new Event(EventType.QUERY_EXECUTION,
                    getGlobalStatistics().getTimeRunning(),
                    getGlobalStatistics().getTimeRunning()+queryTime,
                    queuedQuery));

        } else {
            // Reduce the number of running queries.
            queryCount--;
        }

    }

    public int getQueueSize() {
        return getQueue().size();
    }
}
