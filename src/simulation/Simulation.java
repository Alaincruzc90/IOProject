package simulation;

import event.Event;
import event.EventComparator;
import event.EventType;
import module.*;
import query.Query;
import randomvaluegenarator.RandomValueGenerator;
import statistics.GlobalStatistics;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Simulation {

    // Seconds to run the simulation.
    private double maxTime;
    // Max number of seconds that a query can stay in a system.
    private double timeout;
    // Number of repetitions required.
    private int repetitions;
    // Event queue.
    private Queue<Event> eventQueue;
    // Global statistics.
    private GlobalStatistics globalStatistics;
    // Random value generator.
    private RandomValueGenerator randomValueGenerator;
    // Modules.
    private ConnectionModule connectionModule;
    private ProcessModule processModule;
    private TransactionModule transactionModule;
    private QueryModule queryModule;
    private ExecutionModule executionModule;
    // Merely a option to allow printing in console each action and different stats.
    private boolean printable;

    /**
     * Class constructor.
     * @param maxTime Seconds that will be running the simulation.
     * @param repetitions Number of repetitions.
     * @param k Max number of concurrent connections.
     * @param n Max number of queries that can be analyzed concurrently.
     * @param p Max numbers of transactions that can be checked concurrently.
     * @param m Max numbers of queries that can be executed at a time.
     * @param timeout Seconds that a query can be alive in the simulation.
     */
    public Simulation(double maxTime, int repetitions, int k, int n, int p, int m, double timeout, boolean printable) {

        this.maxTime = maxTime;
        this.timeout = timeout;
        this.repetitions = repetitions;
        this.globalStatistics = new GlobalStatistics();
        this.randomValueGenerator = new RandomValueGenerator();
        this.printable = printable;
        Comparator<Event> comparator = new EventComparator();
        this.eventQueue = new PriorityQueue<>(k, comparator);

        this.connectionModule = new ConnectionModule(null, randomValueGenerator, globalStatistics, k, this, timeout);
        this.processModule = new ProcessModule(null, randomValueGenerator, globalStatistics, 0, this);
        this.queryModule = new QueryModule(null, randomValueGenerator, globalStatistics, n, this);
        this.transactionModule = new TransactionModule(null, randomValueGenerator, globalStatistics, p, this);
        this.executionModule = new ExecutionModule(null, randomValueGenerator, globalStatistics, m, this);

        connectionModule.setNextModule(processModule);
        processModule.setNextModule(queryModule);
        queryModule.setNextModule(transactionModule);
        transactionModule.setNextModule(executionModule);
        executionModule.setNextModule(connectionModule);
    }


    /**
     * Function that will control what happen with each event.
     */
    public void runSimulation() {

        for(int i = 0; i <= repetitions; i++) {

            // Let's first reset everything.
            reset();

            // Let's add a first event of type connection arrival.
            Query arrivalQuery = createQuery(0);
            Event arrivalEvent = new Event(EventType.CONNECTION_ARRIVAL, 0, 0, arrivalQuery);
            eventQueue.add(arrivalEvent);

            while(globalStatistics.getTimeRunning() <= maxTime) {

                if(globalStatistics.getTimeRunning()>600) {
                    String hola = "";
                }

                // Let's get the event.
                Event event = eventQueue.poll();
                // Now we need to change the actual time of our simulation.
                globalStatistics.setTimeRunning(event.getEndTime());
                // Now let's continue the simulation.
                decideAction(event);
            }

        }
    }


    /**
     * Auxiliary function that will control what happens when a event is poll from the event queue.
     * @param event New event.
     */
    private void decideAction(Event event) {

        // If printable is set to true, print to console.
        if(printable) printMoment(event);

        switch (event.getEventType()) {
            case CONNECTION_ARRIVAL:

                // First, we need to create a new connection arrival event.
                // For this, we must create a new query.
                Query newQuery = createQuery(globalStatistics.getTimeRunning());

                // Now we need to check when will a new connection arrive.
                double arrivalTime = randomValueGenerator.generateRandomValueExponential(2);

                // Now we need to create a new event and add it to the queue.
                Event newEvent = new Event(EventType.CONNECTION_ARRIVAL, globalStatistics.getTimeRunning(), globalStatistics.getTimeRunning() + arrivalTime, newQuery);
                eventQueue.add(newEvent);

                // Now we need to tell the connection module that a new connection arrived.
                connectionModule.sendQuery(event.getQuery());
                break;

            case THREAD_CONNECTION:
                processModule.sendQuery(event.getQuery());
                break;

            case CONCURRENCE_COORDINATION:
                transactionModule.sendQuery(event.getQuery());
                break;

            case QUERY_VALIDATION:
                queryModule.sendQuery(event.getQuery());
                break;

            case QUERY_EXECUTION:
                executionModule.sendQuery(event.getQuery());
                break;

            case RETURN_RESULTS:

                // Check that the query's connection time has not expired.
                if(event.getQuery().getTimeout() >= globalStatistics.getTimeRunning()) {

                    // Now, we need to close the connection, and also, modify the average life time of a query.
                    // First, let's save the query in a variable.
                    Query query = event.getQuery();

                    // Now let's calculate how much time it took to finish.
                    double finishTime = globalStatistics.getTimeRunning() - query.getInitialTime();

                    // Now let's modify the data to calculate the average life time of a query.
                    globalStatistics.addExecutedQuery();
                    globalStatistics.addQueryTime(finishTime);

                    // Now close the connection.
                    connectionModule.reduceConnections();

                } else {

                    // Just close the connection.
                    connectionModule.reduceConnections();

                }

                break;
        }

    }

    /**
     * Reduce the number of connections by one.
     */
    public void reduceConnections() {
        connectionModule.reduceConnections();
    }

    /**
     * Auxiliary function that will create a new query when a connection arrives.
     * @param actualTime Actual time in our simulation.
     * @return New query.
     */
    private Query createQuery(double actualTime) {
        return new Query(randomValueGenerator.generateValueMonteCarlo(), actualTime, actualTime+timeout);
    }

    /**
     * Print various stats of the simulation status.
     * @param event Event that just finished.
     */
    private void printMoment(Event event) {
        System.out.println("Even type: " + event.getEventType() + ". Actual time: " + globalStatistics.getTimeRunning() + ". Query type: " + event.getQuery().getQueryType());
    }

    /**
     * Reset everything, so that we can star a new.
     */
    private void reset() {
        eventQueue.clear();
        globalStatistics.reset();
        connectionModule.reset();
        processModule.reset();
        transactionModule.reset();
        queryModule.reset();
        executionModule.reset();
    }

    public Queue<Event> getEventQueue() {
        return eventQueue;
    }
    
    public int getConnectionModuleLength() {
        if(connectionModule.getQueue()!=null){
            return connectionModule.getQueue().size();
        }
        else{
            return 0;
        }
    }
}
