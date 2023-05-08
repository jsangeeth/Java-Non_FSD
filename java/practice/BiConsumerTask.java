package practice;

import java.util.function.BiConsumer;

public class BiConsumerTask {

	public static void main(String[] args) {

		BiConsumer<Integer, Integer> add = (x,y) -> 
		System.out.println("Addition of Two Numbers = " + (x + y));
		add.accept(5, 6);
	}

}
