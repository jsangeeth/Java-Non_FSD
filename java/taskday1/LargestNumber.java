package taskday1;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

		/*
		 * Write a program that takes three integers as input and prints the largest
		 * one.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first  integer : ");
		int a = sc.nextInt();

		System.out.print("Enter second integer : ");
		int b = sc.nextInt();

		System.out.print("Enter third  integer : ");
		int c = sc.nextInt();

		// int a = 20;
		// int b = 63;
		// int c = 15;

		if (a > b && a > c) {

			System.out.println(a + " is Largest Number");
		} else if (b > a && b > c) {
			System.out.println(b + " is Largest Number");
		} else {
			System.out.println(c + " is Largest Number");
		}
	}

}
