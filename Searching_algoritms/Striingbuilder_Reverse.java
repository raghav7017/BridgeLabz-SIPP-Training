package Searching_algoritms;

public class Striingbuilder_Reverse {
	public static String reverse(String input) {
        
        StringBuilder sb = new StringBuilder(input);
        
        
        sb.reverse();
        
        
        return sb.toString();
    }

    public static void main(String[] args) {
        String original = "hello";
        String reversed = reverse(original);
        
        // Print the result
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

}
