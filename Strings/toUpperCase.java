package Strings;
import java.util.Scanner;

public class toUpperCase {
    public static String toUpperWithCharAt(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char)(ch - 32));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static boolean compareStringsCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String upperCharAt = toUpperWithCharAt(text);

        String upperBuiltIn = text.toUpperCase();

        boolean areEqual = compareStringsCharAt(upperCharAt, upperBuiltIn);

        System.out.println("Uppercase using charAt(): " + upperCharAt);
        System.out.println("Uppercase using toUpperCase(): " + upperBuiltIn);
        System.out.println("Are both uppercase strings equal? " + areEqual);
        sc.close();
    }
}