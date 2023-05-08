package taskday4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {
		File file = new File("myfile.txt");

		try {
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		}
	}
}