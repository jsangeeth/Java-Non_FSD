package taskday2;

import java.util.Scanner;

public class SumOfArray {

	public static int calculateSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = scanner.nextInt();
		}
		int sum = calculateSum(arr);
		System.out.println("sum of array elements:" + sum);
	}
}
