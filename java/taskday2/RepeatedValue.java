package taskday2;

import java.util.Scanner;
public class RepeatedValue {


	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();
	        int[] arr = new int[size];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        int count = 0;
	        for (int i = 0; i < size; i++) {
	            for (int j = i + 1; j < size; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                    break;
	                }
	            }
	        }
	        System.out.println("The number of repeated values in the array is: " + count);
	    }
	

}
