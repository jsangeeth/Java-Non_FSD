package customexception;

public class Main {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int limit = 25;

		try {
			int sum = a + b;

			if (sum > limit) {
				throw new CustomException("Sum exceeds limit of " + limit);
			}

			System.out.println("Sum of " + a + " and " + b + " is " + sum);
		} catch (CustomException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
