package taskday5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {

	public static void main(String[] args) throws NumberFormatException, IOException {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Enter a number : ");
			int num = Integer.parseInt(br.readLine());
			System.out.println(num);

		}
	}
}
