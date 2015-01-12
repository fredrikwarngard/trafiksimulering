/**
 * 
 */

/**
 * @author majo0485
 *
 */



public class Simulation {
    
    /**
     * @param args
     */
    public static void main(String [] args) {
	// Skapar ett TrafficSystem
	// Utför stegningen, anropar utskriftsmetoder
	TrafficSystem ts = new TrafficSystem();
	int simulationLength = Integer.parseInt(args[0]);
	for(int i = 0; i < simulationLength; i++){
	    ts.step();
	}
	ts.printStatistics();
    }
    
}
