package StringHandling;

import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String target = sc.nextLine();
        String replacement = sc.nextLine();
        sc.close();

        String result = replaceWord(sentence, target, replacement);
        System.out.println("Modified Sentence: " + result);
    }

    public static String replaceWord(String sentence, String target, String replacement) {
        String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                result += replacement;
            } else {
                result += words[i];
            }
            if (i < words.length - 1) {
                result += " ";
            }
        }

        return result;
    }
}
