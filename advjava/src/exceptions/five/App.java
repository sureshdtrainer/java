package exceptions.five;

import java.io.*;

public class App {

    public static void main(String[] args) {
        File file = new File("text.txt");
        BufferedReader br=null;
        try{
            FileReader fr = new FileReader(file);

           br = new BufferedReader(fr);
    
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }catch(IOException e){
            System.out.println("Unable to read file");
        }
        
        try {
            br.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
