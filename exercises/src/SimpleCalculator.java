import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for the first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        // Prompt user for the operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        // Prompt user for the second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        
        // Perform the operation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }
        
        // Display the result
        System.out.println("The result is: " + result);
    }
}
