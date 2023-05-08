package taskday1;

import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {

		/*
		 * Write a program that takes an integer as input and prints the sum of all the
		 * numbers from 1 to that integer. (Use a do-while loop)
		 */
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int n = input.nextInt();

		int sum = 0;
		int i = 1;

		do {
			sum += i;
			i++;
		} while (i <= n);

		System.out.print("The sum of numbers from 1 to " + n + " is: " + sum);
	}

}
