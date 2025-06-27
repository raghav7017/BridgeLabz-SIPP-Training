package Strings;
import java.util.Scanner;

public class SubString {
    public static String substringWithCharAt(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < text.length(); i++) {
            sb.append(text.charAt(i));
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

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String subCharAt = substringWithCharAt(text, start, end);

        String subBuiltIn = "";
        if (start >= 0 && end <= text.length() && start < end) {
            subBuiltIn = text.substring(start, end);
        } 

        boolean areEqual = compareStringsCharAt(subCharAt, subBuiltIn);

        System.out.println("Substring using charAt(): " + subCharAt);
        System.out.println("Substring using substring(): " + subBuiltIn);
        System.out.println("Are both substrings equal? " + areEqual);
        sc.close();
    }
}