package taskday5;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		
		String str = sc.nextLine();
		
		System.out.println("Enter your age : ");
		int in = sc.nextInt();
		
		System.out.println("Name: "+str);
		System.out.println("Age : "+in);
		
	}
}
