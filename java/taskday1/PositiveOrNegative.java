package taskday1;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {

		/*
		 * Write a program that takes an integer as input and prints whether it is
		 * positive, negative, or zero.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number = ");
		int a = sc.nextInt();

		// int a = 12;

		if (a > 0) {
			System.out.println(a + " is Positive");
		} else if (a < 0) {
			System.out.println(a + " is Negative");
		} else {
			System.out.println(a + " is Zero");
		}
	}

}
