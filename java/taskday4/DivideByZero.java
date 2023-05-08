package taskday4;

public class DivideByZero {

	    public static void main(String[] args) {
	        int numerator = 10;
	        int denominator = 0;

	        try {
	            int result = numerator / denominator;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	           
	            System.out.println("Enter a valid integer it Cannot divide by zero!");
	        }
	    }
	

}
