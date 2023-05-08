package taskday5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

	public static void main(String[] args) throws IOException {

		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);

		System.out.print("Enter your name : ");

		String str = reader.readLine();

		System.out.print("Enter your age : ");
		int num = Integer.parseInt(reader.readLine());
		
		System.out.println("Name : " + str);
		System.out.println("Age : " + num);
	}
}
