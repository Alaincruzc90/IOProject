package module;

import event.Event;
import event.EventType;
import query.Query;
import randomvaluegenarator.RandomValueGenerator;
import simulation.Simulation;
import statistics.GlobalStatistics;

import java.util.LinkedList;
import java.util.List;

public class QueryModule extends Module {

    // Number of queries that are being analyzed.
    private int queryCount;

    public QueryModule(Module nextModule, RandomValueGenerator randomValueGenerator, GlobalStatistics globalStatistics, int maxSize, Simulation simulation) {
        super(nextModule, randomValueGenerator, globalStatistics, maxSize, simulation);
        this.queryCount = 0;
        setQueue(new LinkedList<>());
    }

    @Override
    public void reset() {
        getQueue().clear();
        queryCount = 0;
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
                getGlobalStatistics().getQueryModule().addQueryToExecution(query, query.getTimeout());
                getGlobalStatistics().getQueryModule().addAverageTime(query, query.getTimeout());

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

            // Now we need to see how much time it will be needed to analyze the query.
            // First, we do the lexical validation.
            double queryTime = getRandomValueGenerator().getLexValidation();
            // Syntax validation.
            queryTime += getRandomValueGenerator().generateValueUniform(0,1);
            // Semantic validation.
            queryTime += getRandomValueGenerator().generateValueUniform(0,2);
            // Permission validations.
            queryTime +=  getRandomValueGenerator().generateRandomValueExponential(0.7);
            // Query optimization.
            queryTime += getRandomValueGenerator().generateRandomValueQueryOptimization(query.getQueryType());

            // Now we need to create the event.
            getSimulation().getEventQueue().add(new Event(EventType.QUERY_VALIDATION,
                    getGlobalStatistics().getTimeRunning(),
                    getGlobalStatistics().getTimeRunning()+queryTime,
                    query));

        } else {

            // Add the query to the queue and set it's initial time in queued.
            getQueue().add(query);
            query.setInitialTimeInQueue(getGlobalStatistics().getTimeRunning());

        }

    }

    @Override
    public void sendQuery(Query query) {

        // Add to the module statistics the life time of the last query in this module.
        getGlobalStatistics().getQueryModule().addAverageTime(query, getGlobalStatistics().getTimeRunning());

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
            getGlobalStatistics().getQueryModule().addQueryToExecution(queuedQuery, getGlobalStatistics().getTimeRunning());

            // Now we need to see how much time it will be needed to analyze the query.
            // First, we do the lexical validation.
            double queryTime = getRandomValueGenerator().getLexValidation();
            // Syntax validation.
            queryTime += getRandomValueGenerator().generateValueUniform(0,1);
            // Semantic validation.
            queryTime += getRandomValueGenerator().generateValueUniform(0,2);
            // Permission validations.
            queryTime +=  getRandomValueGenerator().generateRandomValueExponential(0.7);
            // Query optimization.
            queryTime += getRandomValueGenerator().generateRandomValueQueryOptimization(queuedQuery.getQueryType());

            // Now we need to create the event.
            getSimulation().getEventQueue().add(new Event(EventType.QUERY_VALIDATION,
                    getGlobalStatistics().getTimeRunning(),
                    getGlobalStatistics().getTimeRunning()+queryTime,
                    queuedQuery));

        } else {
            // Reduce the number of running queries.
            queryCount--;
        }

    }


}
