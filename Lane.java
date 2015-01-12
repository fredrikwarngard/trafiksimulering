/**
 * 
 */

/**
 * @author majo0485
 *
 */

public class Lane {
    public Car[] theLane;             //SKA VARA PRIVATE
    
    
    //static class OverflowException extends RuntimeException {
    // Undantag som kastas n�r det inte gick att l�gga in en ny bil p� v�gen
    //}
    
    public Lane () {
    }
    
    public Lane(int length) {
	// Konstruerar ett Lane-objekt med plats f�r n fordon
	
	// throw {
	//         IllegalParameterArgument()
	//       }
    	theLane = new Car[length];
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

    public void putLast(Car c)/* throws OverflowException*/ {
	// St�ll en bil p� sista platsen p� v�gen (om det g�r).
    	if(lastFree()){
	    theLane[theLane.length - 1] = c;
    	} else {
	    // throw shit
    	}
    }
    
    public String toString() {
	return "theLane="+ theLane;
    }
   
    
    private class StartingLane extends Lane {
	Lane forkingPath1;
	Lane forkingPath2;
	
	//Car [] theLane;
	//	StartingLane() {
	//}
    
	StartingLane(int length, Lane left, Lane right) {
	    super(length);
	    this.forkingPath1 = left;
	    this.forkingPath2 = right;
	}
    }
}

///STARTINGLANE EXTENDS LANE HAR �VEN CONNECTION SOM �R EN KOPPLING TILL N�STA LANE????
