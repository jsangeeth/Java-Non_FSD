package taskday1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		/*
		 * Write a program that takes an integer as input and prints the factorial of
		 * that integer. (Use a for loop)
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int j = sc.nextInt();

		// int j = 5;
		int factorial = 1;
		for (int i = 1; i <= j; i++) {
			factorial *= i;// factorial = factorial * i;
		}

		System.out.println("The factorial of " + j + " is " + factorial);
	}

}
