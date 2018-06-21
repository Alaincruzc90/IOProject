package statistics;

import query.Query;

/**
 * Class with the statistics associated to a respective module.
 */
public class ModuleStatistics {

    // Variables used to calculate the average life of a select query in our module.
    private double selectExecutionTime;
    private int selectsExecuted;
    // Variables used to calculate the average life of a update query in our module.
    private double updateExecutionTime;
    private int updatesExecuted;
    // Variables used to calculate the average life of a ddl query in our module.
    private double ddlExecutionTime;
    private int ddlExecuted;
    // Variables used to calculate the average life of a join query in our module.
    private double joinExecutionTime;
    private int joinsExecuted;
    // Variables used to calculate the average wait time in a queue in each module.
    private double queriesTimeInQueue;
    private int queriesFromQueue;


    ModuleStatistics() {
        this.selectExecutionTime = 0;
        this.selectsExecuted = 0;
        this.updateExecutionTime = 0;
        this.updatesExecuted = 0;
        this.ddlExecutionTime = 0;
        this.ddlExecuted = 0;
        this.joinExecutionTime = 0;
        this.joinsExecuted = 0;
        this.queriesTimeInQueue = 0;
        this.queriesFromQueue = 0;
    }


    /**
     * Reset our variables, so that we can start another simulation.
     */
    public void reset() {
        this.selectExecutionTime = 0;
        this.selectsExecuted = 0;
        this.updateExecutionTime = 0;
        this.updatesExecuted = 0;
        this.ddlExecutionTime = 0;
        this.ddlExecuted = 0;
        this.joinExecutionTime = 0;
        this.joinsExecuted = 0;
        this.queriesTimeInQueue = 0;
        this.queriesFromQueue = 0;
    }

    /**
     * Calculate the average life of a select query in our module.
     * @return Average life time of a select.
     */
    public double selectAverageTime(){
        return selectExecutionTime/selectsExecuted;
    }

    /**
     * Calculate the average life of an update query in our module.
     * @return Average life time of an update.
     */
    public double updateAverageTime(){
        return updateExecutionTime/updatesExecuted;
    }

    /**
     * Calculate the average life of a DDL query in our module.
     * @return Average life time of a DDL.
     */
    public double ddlAverageTime(){
        return ddlExecutionTime/ddlExecuted;
    }

    /**
     * Calculate the average life of a join query in our module.
     * @return Average life time of a join.
     */
    public double joinAverageTime(){
        return joinExecutionTime/joinsExecuted;
    }

    /**
     * Given a query, we need to check how much time it has been in our module and then add it to it's respective category.
     * @param query Query that was executed.
     */
    public void addAverageTime(Query query, double actualTime){

        // For each possible type of query, add the actual time minus the queries' initial time in module.
        switch(query.getQueryType()) {
            case SELECT:
                this.selectExecutionTime += actualTime - query.getInitialTimeInModule();
                this.selectsExecuted++;
                break;
            case UPDATE:
                this.updateExecutionTime += actualTime - query.getInitialTimeInModule();
                this.updatesExecuted++;
                break;
            case DDL:
                this.ddlExecutionTime += actualTime - query.getInitialTimeInModule();
                this.ddlExecuted++;
                break;
            case JOIN:
                this.joinExecutionTime += actualTime - query.getInitialTimeInModule();
                this.joinsExecuted++;
                break;
        }
    }

    /**
     * Given a query, check how much time it was on a queue and then add it to our average queue life.
     * @param query Query that was added to execution.
     */
    public void addQueryToExecution(Query query, double actualTime){
        this.queriesTimeInQueue += actualTime - query.getInitialTimeInQueue();
        this.queriesFromQueue++;
    }

    public double getSelectExecutionTime() {
        return selectExecutionTime;
    }

    public void setSelectExecutionTime(double selectExecutionTime) {
        this.selectExecutionTime = selectExecutionTime;
    }

    public int getSelectsExecuted() {
        return selectsExecuted;
    }

    public void setSelectsExecuted(int selectsExecuted) {
        this.selectsExecuted = selectsExecuted;
    }

    public double getUpdateExecutionTime() {
        return updateExecutionTime;
    }

    public void setUpdateExecutionTime(double updateExecutionTime) {
        this.updateExecutionTime = updateExecutionTime;
    }

    public int getUpdatesExecuted() {
        return updatesExecuted;
    }

    public void setUpdatesExecuted(int updatesExecuted) {
        this.updatesExecuted = updatesExecuted;
    }

    public double getDdlExecutionTime() {
        return ddlExecutionTime;
    }

    public void setDdlExecutionTime(double ddlExecutionTime) {
        this.ddlExecutionTime = ddlExecutionTime;
    }

    public int getDdlExecuted() {
        return ddlExecuted;
    }

    public void setDdlExecuted(int ddlExecuted) {
        this.ddlExecuted = ddlExecuted;
    }

    public double getJoinExecutionTime() {
        return joinExecutionTime;
    }

    public void setJoinExecutionTime(double joinExecutionTime) {
        this.joinExecutionTime = joinExecutionTime;
    }

    public int getJoinsExecuted() {
        return joinsExecuted;
    }

    public void setJoinsExecuted(int joinsExecuted) {
        this.joinsExecuted = joinsExecuted;
    }

    public double getQueriesTimeInQueue() {
        return queriesTimeInQueue;
    }

    public void setQueriesTimeInQueue(double queriesTimeInQueue) {
        this.queriesTimeInQueue = queriesTimeInQueue;
    }

    public int getQueriesFromQueue() {
        return queriesFromQueue;
    }

    public void setQueriesFromQueue(int queriesFromQueue) {
        this.queriesFromQueue = queriesFromQueue;
    }
}
