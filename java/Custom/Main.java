package Custom;

public class Main {
	public static void main(String[] args) throws CustomLimitException {
	    int a = 10;
	    int b = 20;
	    int limit = 25;

	    int sum = a + b;

	    if (sum > limit) {
	        throw new CustomLimitException("Sum exceeds limit of " + limit);
	    }

	    System.out.println("Sum of " + a + " and " + b + " is " + sum);
	}
}
