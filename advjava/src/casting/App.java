package casting;

class Machine {
    public void start() {
        System.out.println("Machine Started");
    }

}

class Camera extends Machine {
    public void start() {
        System.out.println("Camera Started");
    }

    public void snap() {
        System.out.println("Photo Clicked");
    }
}

public class App {

    public static void main(String[] args) {
        // int value = 1234;

        // long longValue = value;

        // value = (int) longValue;

        // float floatValue = value;
        // value = (int) floatValue;

        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Long.MIN_VALUE);

        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();

        camera1.start();
        camera1.snap();
        // Upcasting
        Machine machine2 = camera1;
        machine2.start();
        // machine2.snap();

        System.out.println("***Downcasting***");
        // Dowcasting
        Machine machine3 = new Camera();
        Camera camera2 = (Camera) machine3;
        camera2.start();
        camera2.snap();

        Machine machine4 = new Machine();
        // Camera camera3 = (Camera)machine4; //runtime error
        // camera3.start();
        // camera3.snap();
        //if(machine3 instanceof Camera)
        if (machine4 instanceof Camera) {
            System.out.println("Inside instance of Camera check");
            Camera camera3 = (Camera) machine3;
            camera2.start();
            camera2.snap();
        }else {
            System.out.println("Not a instance of Camera");
        }
    }
}
