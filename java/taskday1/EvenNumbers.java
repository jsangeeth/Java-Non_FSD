package taskday1;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {

		/*
		 * Write a program that takes an integer as input and prints all the even
		 * numbers from 2 to that integer. (Use a for loop)
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int j = sc.nextInt();

		// int j =10;

		for (int i = 2; i <= j; i += 2) {
			System.out.println(i);

		}
	}
}
