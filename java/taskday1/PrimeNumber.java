package taskday1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		/*
		 * Write a program that takes an integer as input and prints whether it is a
		 * prime number or not. (Use a while loop)
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		boolean isPrime = true;
		int i = 2;

		while (i <= num / 2) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
			i++;
		}

		if (isPrime) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}
	}

}
