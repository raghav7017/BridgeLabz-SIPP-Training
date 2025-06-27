package StringHandling;

import java.util.Scanner;

public class CharacterRemover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char toRemove = sc.nextLine().charAt(0);
        sc.close();

        String result = "";
        for (char c : input.toCharArray()) {
            if (c != toRemove) {
                result += c;
            }
        }

        System.out.println("Modified String: " + result);
    }
}
