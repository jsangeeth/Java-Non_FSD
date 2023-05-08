package taskday5;

import java.util.Scanner;

public class ExceptionHadling {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);

			System.out.print("Enter your name : ");

			String str = sc.nextLine();

			System.out.print("Enter your age : ");
			int in = sc.nextInt();

			System.out.println("Name: " + str);
			System.out.println("Age : " + in);

		} finally {
			sc.close();
		}
	}
}
