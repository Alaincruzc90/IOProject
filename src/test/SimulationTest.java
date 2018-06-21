package test;

import simulation.Simulation;

public class SimulationTest {

    public static void main(String args[]) {
        Simulation simulation = new Simulation(100,2,15,2, 2, 1, 15, true);
        simulation.runSimulation();
    }
}
