package graphicaluserinterface;

import simulation.Simulation;

public class GUIController {

    /*SIMULATION PARAMETERS*/
    //True if the simulation initial configuration was established.
    private boolean configSet = false;
    //Number of times the simulation will be run.
    private int repetitions = 0;
    //Total time in seconds to run each simulation (Maximum time).
    private double simulationTime = 0;
    //True if the simulation has to run in slowMode.
    private boolean slowMode = false;
    //The number of concurrent connections that the system can handle (k).
    private int concurrentConnections = 0;
    //The number of processes available for the processing of concurrent queries that the system can handle (n).
    private int processingAvailableProcesses = 0;
    //The number of processes available for the execution of transactions (p).
    private int transactionsAvailableProcesses = 0;
    //The number of processes available to execute queries (m).
    private int executionAvailableProcesses = 0;
    //The timeout in seconds of the connections (t).
    private double timeOut = 0;
    //Simulation.
    private Simulation simulation;
    //Simulation window.
    private SimulationWindow simulationWindow;
    //True if there's an update available for the GUI update.
    private boolean available = false;

    //Simulation parameters to display on the GUI.
    private int runNumber = 1;
    private int execModQueueLength = 0;
    private int transacModQueueLength = 0;
    private int queryModQueueLength = 0;
    private int processModQueueLength = 0;
    private int serverRejectedConnnections = 0;

    //Run stats to display after a repetition.
    private int numberOfUpdates = 0;
    private int execModRunTotal = 0;
    private int transacModRunTotal = 0;
    private int querycModRunTotal = 0;
    private int processModRunTotal = 0;

    //Simulation stats to display on the final stats window.
    private double execModAvgTotal = 0;
    private double transacModAvgTotal = 0;
    private double querycModAvgTotal = 0;
    private double processModAvgTotal = 0;
    private double connectionAvgLifeTime = 0;
    private int totalRejectedConnections = 0;
    private double ddlAvgTimeExec = 0;
    private double ddlAvgTimeTrans = 0;
    private double ddlAvgTimeQuery = 0;
    private double ddlAvgTimeProcess = 0;
    private double updateAvgTimeExec = 0;
    private double updateAvgTimeTrans = 0;
    private double updateAvgTimeQuery = 0;
    private double updateAvgTimeProcess = 0;
    private double joinAvgTimeExec = 0;
    private double joinAvgTimeTrans = 0;
    private double joinAvgTimeQuery = 0;
    private double joinAvgTimeProcess = 0;
    private double selectAvgTimeExec = 0;
    private double selectAvgTimeTrans = 0;
    private double selectAvgTimeQuery = 0;
    private double selectAvgTimeProcess = 0;
    
    
    public boolean getConfigSet() {
        return configSet;
    }

    public void setConfigSet() {
        configSet = true;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public double getSimulationTime() {
        return simulationTime;
    }

    public void setSimulationTime(double simulationTime) {
        this.simulationTime = simulationTime;
    }

    public boolean getSlowMode() {
        return slowMode;
    }

    public void setSlowMode(boolean value) {
        slowMode = value;
    }

    public int getConcurrentConnections() {
        return concurrentConnections;
    }

    public void setConcurrentConnections(int concurrentConnections) {
        this.concurrentConnections = concurrentConnections;
    }

    public int getProcessingAvailableProcesses() {
        return processingAvailableProcesses;
    }

    public void setProcessingAvailableProcesses(int processingAvailableProcesses) {
        this.processingAvailableProcesses = processingAvailableProcesses;
    }

    public int getTransactionsAvailableProcesses() {
        return transactionsAvailableProcesses;
    }

    public void setTransactionsAvailableProcesses(int transactionsAvailableProcesses) {
        this.transactionsAvailableProcesses = transactionsAvailableProcesses;
    }

    public int getExecutionAvailableProcesses() {
        return executionAvailableProcesses;
    }

    public void setExecutionAvailableProcesses(int executionAvailableProcesses) {
        this.executionAvailableProcesses = executionAvailableProcesses;
    }

    public double getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(double timeOut) {
        this.timeOut = timeOut;
    }

    public Simulation getSimulation() {
        return this.simulation;
    }

    /*
    ** Creates a start window.
    */
    public void startGUI() {
        StartWindow startWindow = new StartWindow();
        startWindow.setController(this);
        startWindow.setVisible(true);
    }

    /*
    ** Start the simulation thread and the simulation window thread.
    */
    public void startSimulation() {

        this.simulationWindow = new SimulationWindow();
        simulationWindow.setController(this);
        simulationWindow.setVisible(true);

        this.simulation = new Simulation(simulationTime, repetitions, concurrentConnections, processingAvailableProcesses, transactionsAvailableProcesses, executionAvailableProcesses, timeOut, true);
        this.simulation.setGUIController(this);

        //Start the GUI thread.
        simulationWindow.simulationThreadStart();
        //Start simulation thread.
        simulation.start();
    }

    /*
    ** Update the simulation values to display on the simulation window, wait if there's an update that the GUI hasn't show.
    ** @param runNumber The number of the running repetition.
    ** @param execModQueueLength The current length of the execution module.
    ** @param transacModQueueLength The current length of the transaction module.
    ** @param queryModQueueLength The current length of the query module .
    ** @param processModQueueLength The current length of the process module.
    ** @param serverRejectedConnnections The current number of rejected connections.
    */
    synchronized public void setSimParams(int runNumber, int execModQueueLength, int transacModQueueLength, int queryModQueueLength, int processModQueueLength, int serverRejectedConnnections) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        this.runNumber = runNumber;
        this.execModQueueLength = execModQueueLength;
        this.transacModQueueLength = transacModQueueLength;
        this.queryModQueueLength = queryModQueueLength;
        this.processModQueueLength = processModQueueLength;
        this.serverRejectedConnnections = serverRejectedConnnections;
        ++numberOfUpdates;
        execModRunTotal += execModQueueLength;
        transacModRunTotal += transacModQueueLength;
        querycModRunTotal += queryModQueueLength;
        processModRunTotal += processModQueueLength;

        available = true;
        notifyAll();
    }

    /*
    ** Get the values to display, wait if there's no update.
    ** @return new SimulationParams.
    */
    synchronized public SimulationParams getSimParams() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        available = false;
        notifyAll();
        return new SimulationParams(runNumber, execModQueueLength, transacModQueueLength, queryModQueueLength, processModQueueLength, serverRejectedConnnections);
    }

    /*
    ** Creates a window to display the repetition statistics, then reset them.
    ** @param connectionAverageLifeTime Connection average life time.
    ** @param avgDDLExec Average time of DDL sentences in the Execution Module.
    ** @param avgDDLTrans Average time of DDL sentences in the Transaction Module.
    ** @param avgDDLQuery Average time of DDL sentences in the Query Module.
    ** @param avgDDLProcess Average time of DDL sentences in the Process Module.
    ** @param avgUpdateExec Average time of UPDATE sentences in the Execution Module.
    ** @param avgUpdateTrans Average time of UPDATE sentences in the Transaction Module.
    ** @param avgUpdateaQuery Average time of UPDATE sentences in the Query Module.
    ** @param avgUpdateProcess Average time of UPDATE sentences in the Process Module.
    ** @param avgJoinExec Average time of JOIN sentences in the Execution Module.
    ** @param avgJoinTrans Average time of JOIN sentences in the Transaction Module.
    ** @param avgJoinQuery Average time of JOIN sentences in the Query Module.
    ** @param avgJoinProcess Average time of JOIN sentences in the Process Module
    ** @param avgSelectExec Average time of SELECT sentences in the Execution Module.
    ** @param avgSelectTrans Average time of SELECT sentences in the Transaction Module.
    ** @param avgSelectQuery Average time of SELECT sentences in the Query Module.
    ** @param avgSelectProcess Average time of SELECT sentences in the Process Module.
    */
    synchronized public int displayRunStatsWindow(double connectionAverageLifeTime, double avgDDLExec, double avgDDLTrans, double avgDDLQuery, double avgDDLProcess, double avgUpdateExec, double avgUpdateTrans, double avgUpdateaQuery, double avgUpdateProcess, double avgJoinExec, double avgJoinTrans, double avgJoinQuery, double avgJoinProcess, double avgSelectExec, double avgSelectTrans, double avgSelectQuery, double avgSelectProcess) {
        RunStatsWindow runStatistics = new RunStatsWindow();
        runStatistics.setVisible(true);
        runStatistics.setStats(runNumber, execModRunTotal / numberOfUpdates, transacModRunTotal / numberOfUpdates, querycModRunTotal / numberOfUpdates, processModRunTotal / numberOfUpdates, serverRejectedConnnections, connectionAverageLifeTime, avgDDLExec, avgDDLTrans, avgDDLQuery, avgDDLProcess, avgUpdateExec, avgUpdateTrans, avgUpdateaQuery, avgUpdateProcess, avgJoinExec, avgJoinTrans, avgJoinQuery, avgJoinProcess, avgSelectExec, avgSelectTrans, avgSelectQuery, avgSelectProcess);
        /*Save the simulation stats*/
        execModAvgTotal += execModRunTotal / numberOfUpdates;
        transacModAvgTotal += transacModRunTotal / numberOfUpdates;
        querycModAvgTotal += querycModRunTotal / numberOfUpdates;
        processModAvgTotal += processModRunTotal / numberOfUpdates;
        if(!(Double.isNaN(connectionAverageLifeTime))) {
            connectionAvgLifeTime += connectionAverageLifeTime;
        }
        if(!(Double.isNaN(serverRejectedConnnections))){
            totalRejectedConnections += serverRejectedConnnections;
        }
        if(!(Double.isNaN(avgDDLExec))){
            ddlAvgTimeExec += avgDDLExec;
        }
        if(!(Double.isNaN(avgDDLTrans))){
            ddlAvgTimeTrans += avgDDLTrans;
        }
        if(!(Double.isNaN(avgDDLQuery))){
            ddlAvgTimeQuery += avgDDLQuery;
        }
        if(!(Double.isNaN(avgDDLProcess))){
            ddlAvgTimeProcess += avgDDLProcess;
        }
        if(!(Double.isNaN(avgUpdateExec))){
            updateAvgTimeExec += avgUpdateExec;
        }
        if(!(Double.isNaN(avgUpdateTrans))){
            updateAvgTimeTrans += avgUpdateTrans;
        }
        if(!(Double.isNaN(avgUpdateaQuery))){
            updateAvgTimeQuery += avgUpdateaQuery;
        }
        if(!(Double.isNaN(avgUpdateProcess))){
            updateAvgTimeProcess += avgUpdateProcess;
        }
        if(!(Double.isNaN(avgJoinExec))){
            joinAvgTimeExec += avgJoinExec;
        }
        if(!(Double.isNaN(avgJoinTrans))){
            joinAvgTimeTrans += avgJoinTrans;
        }
        if(!(Double.isNaN(avgJoinQuery))){
            joinAvgTimeQuery += avgJoinQuery;
        }
        if(!(Double.isNaN(avgJoinProcess))){
            joinAvgTimeProcess += avgJoinProcess;
        }
        if(!(Double.isNaN(avgSelectExec))){
            selectAvgTimeExec += avgSelectExec;
        }
        if(!(Double.isNaN(avgSelectTrans))){
            selectAvgTimeTrans += avgSelectTrans;
        }
        if(!(Double.isNaN(avgSelectQuery))){
            selectAvgTimeQuery += avgSelectQuery;
        }
        if(!(Double.isNaN(avgSelectProcess))){
            selectAvgTimeProcess += avgSelectProcess;
        }
        /*Reset the run stats*/
        execModRunTotal = 0;
        transacModRunTotal = 0;
        querycModRunTotal = 0;
        processModRunTotal = 0;
        numberOfUpdates = 0;

        return 1;
    }

    /*
    ** Creates a new window to display the general simulation statistics, after display the last repetition.
    */
    public int displayFinalStatsWindow() {
        this.simulationWindow.dispose();
        FinalStatsWindow finalStatistics = new FinalStatsWindow();
        finalStatistics.setController(this);
        finalStatistics.setVisible(true);
        finalStatistics.setFinalStats(repetitions, execModAvgTotal / repetitions, transacModAvgTotal / repetitions, querycModAvgTotal / repetitions, processModAvgTotal / repetitions, connectionAvgLifeTime / repetitions, totalRejectedConnections / repetitions, ddlAvgTimeExec / repetitions, ddlAvgTimeTrans / repetitions, ddlAvgTimeQuery / repetitions, ddlAvgTimeProcess / repetitions, updateAvgTimeExec / repetitions, updateAvgTimeTrans / repetitions, updateAvgTimeQuery / repetitions, updateAvgTimeProcess / repetitions, joinAvgTimeExec / repetitions, joinAvgTimeTrans / repetitions, joinAvgTimeQuery / repetitions, joinAvgTimeProcess / repetitions, selectAvgTimeExec / repetitions, selectAvgTimeTrans / repetitions, selectAvgTimeQuery / repetitions, selectAvgTimeProcess / repetitions);
        return 1;
    }
    
    /*
    ** Restarts the parameters to repeat the same simulation.
    */
    public void restartSameSimulation() {
        available = false;
        runNumber = 1;
        execModQueueLength = 0;
        transacModQueueLength = 0;
        queryModQueueLength = 0;
        processModQueueLength = 0;
        serverRejectedConnnections = 0;
        numberOfUpdates = 0;
        execModRunTotal = 0;
        transacModRunTotal = 0;
        querycModRunTotal = 0;
        processModRunTotal = 0;
        execModAvgTotal = 0;
        transacModAvgTotal = 0;
        querycModAvgTotal = 0;
        processModAvgTotal = 0;
        connectionAvgLifeTime = 0;
        totalRejectedConnections = 0;
        ddlAvgTimeExec = 0;
        ddlAvgTimeTrans = 0;
        ddlAvgTimeQuery = 0;
        ddlAvgTimeProcess = 0;
        updateAvgTimeExec = 0;
        updateAvgTimeTrans = 0;
        updateAvgTimeQuery = 0;
        updateAvgTimeProcess = 0;
        joinAvgTimeExec = 0;
        joinAvgTimeTrans = 0;
        joinAvgTimeQuery = 0;
        joinAvgTimeProcess = 0;
        selectAvgTimeExec = 0;
        selectAvgTimeTrans = 0;
        selectAvgTimeQuery = 0;
        selectAvgTimeProcess = 0;
        this.startGUI();
    }

    /*
    ** Restarts all the simulation parameters.
    */
    public void restartNewSimulation() {
        configSet = false;
        repetitions = 0;
        simulationTime = 0;
        slowMode = false;
        concurrentConnections = 0;
        processingAvailableProcesses = 0;
        transactionsAvailableProcesses = 0;
        executionAvailableProcesses = 0;
        timeOut = 0;
        available = false;
        runNumber = 1;
        execModQueueLength = 0;
        transacModQueueLength = 0;
        queryModQueueLength = 0;
        processModQueueLength = 0;
        serverRejectedConnnections = 0;
        numberOfUpdates = 0;
        execModRunTotal = 0;
        transacModRunTotal = 0;
        querycModRunTotal = 0;
        processModRunTotal = 0;
        execModAvgTotal = 0;
        transacModAvgTotal = 0;
        querycModAvgTotal = 0;
        processModAvgTotal = 0;
        connectionAvgLifeTime = 0;
        totalRejectedConnections = 0;
        ddlAvgTimeExec = 0;
        ddlAvgTimeTrans = 0;
        ddlAvgTimeQuery = 0;
        ddlAvgTimeProcess = 0;
        updateAvgTimeExec = 0;
        updateAvgTimeTrans = 0;
        updateAvgTimeQuery = 0;
        updateAvgTimeProcess = 0;
        joinAvgTimeExec = 0;
        joinAvgTimeTrans = 0;
        joinAvgTimeQuery = 0;
        joinAvgTimeProcess = 0;
        selectAvgTimeExec = 0;
        selectAvgTimeTrans = 0;
        selectAvgTimeQuery = 0;
        selectAvgTimeProcess = 0;
        this.startGUI();
    }
}
