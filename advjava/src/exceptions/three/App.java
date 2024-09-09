package exceptions.three;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class App {

    public static void main(String[] args) {
        //Open File logic            
        FileHandler handler = new FileHandler();
        boolean returnValue=handler.openFile();
        if (returnValue){
            System.out.println("Success");
        }else{
            System.out.println("Failure");
        }
    }
}

class FileHandler{

    public boolean  openFile(){
        
        try {
            handleFile();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return false;
    }

    private void handleFile() throws FileNotFoundException{
        throw new FileNotFoundException();
    }
}