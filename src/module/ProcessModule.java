package module;

import event.Event;
import event.EventType;
import query.Query;
import randomvaluegenarator.RandomValueGenerator;
import simulation.Simulation;
import statistics.GlobalStatistics;

import java.util.LinkedList;
import java.util.List;

public class ProcessModule extends Module {

    private boolean queryInExecution;

    public ProcessModule(Module nextModule, RandomValueGenerator randomValueGenerator, GlobalStatistics globalStatistics, int maxSize, Simulation simulation) {
        super(nextModule, randomValueGenerator, globalStatistics, maxSize, simulation);
        setQueue(new LinkedList<>());
        this.queryInExecution = false;
    }


    @Override
    public void reset() {
        queryInExecution = false;
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
                getGlobalStatistics().getProcessModule().addQueryToExecution(query, query.getTimeout());
                getGlobalStatistics().getProcessModule().addAverageTime(query, query.getTimeout());

                // Also, we are going to modify the global statistics.
                getGlobalStatistics().addExecutedQuery();
                getGlobalStatistics().addQueryTime(query.getTimeout()-query.getInitialTime());

                // Reduce the number of connections by one.
                getSimulation().reduceConnections();

                // Now we need to add it to our list in order to later delete it.
                queryList.add(query);

            }
        }

        for (Query query: queryList) {getQueue().remove(query);}
    }

    @Override
    public void receiveQuery(Query query) {

        // Reset our query module statistics.
        query.resetQueryModuleStats();

        // Set the initial time in the module of the query.
        query.setInitialTimeInModule(getGlobalStatistics().getTimeRunning());

        // Check if we are not trying to create another thread for another query.
        if(!queryInExecution) {

            // Toggle the query in execution variable.
            queryInExecution = true;

            // Time that takes to create a thread.
            double threadCreationTime = getRandomValueGenerator().generateValueNormal(1, 0.01);

            // New event that will be sent to the event queue.
            getSimulation().getEventQueue().add(new Event(EventType.THREAD_CONNECTION,
                    getGlobalStatistics().getTimeRunning(),
                    getGlobalStatistics().getTimeRunning()+threadCreationTime,
                    query));
        } else {

            // If there is another query waiting for a thread, then add it to our queue.
            getQueue().add(query);

            // Also, add the time when the query was added to the queue. This is needed for the simulation statistics.
            query.setInitialTimeInQueue(getGlobalStatistics().getTimeRunning());
        }
    }

    @Override
    public void sendQuery(Query query) {

        // Add to the module statistics the life time of the last query in this module.
        getGlobalStatistics().getProcessModule().addAverageTime(query, getGlobalStatistics().getTimeRunning());

        // Check that the query's connection time has not expired.
        if(query.getTimeout() >= getGlobalStatistics().getTimeRunning()) {
            // Simply send it to the next module if everything is ok.
            getNextModule().receiveQuery(query);
        }

        // First, lets check that we don't have expired queries.
        checkForTimeout();

        // Get the next queue. If we receive a null, then we know is empty.
        Query queuedQuery = getQueue().poll();

        // If not null, then add a new Thread Connection event.
        if(queuedQuery != null) {

            getGlobalStatistics().getProcessModule().addQueryToExecution(queuedQuery, getGlobalStatistics().getTimeRunning());

            // Time that takes to create a thread.
            double threadCreationTime = getRandomValueGenerator().generateValueNormal(1, 0.01);

            // New Thread Connection event.
            getSimulation().getEventQueue().add(new Event(EventType.THREAD_CONNECTION,
                    getGlobalStatistics().getTimeRunning(),
                    getGlobalStatistics().getTimeRunning()+threadCreationTime,
                    query));

        } else {
            // If the queue is empty, simply allow more queries to be executed.
            queryInExecution = false;
        }

    }
}
