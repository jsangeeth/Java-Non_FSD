package taskday4;

import java.util.ArrayList;
import java.util.Collections;

public class SortAnArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Anu");
		list.add("Sam");
		list.add("Cherry");
		list.add("Ravi");

		Collections.sort(list, (s1, s2) -> s1.compareTo(s2));

		System.out.println(list);
	}

}
