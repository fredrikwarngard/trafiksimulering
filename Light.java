/**
 * 
 */

/**
 * @author majo0485
 *
 */




public class Light {
    private int period;
    private int time;  // Intern klocka: 0, 1, ... period-1, 0, 1 ...
    private int greenLight; // Signalen grön när time<green 

    public Light(int period, int green) {
    	this.period = period;
    	this.time = 0;
    	if(green < period){
	    this.greenLight  = green;
    	}
    	else {
	    // throw exception     INVALID PARAMETERS
	}
    }
    public void step() { 
	// Stegar fram klocka ett steg
	if(time < period - 1)
	    ++this.time;
	else
	    this.time = 0;
    }
    
    public boolean isGreen()   {
    	return this.time < this.greenLight;
    }
    
    public String toString()  {
    	return "Light(period=" + this.period + ", time=" + this.time + ", green=" + this.greenLight + ")";
    }
    
}
