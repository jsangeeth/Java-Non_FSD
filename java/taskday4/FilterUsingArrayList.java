package taskday4;

import java.util.ArrayList;
import java.util.List;

public class FilterUsingArrayList {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);

		List<Integer> filteredNumbers = numbers.stream().filter(n -> n % 2 == 0).toList();

		System.out.println(filteredNumbers);
	}

}
