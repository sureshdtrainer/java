package generic;

import java.util.ArrayList;

class Machine {
    public void start() {
        System.out.println("Machine Started");
    }

    @Override
    public String toString() {
        return "I am Machine";
    }
    

}

class Camera extends Machine {
   
    public void snap() {
        System.out.println("Photo Clicked");
    }

    @Override
    public String toString() {
        return "I am Camera";
    }
       
}
class Car extends Machine{
    @Override
    public void start(){
        System.out.println("I am Starting a sepearate CAr");
    }
}

/**
 *  Plant
 */
interface  Plant {

    public void grow();   
}


public class App2 {

    public static void main(String[] args) {

        ArrayList<String> list0 = new ArrayList();

        list0.add("one");
        list0.add("two");

        showAllGenericList(list0);

        ArrayList<Machine> list1 = new ArrayList<>();
        list1.add(new Machine());
        list1.add(new Machine());

        showList(list1);
        
        ArrayList<Camera> list2 = new ArrayList<>();
        list2.add(new Camera());
        list2.add(new Camera());
        showList(list2);

        //Anonymous Classes
        Machine car = new Car();
        car.start();
        Machine machine1 = new Machine(){

            @Override
            public void start() {
                // TODO Auto-generated method stub
                System.out.println("I am stating Car");
            }
            
        };
        machine1.start();

        new Machine(){

            @Override
            public void start() {
                // TODO Auto-generated method stub
                System.out.println("I am stating Car without any variables");
            }
            
        }.start();

        new Plant() {
            public void grow(){
                System.out.println("Plant is growing");
            }
        }.grow();
    }

    private static void showList(ArrayList<? extends Machine> list0) {
        for(Machine value : list0){
            System.out.println(value);
        }
    }

    private static void showList2(ArrayList<? super Camera> list0) {
        for(Object value : list0){
            System.out.println(value);
        }
    }

    private static void showAllGenericList(ArrayList<?> list0) {
        for(Object value : list0){
            System.out.println(value);
        }
    }

}
