import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // declaration and initialization
        // int myNumber = 100; // 32 bit
        // // assigning a value to variable
        // myNumber = 200;
        // short myShort = 6553; // 16 bit
        // long myLong = 99999; // 64 bit
        // double myDouble = 7.3434;
        // float myFloat = 324.3f;
        // char myChar = 'c';
        // boolean myBoolean = false;
        // byte myByte = 127; // 8 bit
        // System.out.println(myByte);
        // System.out.println(myByte);
        // System.out.println(myNumber);
        // System.out.println(myShort);
        // System.out.println(myLong);
        // System.out.println(myDouble);
        // System.out.println(myFloat);
        // System.out.println(myChar);
        // System.out.println(myBoolean);
        // System.out.println(myByte);

        // String text = "Hello";
        // String space = " ";
        // String name = "John";

        // String greetings = text + space + name;

        // System.out.println(greetings);
        // System.out.println("My integer value is : " + myNumber);

        // While Loop
        // int value = 1;

        // while(value <= 10){
        // System.out.println("Hello " + value);
        // value++; //value=value +1;
        // }

        // Some useful conditions:
        // System.out.println(5 == 5);
        // System.out.println(10 != 11);
        // System.out.println(3 < 6);
        // System.out.println(10 > 100);
        // int myInt = 9;
        // // Using if and if else
        // if (myInt < 10) {
        // System.out.println("Yes, its true!");
        // } else if (myInt > 20) {
        // System.out.println("No,its false!");
        // } else {
        // System.out.println("None of the above");
        // }

        // Create Scanner object2
        //Scanner scanner = new Scanner(System.in);

        // Prompt user for the first numberS
        //System.out.println("Enter the a number: ");
        //int count = 0;
        // accept the user input
        // int value =0;
        // do {
        //     System.out.println("Enter the a number: ");
        //     value = scanner.nextInt();
        //     System.out.println("User entered value is " + value);

        // } while (value != 5);
        // // String value = scanner.nextLine();
        // System.out.println("Got value as 5");

        Scanner input = new Scanner(System.in);
 
        System.out.println("Please enter a command: ");
        String text = input.nextLine();

 
        switch (text) {
        case "start":
            System.out.println("Machine started!");
            //business logic 
            break;
 
        case "stop":
            System.out.println("Machine stopped.");
            break;
 
        default:
            System.out.println("Command not recognized");
        }


    }
}
