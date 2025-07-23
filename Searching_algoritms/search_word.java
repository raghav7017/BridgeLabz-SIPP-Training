package Searching_algoritms;
import java.util.Scanner;
public class search_word {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of sentences: ");
	        int n = sc.nextInt();
	        sc.nextLine(); // consume newline

	        String[] sentences = new String[n];
	        System.out.println("Enter the sentences:");
	        for (int i = 0; i < n; i++) {
	            sentences[i] = sc.nextLine();
	        }

	        System.out.println("Enter the word to search: ");
	        String word = sc.next();

	        String result = "Not Found";
	        for (int i = 0; i < n; i++) {
	            if (sentences[i].contains(word)) {
	                result = sentences[i];
	                break;
	            }
	        }
	        sc.close();

	        System.out.println(result);
	}

}