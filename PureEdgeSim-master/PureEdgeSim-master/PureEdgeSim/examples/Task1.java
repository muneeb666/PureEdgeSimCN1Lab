package examples;


import com.mechalikh.pureedgesim.simulationcore.Simulation;

public class Task1 {
	/**
	 * This is a simple example showing how to launch simulation using a custom
	 * mobility model. by removing it, pureEdgeSim will use the default model. As
	 * you can see, this class extends the Main class provided by PureEdgeSim, which
	 * is required for this example to work
	 */

	public static void main(String[] args) {		
		//Create a PureEdgeSim simulation
		Simulation sim = new Simulation();

		/*
		 * To use your custom mobility model, do this: The custom mobility manager class
		 * can be found in the examples folder as well. by removing this line,
		 * pureEdgeSim will use the default mobility model.
		 */
		sim.setCustomMobilityModel(CustomMobilityManager.class);

		// To use the PureEdgeSim default Mobility Manager you can also uncomment this:
		// setCustomMobilityModel(MobilityManager.class);

		// Start the simulation
		sim.launchSimulation();
	}
}


