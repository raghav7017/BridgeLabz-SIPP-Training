package Strings;
import java.util.Scanner;

public class NumberFormatExceptionDemo {

    static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Parsed number: " + num);
    }

    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println("Parsed number inside try: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: Invalid input - " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to parse as number: ");
        String input = sc.next();

        
        handleException(input);
        sc.close();
    }
}
