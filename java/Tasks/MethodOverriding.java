package Tasks;

public class MethodOverriding {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Cat cat = new Cat();

		animal.makeSound();
		cat.makeSound();
	}
}
