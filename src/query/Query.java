package query;

/**
 * Object that represents a query in our DBMS.
 */
public class Query {

    // Type of query.
    private QueryType queryType;
    // Time when the query arrived in our system.
    private double initialTime;
    // Time when our query was added to a module.
    private double initialTimeInModule;
    // Initial time that our query was added to a queue.
    private double initialTimeInQueue;
    // Maximum time that the query can be in the system before being dropped.
    private double timeout;
    // Blocks to load
    private int numBlocks;

    public Query(QueryType queryType, double initialTime, double timeout) {
        this.queryType = queryType;
        this.initialTime = initialTime;
        this.initialTimeInModule = 0;
        this.initialTimeInQueue = 0;
        this.timeout = timeout;
        numBlocks = 0;
    }

    /**
     * Reset the variables used to calculate module statistics.
     */
    public void resetQueryModuleStats() {
        this.initialTimeInModule = 0;
        this.initialTimeInQueue = 0;
    }

    public QueryType getQueryType() {
        return queryType;
    }

    public void setQueryType(QueryType queryType) {
        this.queryType = queryType;
    }

    public double getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(double initialTime) {
        this.initialTime = initialTime;
    }

    public double getInitialTimeInModule() {
        return initialTimeInModule;
    }

    public void setInitialTimeInModule(double initialTimeInModule) {
        this.initialTimeInModule = initialTimeInModule;
    }

    public double getInitialTimeInQueue() {
        return initialTimeInQueue;
    }

    public void setInitialTimeInQueue(double initialTimeInQueue) {
        this.initialTimeInQueue = initialTimeInQueue;
    }

    public double getTimeout() {
        return timeout;
    }

    public void setTimeout(double timeout) {
        this.timeout = timeout;
    }

    public int getNumBlocks() {
        return numBlocks;
    }

    public void setNumBlocks(int numBlocks) {
        this.numBlocks = numBlocks;
    }

}
