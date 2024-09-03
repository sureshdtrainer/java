package world;
public abstract class Person {


   

    public static double PI=3.14;
    // Instance Variable (data or state.....)
     String name;
     int age;
    //Default Construtor
    public Person() {
        //this("DEFAULT",22);
        System.out.println("Person Default Constructor");
        this.name = "DEFAULT";
        this.age = 22;
        
    }
    //Parameterized Construtor
    public Person(String name, int age) {
        //this();
        this.name = name;
        this.age = age;
        System.out.println("Parametrized constructor");
    }
    public Person(String name) {
        this.name = name;
        this.age = 20;
    }

    // Methods (Behaviour)
    public void speak() {
        System.out.println("My name is " + this.name + "I am " + this.age + " years old");
    }

    public abstract void walk();

    public static void statMethod(){
       
        System.out.println("I am Static method " +PI);
    }

    public abstract void walk(int speed);

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

}