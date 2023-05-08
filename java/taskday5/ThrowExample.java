package taskday5;

public class ThrowExample {

	
	    public static void main(String[] args) {
	        try {
	            int result = divide(10, 0);
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }

	    public static int divide(int dividend, int divisor) {
	        if (divisor == 0) {
	            throw new ArithmeticException("The number is divided by zero.");
	        }

	        return dividend / divisor;
	    }
	

}
