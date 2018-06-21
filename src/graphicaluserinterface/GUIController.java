package graphicaluserinterface;

import javax.swing.JOptionPane;
import simulation.Simulation;

public class GUIController {

    /*SIMULATION PARAMETERS*/
    //True if the simulation initial configuration was established
    private boolean configSet = false;
    //Number of times the simulation will be run
    private int repetitions = 0;
    //Total time in seconds to run each simulation (Maximum time)
    private double simulationTime = 0;
    //True if the simulation has to run in slowMode
    private boolean slowMode = false;
    //The number of concurrent connections that the system can handle (k)
    private int concurrentConnections = 0;
    //The number of processes available for the processing of concurrent queries that the system can handle (n)
    private int processingAvailableProcesses = 0;
    //The number of processes available for the execution of transactions (p)
    private int transactionsAvailableProcesses = 0;
    //The number of processes available to execute queries (m)
    private int executionAvailableProcesses = 0;
    //The timeout in seconds of the connections (t)
    private double timeOut = 0;
    //Simulation
    private Simulation simulation;
    //Simulation window
    private SimulationWindow simulationWindow;

    private boolean available = false;

    private boolean runStatsAvailable = false;

    //Simulation parameters
    private int runNumber = 1;
    private int execModQueueLength = 0;
    private int transacModQueueLength = 0;
    private int queryModQueueLength = 0;
    private int processModQueueLength = 0;
    private int serverRejectedConnnections = 0;

    /*Run stats*/
    private int numberOfUpdates = 0;
    private int execModRunTotal = 0;
    private int transacModRunTotal = 0;
    private int querycModRunTotal = 0;
    private int processModRunTotal = 0;

    /*Simulation stats*/
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

    public void startGUI() {
        StartWindow startWindow = new StartWindow();
        startWindow.setController(this);
        startWindow.setVisible(true);
    }

    public void startSimulation() {

        this.simulationWindow = new SimulationWindow();
        simulationWindow.setController(this);
        simulationWindow.setVisible(true);

        this.simulation = new Simulation(simulationTime, repetitions, concurrentConnections, processingAvailableProcesses, transactionsAvailableProcesses, executionAvailableProcesses, timeOut, true);
        this.simulation.setGUIController(this);

        //Start the GUI thread
        simulationWindow.simulationThreadStart();
        //Start simulation
        simulation.start();
    }

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

    /*Metodo a llamar cada vez que se termine una corrida de la simulación*/
    synchronized public int displayRunStatsWindow(double connectionAverageLifeTime, double avgDDLExec, double avgDDLTrans, double avgDDLQuery, double avgDDLProcess, double avgUpdateExec, double avgUpdateTrans, double avgUpdateaQuery, double avgUpdateProcess, double avgJoinExec, double avgJoinTrans, double avgJoinQuery, double avgJoinProcess, double avgSelectExec, double avgSelectTrans, double avgSelectQuery, double avgSelectProcess) {
        RunStatsWindow runStatistics = new RunStatsWindow();
        runStatistics.setVisible(true);
        runStatistics.setStats(runNumber, execModRunTotal / numberOfUpdates, transacModRunTotal / numberOfUpdates, querycModRunTotal / numberOfUpdates, processModRunTotal / numberOfUpdates, serverRejectedConnnections, connectionAverageLifeTime, avgDDLExec, avgDDLTrans, avgDDLQuery, avgDDLProcess, avgUpdateExec, avgUpdateTrans, avgUpdateaQuery, avgUpdateProcess, avgJoinExec, avgJoinTrans, avgJoinQuery, avgJoinProcess, avgSelectExec, avgSelectTrans, avgSelectQuery, avgSelectProcess);
        /*Save the simulation stats*/
        execModAvgTotal += execModRunTotal / numberOfUpdates;
        transacModAvgTotal += transacModRunTotal / numberOfUpdates;
        querycModAvgTotal += querycModRunTotal / numberOfUpdates;
        processModAvgTotal += processModRunTotal / numberOfUpdates;
        connectionAvgLifeTime += connectionAverageLifeTime;
        totalRejectedConnections += serverRejectedConnnections;
        ddlAvgTimeExec += avgDDLExec;
        ddlAvgTimeTrans += avgDDLTrans;
        ddlAvgTimeQuery += avgDDLQuery;
        ddlAvgTimeProcess += avgDDLProcess;
        updateAvgTimeExec += avgUpdateExec;
        updateAvgTimeTrans += avgUpdateTrans;
        updateAvgTimeQuery += avgUpdateaQuery;
        updateAvgTimeProcess += avgUpdateProcess;
        joinAvgTimeExec += avgJoinExec;
        joinAvgTimeTrans += avgJoinTrans;
        joinAvgTimeQuery += avgJoinQuery;
        joinAvgTimeProcess += avgJoinProcess;
        selectAvgTimeExec += avgSelectExec;
        selectAvgTimeTrans += avgSelectTrans;
        selectAvgTimeQuery += avgSelectQuery;
        selectAvgTimeProcess += avgSelectProcess;
        /*Reset the run stats*/
        execModRunTotal = 0;
        transacModRunTotal = 0;
        querycModRunTotal = 0;
        processModRunTotal = 0;
        numberOfUpdates = 0;
        
        return 1;
    }

    /*Metodo a llamar cuando la simulación terminó todas sus corridas*/
    public int displayFinalStatsWindow() {
        this.simulationWindow.dispose();
        /*ToDo metodo para establecer los valores que le manda la simulación*/
        FinalStatsWindow finalStatistics = new FinalStatsWindow();
        finalStatistics.setVisible(true);
        finalStatistics.setFinalStats(repetitions,execModAvgTotal/repetitions, transacModAvgTotal/repetitions, querycModAvgTotal/repetitions, processModAvgTotal/repetitions, connectionAvgLifeTime/repetitions, totalRejectedConnections/repetitions, ddlAvgTimeExec/repetitions, ddlAvgTimeTrans/repetitions, ddlAvgTimeQuery/repetitions, ddlAvgTimeProcess/repetitions, updateAvgTimeExec/repetitions, updateAvgTimeTrans/repetitions, updateAvgTimeQuery/repetitions, updateAvgTimeProcess/repetitions, joinAvgTimeExec/repetitions, joinAvgTimeTrans/repetitions, joinAvgTimeQuery/repetitions, joinAvgTimeProcess/repetitions, selectAvgTimeExec/repetitions, selectAvgTimeTrans/repetitions, selectAvgTimeQuery/repetitions, selectAvgTimeProcess/repetitions);
        return 1;
    }
}
