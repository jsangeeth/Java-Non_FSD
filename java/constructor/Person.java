package constructor;

import java.util.Scanner;

public class Person {

	private String name;
	private int age;
	public Person() {
		name= "anu";
		age = 21;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		
		    Person p1 = new Person("Alice", 25);
	        System.out.println("Name: " + p1.getName());
	        System.out.println("Age: " + p1.getAge());
	        
	        Person p2 = new Person("Bob", 30);
	        System.out.println("Name: " + p2.getName());
	        System.out.println("Age: " + p2.getAge());
		
	}
}
