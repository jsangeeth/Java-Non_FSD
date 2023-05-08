package taskday1;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {

		/*
		 * Write a program that takes an integer as input and prints all the numbers
		 * from 1 to that integer. (Use a for loop)
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number = ");
		int a = sc.nextInt();

		for (int i = 1; i <= a; i++) {

			System.out.println(i);

		}
	}
}
