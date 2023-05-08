package taskday2;
import java.util.Arrays;
import java.util.Scanner;

public class Clone {


	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] arr1 = new int[size];
	        for (int i = 0; i < size; i++) {
	            System.out.print("Enter element " + (i + 1) + ": ");
	            arr1[i] = scanner.nextInt();
	        }

	        int[] arr2 = arr1.clone();

	        System.out.println("Original array: " + Arrays.toString(arr1));
	        System.out.println("Cloned array: " + Arrays.toString(arr2));
	    }
	

}
