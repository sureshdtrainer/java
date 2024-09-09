package stringformatting;
public class App123 {
    public static void main(String[] args) throws Exception {
       
        //Inefficient
        String text = "";

        text +="This is first line";
        text +=" ";
        text += "This is second line";

        System.out.println(text);
        //More efficient

        //StringBuilder - not thread safe and StringBuffer - thread safe

        StringBuilder sb = new StringBuilder("");
        sb.append("This is my SB first line");
        sb.append(" ").append("This is second line");

        System.out.println(sb.toString());

        //Formatting

        //newlines tab

        System.out.print("\nThis is a new statement\t");
        System.out.print("\nThis is a second statement");

        //Formatting integers
        System.out.printf("\nTotal value: %-10d", 100 );

        System.out.printf("\nDeciamal value : %.2f", 53.633);




    }
}
