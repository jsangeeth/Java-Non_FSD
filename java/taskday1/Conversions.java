package taskday1;

import java.util.Scanner;

public class Conversions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Write a Java program to convert a string to an integer

		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		// String s = "520";
		int result = Integer.parseInt(s);
		System.out.println("string to integer = " + result);

		// Write a Java program to convert a string to a double

		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		double num = Double.parseDouble(str);
		System.out.println("The double value of the string is: " + num);

		// Write a Java program to convert an integer to a string

		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		// int a = 450;
		String c = Integer.toString(a);
		System.out.println("integer to string = " + c);

		// Write a Java program to convert a double to an integer

		System.out.print("Enter a decimal value: ");
		double d = sc.nextDouble();
		int i = (int) d;
		System.out.println("double to integer = " + i);

	}

}