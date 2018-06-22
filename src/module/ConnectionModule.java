package module;

import event.Event;
import event.EventType;
import query.Query;
import randomvaluegenarator.RandomValueGenerator;
import simulation.Simulation;
import statistics.GlobalStatistics;

import java.util.LinkedList;

public class ConnectionModule extends Module {

    // Maximum amount of time that a query can be in our system.
    private double timeout;
    // Number of connections that has been rejected.
    private int connectionsRejected;
    // Number of connections.
    private int numberOfConnections;

    public ConnectionModule(Module nextModule, RandomValueGenerator randomValueGenerator, GlobalStatistics globalStatistics, int maxSize, Simulation simulation, double timeout) {
        super(nextModule, randomValueGenerator, globalStatistics, maxSize, simulation);
        this.timeout = timeout;
        this.connectionsRejected = 0;
        this.numberOfConnections = 0;
    }


    @Override
    public void checkForTimeout() {
        // The connection module doesn't have a queue, so we don't do anything here.
    }

    @Override
    public void reset() {
        connectionsRejected = 0;
        numberOfConnections = 0;
    }

    @Override
    public void receiveQuery(Query query) {

        // Reset our query module statistics.
        query.resetQueryModuleStats();

        // Set the initial time in the module of the query.
        query.setInitialTimeInModule(getGlobalStatistics().getTimeRunning());

        // Now we need to check how much time we will need send the blocks through the network.
        double queryTime = getRandomValueGenerator().generateValueReturnResults(query.getNumBlocks());

        // Now we need to create the event.
        getSimulation().getEventQueue().add(new Event(EventType.RETURN_RESULTS,
                getGlobalStatistics().getTimeRunning(),
                getGlobalStatistics().getTimeRunning()+queryTime,
                query));


    }

    @Override
    public void sendQuery(Query query) {

        // Increase the number of received connections.
        this.getGlobalStatistics().addTotalConnections();

        if(numberOfConnections < getMaxSize()) {
            numberOfConnections++;
            query.resetQueryModuleStats();
            getNextModule().receiveQuery(query);
        } else {
            // This particular event doesn't create any other event, because the query was never accepted.
            getGlobalStatistics().addConnectionRejected();
            connectionsRejected++;
        }
    }

    /**
     * Reduce the number of connections by one.
     */
    public void reduceConnections() {
        numberOfConnections--;
    }

    public int getConnectionsRejected() {
        return connectionsRejected;
    }
}
