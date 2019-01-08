

/**
 * 
 * @author acer
 *
 */
public class RestaMulti {
	
	public static double suma(double a, double b) {
		return a + b;
	}
	
	
	public static double resta(double a, double b) {
		return a - b;
	}
	
	public static double multiplicacion(double a, double b) {
		double r = 0;
		if((a<0 && b<0) || (a>0 && b>0)) {
			for (int i = 0; i < Math.abs(b); i++) {
				r = suma(r, Math.abs(a));
			}
		}else {
			if (a<0 || b<0) {
				for (int i = 0; i < Math.abs(b); i++ ) {
					r = resta(r, Math.abs(a));
				}
			}
		}
		return r;
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(multiplicacion(2, -2));
	} 

}
