package taskday2;

import java.util.Scanner;
public class MinMaxArray {


	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] arr = new int[size];

	        for (int i = 0; i < size; i++) {
	            System.out.print("Enter element " + (i + 1) + ": ");
	            arr[i] = scanner.nextInt();
	        }

	        int min = arr[0];
	        int max = arr[0];

	        for (int i = 1; i < size; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        System.out.println("Minimum value: " + min);
	        System.out.println("Maximum value: " + max);
	    }
	

}
