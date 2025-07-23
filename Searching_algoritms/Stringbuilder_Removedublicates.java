package Searching_algoritms;
import java.util.HashSet;

public class Stringbuilder_Removedublicates {
	 public static String removeDuplicates(String input) {
	        // HashSet to track seen characters
	        HashSet<Character> seen = new HashSet<>();
	        
	        // StringBuilder to build the result
	        StringBuilder sb = new StringBuilder();
	        
	        // Iterate through each character
	        for (char c : input.toCharArray()) {
	            if (!seen.contains(c)) {
	                seen.add(c);          // Add to set
	                sb.append(c);         // Append to result
	            }
	        }
	        
	        return sb.toString();  // Return result as string
	    }

	    public static void main(String[] args) {
	        String original = "programming";
	        String result = removeDuplicates(original);
	        
	        System.out.println("Original: " + original);
	        System.out.println("Without Duplicates: " + result);
	    }

}
