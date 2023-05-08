package taskday4;

import java.util.Arrays;

public class FilterAnInteger {

	 public static void main(String[] args) {
		    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		    
		    int[] filteredNumbers = Arrays.stream(numbers)
		                                  .filter(n -> n % 2 == 0)
		                                  .toArray();
		    
		    System.out.println(Arrays.toString(filteredNumbers));
		}
}
