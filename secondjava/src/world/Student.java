package world;

public class Student extends Person {

    public Student(){
        //super("Default",20);
        System.out.println("Student Default constructor");
        //this.name="DEFAULT";
        //this.age=20;
    }

    
    public void walk(){
        System.out.println("This is student walking");
    }


    @Override
    public void walk(int speed) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'walk'");
    }

}
