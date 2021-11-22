
/**
 * Task# 3 Add the fifth function
 * @author Yana	
 *
 */
public class Function5 extends Function {
	
	
	/**
	 * fnValue
	 * @param x the x value at which f(x) will be evaluated
	 * @return a double f(x) value
	 */
	@Override
	public double fnValue(double x) {
		return Math.sin(1/x);
		// estimate: when x=0, the function does not exist infinity because the function is not continuous
	}
	
	
	/**
	 * toString
	 * @return a string 	
	 */
	public String toString() {
		return "sin(1/x)";
	}

}