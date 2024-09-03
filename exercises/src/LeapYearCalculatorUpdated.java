import java.util.Scanner;

import com.siemens.data.ValidatedYear;
import com.siemens.data.Year;
import com.siemens.strategy.BengaluruLeapYearStrategy;
import com.siemens.strategy.GregorianLeapYearStrategy;
import com.siemens.strategy.LeapYearStrategy;

public class LeapYearCalculatorUpdated {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        //Year userEnteredYear = new Year(year);

        LeapYearStrategy leapYearStrategy = new GregorianLeapYearStrategy();

        ValidatedYear userEnteredYear = new ValidatedYear(year, leapYearStrategy );
        
        // Determine if the year is a leap year
        boolean isLeapYear = userEnteredYear.isLeapYear();
        
        // Display the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
