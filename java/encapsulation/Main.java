package encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setName("Kavitha");
		p.setAge(25);
		
				System.out.println("Name: " + p.getName());
		        System.out.println("Age: " + p.getAge());
	}
}
