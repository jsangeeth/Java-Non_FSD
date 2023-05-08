package taskday2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateValues {

	public static void main(String[] args) {

		// int[] arr = {1, 2, 3, 2, 4, 3, 5, 6, 1, 7};

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter element " + (i + 1) + " : ");
			arr[i] = scanner.nextInt();
		}
		int count = 0;
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {

				if (arr[i] == arr[j]) {

					count++;

					for (int k = j; k < size - 1; k++) {
						
						arr[k] = arr[k + 1];
					}
					size--;
					
					j--;
				}
			}
		}

		System.out.println("Total duplicates found: " + count);
		System.out.println("Array after removing duplicates: " +arr );
		for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
	}

}
