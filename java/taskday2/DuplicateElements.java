package taskday2;

import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element found: " + arr[i]);
                }
            }
        }
    }




}
