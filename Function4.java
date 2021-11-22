
/**
 * Task #4 Add the fourth function
 * @author Yana
 *
 */
public class Function4 extends Function {

	/**
	 * fnValue
	 * @param x the x value at which f(x) will be evaluated
	 * @return a double f(x) value
	 */
	@Override
	public double fnValue(double x) {
		return (Math.pow(x,3) - (7*Math.pow(x,2)) + 15*x - 9);
		// estimate: the f(x) value is 0 when x=1
	}
	
	
	/**
	 * toString
	 * @return a string 	
	 */
	public String toString () {
		return "(x^3 - 7*x^2 + 15*x - 9";
	}

}