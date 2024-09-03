import world.Person;
import world.Student;

public class App {
    static{
        System.out.println("Static block in Main Class");
    }
    public static void main(String[] args) throws Exception {

        //Person.statMethod();
        // Create a Person object using the Person class

        // Person person1 = new Person("Apple", 10);
        // System.out.println(person1.getName());
        // System.out.println(person1.getAge());
        // person1.setName("John");
        // person1.setAge(24);
        // System.out.println(person1.getName());
        // System.out.println(person1.getAge());

        // person1.speak();
        // person1.walk(20);
        // person1.walk();

        // Person person2 = new Person();
        // System.out.println(person2.getName());
        // System.out.println(person2.getAge());

        // person2.setName("Jack");
        // person2.setAge(25);

        // System.out.println(person2.getName());
        // System.out.println(person2.getAge());
        // person2.speak();
        // person2.walk();

        System.out.println("Hello, World!");

        Student student1 = new Student();
        student1.walk();
        student1.train();
    }
}
