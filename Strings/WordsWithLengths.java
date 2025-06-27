package Strings;
import java.util.*;

public class WordsWithLengths {
    public static String[] splitWords(String text) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (ch != ' ') word.append(ch);
            else if (word.length() > 0) {
                words.add(word.toString());
                word.setLength(0);
            }
        }
        if (word.length() > 0) words.add(word.toString());
        return words.toArray(new String[0]);
    }

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count++);
            }
        } catch (Exception e) {}
        return count;
    }

    public static String[][] mapWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] wordInfo = mapWordsWithLength(words);
        System.out.println("Word\tLength");
        for (String[] row : wordInfo) {
            System.out.println(row[0] + "\t" + row[1]);
            sc.close();
        }
    }
}
