package module;

import event.Event;
import query.Query;
import randomvaluegenarator.RandomValueGenerator;
import simulation.Simulation;
import statistics.GlobalStatistics;

import java.util.List;
import java.util.Queue;

public abstract class Module {

    // Next module that we need to send the query to.
    private Module nextModule;
    // Object that generates our random values.
    private RandomValueGenerator randomValueGenerator;
    // Object where all our statistics will be saved to.
    private GlobalStatistics globalStatistics;
    // Number of maximum queries per queue.
    private int maxSize;
    // Queue of queries.
    private Queue<Query> queue;
    // Simulation.
    private Simulation simulation;

    Module(Module nextModule, RandomValueGenerator randomValueGenerator, GlobalStatistics globalStatistics, int maxSize, Simulation simulation) {
        this.nextModule = nextModule;
        this.randomValueGenerator = randomValueGenerator;
        this.globalStatistics = globalStatistics;
        this.maxSize = maxSize;
        this.simulation = simulation;
    }


    /**
     * Reset all our internal variables so that we can start another simulation.
     */
    public abstract void reset();

    /**
     * Check the queue for queries that are expired.
     */
    public abstract void checkForTimeout();

    /**
     * Function that represents a module receiving a query and then return an event with the time that it will take to be executed.
     * @param query Query that is being receive.
     */
    public abstract void receiveQuery(Query query);

    /**
     * Function that represents a module sending a query to another module and then return an event with the time that it will take to be executed.
     * @param query Query that is being send.
     */
    public abstract void sendQuery(Query query);


    public Module getNextModule() {
        return nextModule;
    }

    public void setNextModule(Module nextModule) {
        this.nextModule = nextModule;
    }

    public RandomValueGenerator getRandomValueGenerator() {
        return randomValueGenerator;
    }

    public void setRandomValueGenerator(RandomValueGenerator randomValueGenerator) {
        this.randomValueGenerator = randomValueGenerator;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public Queue<Query> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Query> queue) {
        this.queue = queue;
    }

    public GlobalStatistics getGlobalStatistics() {
        return globalStatistics;
    }

    public void setGlobalStatistics(GlobalStatistics globalStatistics) {
        this.globalStatistics = globalStatistics;
    }

    public Simulation getSimulation() {
        return simulation;
    }

    public void setSimulation(Simulation simulation) {
        this.simulation = simulation;
    }
}
