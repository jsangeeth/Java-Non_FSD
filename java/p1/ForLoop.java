package p1;

public abstract class ForLoop {

	public abstract void makeSound();

	public void sleep() {
		System.out.println("Sleeping...");
	}
}

class Dog extends ForLoop {
	public void makeSound() {
		System.out.println("Woof!");
	}

	}

	
