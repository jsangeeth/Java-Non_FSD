package taskday2;

import java.util.Arrays;
import java.util.Scanner;

public class SortAnArray {

	public static void main(String[] args) {
        
		//	int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter element " + (i + 1) + " : ");
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Elements of array sorted in ascending order: ");

		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}
}
