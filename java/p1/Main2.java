package p1;

class Person {
    String name;
    int age;
  
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
  
    void display()
    {
        System.out.println("Name: " + name
                           + ", Age: " + age);
    }
}
  
public class Main2 {
    public static void main(String[] args)
    {
        // Create an anonymous object
        // and call its display method
        new Person("John", 30).display();
    }
}


