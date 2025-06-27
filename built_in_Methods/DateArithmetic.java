package built_in_Methods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = scanner.nextLine();

        
        LocalDate date = LocalDate.parse(input, formatter);

        
        LocalDate addedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        
        LocalDate finalDate = addedDate.minusWeeks(3);

        
        System.out.println("Original Date: " + date);
        System.out.println("After adding 7 days, 1 month, and 2 years: " + addedDate);
        System.out.println("After subtracting 3 weeks: " + finalDate);

        scanner.close();
    }
}

