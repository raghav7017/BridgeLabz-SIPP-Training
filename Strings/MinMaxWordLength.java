package Strings;
import java.util.*;

public class MinMaxWordLength {
    public static String[] splitWords(String text) {
        return text.trim().split(" ");
    }

    public static int[] findMinMaxWord(String[] words) {
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < words[minIndex].length()) minIndex = i;
            if (words[i].length() > words[maxIndex].length()) maxIndex = i;
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitWords(text);
        int[] result = findMinMaxWord(words);
        System.out.println("Shortest Word: " + words[result[0]]);
        System.out.println("Longest Word: " + words[result[1]]);
        sc.close();
    }
}
