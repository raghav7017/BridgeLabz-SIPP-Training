package Searching_algoritms;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class occurence_of_word {
	public static void main(String[] args) {
        // Path to the file
        String filePath = "example.txt";

        // Word to search for (case-sensitive)
        String targetWord = "Java";

        // Counter for occurrences
        int count = 0;

        try {
            // Create FileReader and wrap it with BufferedReader
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            // Read file line by line
            while ((line = bufferedReader.readLine()) != null) {
                // Split line into words using whitespace and punctuation as delimiters
                String[] words = line.split("\\W+"); // "\\W+" = non-word characters

                // Check each word
                for (String word : words) {
                    if (word.equals(targetWord)) {
                        count++;
                    }
                }
            }

            // Close resources
            bufferedReader.close();
            fileReader.close();

            // Print result
            System.out.println("The word \"" + targetWord + "\" appears " + count + " times in the file.");

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file:");
            e.printStackTrace();
        }
    }

}
