package taskday2;

public class MethodOverloading {

	public int add(int a, int b) {
		return a+b;
	}

	public int add(int a, int b, int c) {
		return a+b+c;
	}

	public double add(double a, double b) {
		return a+b;
	}

	public static void main(String[] args) {
		MethodOverloading example = new MethodOverloading();

		int sum1 = example.add(10, 20);
		System.out.println("Sum of two integers: " + sum1);

		int sum2 = example.add(10, 20, 30);
		System.out.println("Sum of three integers: " + sum2);

		double sum3 = example.add(10.5, 20.5);
		System.out.println("Sum of two doubles: " + sum3);
	}

}
