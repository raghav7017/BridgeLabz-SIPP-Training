package Searching_algoritms;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class File_read {
	public static void main(String[] args) {
        // Specify the path to your file
        String filePath = "example.txt";

        try {
            // Create FileReader and wrap it with BufferedReader
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            // Read and print each line until the end of the file
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file:");
            e.printStackTrace();
        }
    }

}
