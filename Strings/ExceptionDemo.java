package Strings;
import java.util.Scanner;

public class  ExceptionDemo {

    public static void generateException(String text) {
        String result = text.substring(5, 2);
        System.out.println("Substring: " + result);
    }

    public static void handleException(String text) {
        try {
            String result = text.substring(5, 2); // start > end
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        generateException(text);
        sc.close();
    }
}