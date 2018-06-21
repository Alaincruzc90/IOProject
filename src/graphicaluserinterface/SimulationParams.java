package graphicaluserinterface;

public class SimulationParams {

    private int runNumber =0;
    private int execModQueueLength = 0;
    private int transacModQueueLength = 0;
    private int queryModQueueLength = 0;
    private int processModQueueLength = 0;
    private int serverRejectedConnnections = 0;

    public SimulationParams(int runNumber, int exec, int transac, int query, int process, int server) {
        this.runNumber=runNumber;
        this.execModQueueLength = exec;
        this.transacModQueueLength = transac;
        this.queryModQueueLength = query;
        this.processModQueueLength = process;
        this.serverRejectedConnnections = server;
    }

    public int getRunNumber() {
        return runNumber;
    }
    
    public int getexecModQueueLength() {
        return execModQueueLength;
    }

    public int gettransacModQueueLength() {
        return transacModQueueLength;
    }

    public int getqueryModQueueLength() {
        return queryModQueueLength;
    }

    public int getprocessModQueueLength() {
        return processModQueueLength;
    }

    public int getserverRejectedConnnections() {
        return serverRejectedConnnections;
    }
}
