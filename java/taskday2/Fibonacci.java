package taskday2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

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
