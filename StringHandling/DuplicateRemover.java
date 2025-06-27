package StringHandling;

import java.util.Scanner;

public class DuplicateRemover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (result.indexOf(c) == -1) {
                result += c;
            }
        }

        System.out.println("Modified String: " + result);
    }
}
