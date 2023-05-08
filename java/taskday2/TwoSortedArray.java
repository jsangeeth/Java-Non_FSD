package taskday2;

import java.util.Scanner;

public class TwoSortedArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the size of the first array: ");
		int size1 = input.nextInt();
		int[] arr1 = new int[size1];
		System.out.println("Enter the elements of the first array in ascending order:");
		for (int i = 0; i < size1; i++) {
			arr1[i] = input.nextInt();
		}

		System.out.print("Enter the size of the second array: ");
		int size2 = input.nextInt();
		int[] arr2 = new int[size2];
		System.out.println("Enter the elements of the second array in ascending order:");
		for (int i = 0; i < size2; i++) {
			arr2[i] = input.nextInt();
		}
		int i = 0, j = 0;
		System.out.print("Sorted Array :");
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				System.out.print(arr1[i] + " ");
				i++;
				j++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else {
				j++;
			}
		}

	}
}
