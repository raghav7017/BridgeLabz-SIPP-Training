package Strings;
import java.util.Scanner;

public class toLowerCase {
    public static String toLowerWithCharAt(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char)(ch + 32));
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

        String lowerCharAt = toLowerWithCharAt(text);

        String lowerBuiltIn = text.toLowerCase();

        boolean areEqual = compareStringsCharAt(lowerCharAt, lowerBuiltIn);

        System.out.println("Lowercase using charAt(): " + lowerCharAt);
        System.out.println("Lowercase using toLowerCase(): " + lowerBuiltIn);
        System.out.println("Are both lowercase strings equal? " + areEqual);
        sc.close();
    }
}