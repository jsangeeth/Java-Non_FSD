package p1;

public class Main {

	public static void main(String[] args) {
        ForLoop animal = new Dog() {
        	public void makeSound() {
        		System.out.println("Sleeping");
        	}
        };
        
        animal.makeSound(); // prints "Woof!“
        animal.sleep();
    }
}
