package taskday1;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();

		System.out.println("Enter the second number: ");
		int b = sc.nextInt();

		while (a <= b) {
			boolean isPrime = true;

			int i = 2;
			while (i <= a / 2) {
				if (a % i == 0) {
					isPrime = false;
					break;
				}
				i++;
			}
			if (isPrime && a != 1) {
				System.out.println(a);

			}
			a++;
		}
	}

}
