package taskday5;

import java.util.Scanner;

public class InvalidInput {

	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a positive integer: ");
		try (Scanner sc = new Scanner(System.in);) {
			int input = Integer.parseInt(sc.nextLine());
			if (input <= 0) {
				throw new IllegalArgumentException("Input must be a positive integer");
			}
			System.out.println("You entered: " + input);
		} catch (NumberFormatException e) {
			System.err.println("Invalid input format: " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}

}
