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
    
    public static class BadLightException extends IllegalArgumentException {
        // Undantag som kastas när lysets gröntid är längre än totaltiden
    }


    public Light(int period, int green) {
	if ((greenLight < period) != true) {
	    //  EXCEPTION!!! 	    // throw badLightException     INVALID PARAMETERS
	} else { // construct fo' real
	    
	    this.period = period;
	    this.time = 0;
	    this.greenLight  = green;
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
