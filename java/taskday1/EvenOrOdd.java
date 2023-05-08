package taskday1;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		/*
		 * Write a program that takes an integer as input and prints whether it is even
		 * or odd.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number = ");
		int a = sc.nextInt();

		// int a = 12;

		if (a % 2 == 0) {
			System.out.println(a + " is even number");
		} else {
			System.out.println(a + " is odd number");
		}
	}

}
