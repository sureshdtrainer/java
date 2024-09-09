package exceptions.two;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class App {

    public static void main(String[] args) {
        File file = new File("test.txt");
        
        try {
            FileReader fr = new FileReader(file);
            //Below statements will not be executed in case of exception
        
            //business logic
        
        
        
            System.out.println("Business Logic");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
           // e.printStackTrace();
           System.out.println("Please create a file with test.txt at parent path");
        }

        System.out.println("After Exception");
    }
}
