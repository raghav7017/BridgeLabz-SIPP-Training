package StringHandling;

import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        int[] freq = new int[256];
        for (char c : input.toCharArray()) {
            freq[c]++;
        }

        char mostFreqChar = ' ';
        int maxFreq = 0;

        for (char c : input.toCharArray()) {
            if (freq[c] > maxFreq) {
                maxFreq = freq[c];
                mostFreqChar = c;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFreqChar + "'");
    }
}
