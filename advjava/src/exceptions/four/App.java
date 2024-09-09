package exceptions.four;

import java.io.IOException;
import java.text.ParseException;
import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args) {
        Test test = new Test();

        //RUNTIME EXCEPTION

        //int value = 7/0;

        String text = null;


        text.length();

        try {
            test.run();

            test.input();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } 
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
