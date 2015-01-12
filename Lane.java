/**
 * 
 */

/**
 * @author majo0485
 *
 */



public class Lane {

    public static class OverflowException extends RuntimeException {
        // Undantag som kastas när det inte gick att lägga 
        // in en ny bil på vägen
    }

    private Car[] theLane;

    public Lane(int n) {
	// Konstruerar ett Lane-objekt med plats för n fordon
    	theLane = new Car[n];
    }

    public void step() {
	// Stega fram alla fordon (utom det på plats 0) ett steg 
        // (om det går). (Fordonet på plats 0 tas bort utifrån 
	// mm h a metoden nedan.)
    	for(int i = 0; i < theLane.length - 1; ++i){
    		if(theLane[i] == null){
    			theLane[i] = theLane[i+1];
    			theLane[i+1] = null;
    		}
    	}
    }

    public Car getFirst() {
	// Returnera och tag bort bilen som står först
    	Car first = theLane[0];
    	theLane[0] = null;
    	return first;
    }

    public Car firstCar() {
	// Returnera bilen som står först utan att ta bort den
    	return theLane[0];
    }


    public boolean lastFree() {
	// Returnera true om sista platsen ledig, annars false
    	return theLane[theLane.length - 1] == null;
    }

    public void putLast(Car c) throws OverflowException {
	// Ställ en bil på sista platsen på vägen
	// (om det går).
    	if(lastFree()){
    		theLane[theLane.length - 1] = c;
    	}
    	else{
    		// throw shit
    	}
    }

    public String toString() {
    	return "theLane="+ theLane;
    }

}


///STARTINGLANE EXTENDS LANE HAR ÄVEN CONNECTION SOM ÄR EN KOPPLING TILL NÄSTA LANE????
