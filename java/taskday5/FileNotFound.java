package taskday5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound {

	public static void main(String[] args) {
		File file = new File("practice.txt");

		try {
			Scanner scanner = new Scanner(file);
			
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
			scanner.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		}
	}

}
