/**
 * 
 */

/**
 * @author majo0485
 *
 */



public class Lane {

    public static class OverflowException extends RuntimeException {
        // Undantag som kastas n�r det inte gick att l�gga 
        // in en ny bil p� v�gen
    }

    private Car[] theLane;

    public Lane(int n) {
	// Konstruerar ett Lane-objekt med plats f�r n fordon
    	theLane = new Car[n];
    }

    public void step() {
	// Stega fram alla fordon (utom det p� plats 0) ett steg 
        // (om det g�r). (Fordonet p� plats 0 tas bort utifr�n 
	// mm h a metoden nedan.)
    	for(int i = 0; i < theLane.length - 1; ++i){
    		if(theLane[i] == null){
    			theLane[i] = theLane[i+1];
    			theLane[i+1] = null;
    		}
    	}
    }

    public Car getFirst() {
	// Returnera och tag bort bilen som st�r f�rst
    	Car first = theLane[0];
    	theLane[0] = null;
    	return first;
    }

    public Car firstCar() {
	// Returnera bilen som st�r f�rst utan att ta bort den
    	return theLane[0];
    }


    public boolean lastFree() {
	// Returnera true om sista platsen ledig, annars false
    	return theLane[theLane.length - 1] == null;
    }

    public void putLast(Car c) throws OverflowException {
	// St�ll en bil p� sista platsen p� v�gen
	// (om det g�r).
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


///STARTINGLANE EXTENDS LANE HAR �VEN CONNECTION SOM �R EN KOPPLING TILL N�STA LANE????
