package filereading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        //C:\training\JAVA\java\advjava - Absolute path but will not understand
      
        //C:\\training\\JAVA\\java\\advjava\\example.txt - give double backward slash or forward slash
    //String file= "C:\training\JAVA\java\advjava";

    //String fileName = "C:/training/JAVA/java/advjava/example.txt";

    String fileName = "example.txt"; //relative path

    File textFile = new File(fileName);
    
    Scanner in = new Scanner(textFile);
    int value = in.nextInt();
    in.nextLine();
    while(in.hasNextLine()){
        String lineContent = in.nextLine();
        System.out.println(lineContent);
    }
    //System.out.println(in.nextLine());
    in.close();
    }
    }
