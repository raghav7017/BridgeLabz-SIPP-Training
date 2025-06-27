package Strings;
import java.util.Scanner;

public class CharacterArrayComparison {

    static char[] customToCharArray(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    static boolean compareCharArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        char[] customChars = customToCharArray(input);
        char[] builtInChars = input.toCharArray();

        System.out.print("Custom method chars: ");
        for (char c : customChars) System.out.print(c + " ");
        System.out.println();

        System.out.print("Built-in method chars: ");
        for (char c : builtInChars) System.out.print(c + " ");
        System.out.println();

        boolean isEqual = compareCharArrays(customChars, builtInChars);
        System.out.println("Arrays are equal? " + isEqual);
        sc.close();
    }
}
