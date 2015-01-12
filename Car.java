/**
 * 
 */

/**
 * @author majo0485
 *
 */




public class Car {

    private int bornTime;
    private int dest; // 1 för rakt fram, 2 för vänstersväng

    // konstruktor och get-metoder
    public Car(int bornTime, int dest){
    	this.bornTime	= bornTime;
    	this.dest			= dest;
    }
    
    public int getBornTime(){
    	return this.bornTime;
    }
    
    public int getDestination(){
    	return this.dest;
    }
    
    public String toString() {
    	return "Car(bornTime=" + bornTime + ", dest=" + dest + ")";
    }
	
}
