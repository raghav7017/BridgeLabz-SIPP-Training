package StringHandling;

import java.util.Scanner;

public class LexicographicalComparer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();

        int minLength = Math.min(s1.length(), s2.length());
        boolean areEqual = true;

        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
                areEqual = false;
                break;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
                areEqual = false;
                break;
            }
        }

        if (areEqual) {
            if (s1.length() < s2.length()) {
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
            } else if (s1.length() > s2.length()) {
                System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
            } else {
                System.out.println("Both strings are equal");
            }
        }
    }
}
