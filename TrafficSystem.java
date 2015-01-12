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
    // Definierar de v�gar och signaler som ing�r i det 
    // system som skall studeras.
    // Samlar statistik
    
    // Attribut som beskriver best�ndsdelarna i systemet
    private Lane  startLane;
    private Lane  laneToDest1;
    private Lane  laneToDest2;
    private Light light1;
    private Light light2;

    // Diverse attribut f�r simuleringsparametrar (ankomstintensiteter,
    // destinationer...)
    private int arrivalIntensity;
    private int laneChoice;
    
    // Diverse attribut f�r statistiksamling
    
    private int time = 0; 

    public TrafficSystem() {
    	readParameters();
    }

    public void readParameters() {
	// L�ser in parametrar f�r simuleringen
	// Metoden kan l�sa fr�n terminalf�nster, dialogrutor
	// eller fr�n en parameterfil. Det sista alternativet
	// �r att f�redra vid uttestning av programmet eftersom
	// man inte d� beh�ver mata in v�rdena vid varje k�rning.
        // Standardklassen Properties �r anv�ndbar f�r detta.
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
	// Skapa bilar, l�gg in och ta ur p� de olika Lane-kompenenterna
    	time++;
    }

    public void printStatistics() {
	// Skriv statistiken samlad s� h�r l�ngt
    }

    public void print() {
	// Skriv ut en grafisk representation av k�situationen
	// med hj�lp av klassernas toString-metoder
    }

}
