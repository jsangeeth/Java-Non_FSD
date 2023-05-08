package taskday4;

import java.util.Scanner;

public class Calculator {

	enum Calculation {
		ADD, SUB, MUL, DIVISION;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter second number: ");
		int num2 = scanner.nextInt();

		Calculation cal = Calculation.DIVISION;

		int result = 0;
		switch (cal) {
		case ADD:
			result = num1 + num2;

			break;
		case SUB:
			result = num1 - num2;
			break;
		case MUL:
			result = num1 * num2;
			break;
		case DIVISION:
			result = num1 / num2;
			break;
		default:
			System.out.println("Invalid operator.");
			break;
		}
		System.out.println(num1 + " " + cal + " " + num2 + " : " + result);
	}
}
