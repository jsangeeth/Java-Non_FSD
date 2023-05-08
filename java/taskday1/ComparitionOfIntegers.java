package taskday1;

import java.util.Scanner;

public class ComparitionOfIntegers {

	public static void main(String[] args) {

		// Write a program that takes two integers as input and
		// prints whether the first integer is greater than, less than, or equal to the
		// second integer.

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number = ");
		int a = sc.nextInt();

		System.out.print("Enter second number = ");
		int b = sc.nextInt();

		// int a = 20;
		// int b = 15;

		if (a > b) {
			System.out.println(a + " is grater than " + b);
		} else if (a < b) {
			System.out.println(a + " is Lesser than " + b);
		} else {
			System.out.println(a + " is equal to " + b);
		}
	}

}
