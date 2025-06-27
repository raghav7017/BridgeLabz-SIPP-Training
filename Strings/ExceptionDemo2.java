package Strings;
import java.util.Scanner;

public class ExceptionDemo2 {

    public static void generateException(String text) {
        char ch = text.charAt(text.length()); 
        System.out.println("Character: " + ch);
    }

    public static void handleException(String text) {
        try {
            char ch = text.charAt(text.length()); // Invalid index
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        handleException(text);
        sc.close();
    }
}