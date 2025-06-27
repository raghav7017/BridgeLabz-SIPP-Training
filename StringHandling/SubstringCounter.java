package StringHandling;

import java.util.Scanner;

public class SubstringCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mainString = sc.nextLine();
        String subString = sc.nextLine();
        sc.close();

        int count = 0;
        int index = 0;

        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length();
        }

        System.out.println("Occurrences: " + count);
    }
}
