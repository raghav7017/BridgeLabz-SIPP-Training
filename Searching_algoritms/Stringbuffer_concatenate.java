package Searching_algoritms;

public class Stringbuffer_concatenate {
	public static String concatenate(String[] strings) {
        // Create a new StringBuffer
        StringBuffer sb = new StringBuffer();
        
        // Append each string from the array
        for (String str : strings) {
            sb.append(str);
        }
        
        // Return the final concatenated string
        return sb.toString();
    }

    public static void main(String[] args) {
        // Example array of strings
        String[] words = {"Java", " ", "is", " ", "fun", "!"};
        
        // Call the method and print result
        String result = concatenate(words);
        System.out.println("Concatenated String: " + result);
    }

}
