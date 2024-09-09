package exceptions.four;

import java.io.IOException;
import java.text.ParseException;
import java.io.FileNotFoundException;

public class Test {

        public void run() throws IOException, ParseException{

            //throw new IOException();
            //business logic
            throw new ParseException("Error in Parsing", 2);
        }

        public void input() throws IOException, FileNotFoundException{
        }
}
