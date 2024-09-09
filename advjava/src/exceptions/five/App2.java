package exceptions.five;

import java.io.*;

public class App2 {

    public static void main(String[] args) {
        File file = new File("text.txt");
        //try with Resources
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
    
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch(IOException e){
            System.out.println("Unable to read file");
        }

    }

}
