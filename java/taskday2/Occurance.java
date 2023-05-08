package taskday2;

import java.util.Scanner;
public class Occurance {


	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();
	        int[] arr = new int[size];
	        for (int i = 0; i < size; i++) {
	            System.out.print("Enter element " + (i + 1) + ": ");
	            arr[i] = scanner.nextInt();
	        }

	        System.out.print("Enter the integer to search: ");
	        int searchInt = scanner.nextInt();

	        int count = 0;
	        for (int e : arr)//for(int i = 0; i < size; i++)
	        {
	            if (e == searchInt)//if (arr[i] == searchInt)
	            	{
	                count++;
	            }
	        }

	        System.out.println("The integer " + searchInt + " occurs " + count + " times in the array.");
	    }
	

}
