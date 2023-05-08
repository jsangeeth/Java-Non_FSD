package taskday1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		/*
		 * Write a program that takes an integer as input and prints the Fibonacci
		 * sequence up to that integer. (Use a while loop)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = sc.nextInt();

		int prev = 0, curr = 1, next;

		System.out.println("Fibonacci Sequence up to " + num);

		while (prev <= num) {
			System.out.print(prev + " ");

			next = prev + curr;// 0+1=1
			prev = curr;// 1
			curr = next;// 1
		}
	}
}
