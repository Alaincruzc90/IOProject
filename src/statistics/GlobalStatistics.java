package statistics;

/**
 * Class where all our global statistics will be keep in.
 */
public class GlobalStatistics {

    // Total time that the simulation has been running.
    private double timeRunning;
    // Total number of connections that the system received.
    private int totalConnectionsReceived;
    // Number of connections that has been rejected.
    private int connectionsRejected;
    // Given that we need to calculate the average life of a query, we need to know how much time have been used to execute queries
    // and how many queries have been executed. For this, we will save both stats in two variables, one that will be a double
    // to save the time that has been used and a integer to keep the number of queries executed.
    private double queryTime;
    private int queriesExecuted;
    // Module statistics for each one of our modules.
    private ModuleStatistics connectionModule;
    private ModuleStatistics executionModule;
    private ModuleStatistics transactionModule;
    private ModuleStatistics queryModule;
    private ModuleStatistics processModule;


    public GlobalStatistics() {
        this.timeRunning = 0;
        this.totalConnectionsReceived = 0;
        this.connectionsRejected = 0;
        this.queryTime = 0;
        this.queriesExecuted = 0;
        this.connectionModule = new ModuleStatistics();
        this.executionModule = new ModuleStatistics();
        this.transactionModule = new ModuleStatistics();
        this.queryModule = new ModuleStatistics();
        this.processModule = new ModuleStatistics();
    }

    /**
     * Return the average life of a query in our simulation.
     * @return Average life of query.
     */
    public double averageQueryLife() {
        return queryTime/queriesExecuted;
    }


    /**
     * Reset our statistics, so that we can start a new simulation.
     */
    public void reset() {
        this.timeRunning = 0;
        this.totalConnectionsReceived = 0;
        this.connectionsRejected = 0;
        this.queryTime = 0;
        this.queriesExecuted = 0;
        this.connectionModule.reset();
        this.executionModule.reset();
        this.transactionModule.reset();
        this.queryModule.reset();
        this.processModule.reset();
    }

    /**
     * Increase the number of queries that has been executed.
     */
    public void addExecutedQuery() {
        this.queriesExecuted++;
    }

    /**
     * Add one more connection to our connections rejected count.
     */
    public void addConnectionRejected(){
        connectionsRejected++;
    }

    /**
     * Add more query execution time.
     * @param time Time that will be added.
     */
    public void addQueryTime(double time) {
        this.queryTime += time;
    }

    /**
     * Add a new connection received.
     */
    public void addTotalConnections() { this.totalConnectionsReceived++; }


    public double getTimeRunning() {
        return timeRunning;
    }

    public void setTimeRunning(double timeRunning) {
        this.timeRunning = timeRunning;
    }

    public int getTotalConnectionsReceived() {
        return totalConnectionsReceived;
    }

    public int getConnectionsRejected() {
        return connectionsRejected;
    }

    public void setConnectionsRejected(int connectionsRejected) {
        this.connectionsRejected = connectionsRejected;
    }

    public double getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(double queryTime) {
        this.queryTime = queryTime;
    }

    public int getQueriesExecuted() {
        return queriesExecuted;
    }

    public void setQueriesExecuted(int queriesExecuted) {
        this.queriesExecuted = queriesExecuted;
    }

    public ModuleStatistics getConnectionModule() {
        return connectionModule;
    }

    public void setConnectionModule(ModuleStatistics connectionModule) {
        this.connectionModule = connectionModule;
    }

    public ModuleStatistics getExecutionModule() {
        return executionModule;
    }

    public void setExecutionModule(ModuleStatistics executionModule) {
        this.executionModule = executionModule;
    }

    public ModuleStatistics getTransactionModule() {
        return transactionModule;
    }

    public void setTransactionModule(ModuleStatistics transactionModule) {
        this.transactionModule = transactionModule;
    }

    public ModuleStatistics getQueryModule() {
        return queryModule;
    }

    public void setQueryModule(ModuleStatistics queryModule) {
        this.queryModule = queryModule;
    }

    public ModuleStatistics getProcessModule() {
        return processModule;
    }

    public void setProcessModule(ModuleStatistics processModule) {
        this.processModule = processModule;
    }
}
