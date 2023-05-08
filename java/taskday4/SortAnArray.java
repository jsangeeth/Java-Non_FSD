package taskday4;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		String[] names = { "Alice", "Eve", "Charlie", "Dave", "Bob" };

		Arrays.sort(names, (a, b) -> a.compareTo(b));

		for (String name : names) {
			System.out.println(name);
		}
	}

}
