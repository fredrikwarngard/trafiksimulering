import java.util.Properties;
import java.io.FileInputStream;

/**
 * 
 */

/**
 * @author majo0485
 *
 */


public class TrafficSystem {
    // Definierar de vägar och signaler som ingår i det 
    // system som skall studeras.
    // Samlar statistik
    
    // Attribut som beskriver beståndsdelarna i systemet
    private Lane  startLane;
    private Lane  laneToDest1;
    private Lane  laneToDest2;
    private Light light1;
    private Light light2;

    // Diverse attribut för simuleringsparametrar (ankomstintensiteter,
    // destinationer...)
    private int arrivalIntensity;
    private int laneChoice;
    
    // Diverse attribut för statistiksamling
    
    private int time = 0; 

    public TrafficSystem() {
    	readParameters();
    }

    public void readParameters() {
	// Läser in parametrar för simuleringen
	// Metoden kan läsa från terminalfönster, dialogrutor
	// eller från en parameterfil. Det sista alternativet
	// är att föredra vid uttestning av programmet eftersom
	// man inte då behöver mata in värdena vid varje körning.
        // Standardklassen Properties är användbar för detta.
    	Properties parameters = new Properties();
    	parameters.load(new FileInputStream("simulation.properties"));
    	startLane = new Lane(Integer.parseInt(parameters.getProperty("startLane")));
    	laneToDest1 = new Lane(Integer.parseInt(parameters.getProperty("turnLanes")));
    	laneToDest2 = new Lane(Integer.parseInt(parameters.getProperty("turnLanes")));
    	int period = Integer.parseInt(parameters.getProperty("period"));
    	int green  = Integer.parseInt(parameters.getProperty("greenTime1"));
    	light1 = new Light(period, green);
    	green = Integer.parseInt(parameters.getProperty("greenTime2"));
    	light2 = new Light(period, green);
    	arrivalIntensity = Integer.parseInt(parameters.getProperty("arrivalIntensity"));
    }

    public void step() {
	// Stega systemet ett tidssteg m h a komponenternas step-metoder
	// Skapa bilar, lägg in och ta ur på de olika Lane-kompenenterna
    	time++;
    }

    public void printStatistics() {
	// Skriv statistiken samlad så här långt
    }

    public void print() {
	// Skriv ut en grafisk representation av kösituationen
	// med hjälp av klassernas toString-metoder
    }

}
