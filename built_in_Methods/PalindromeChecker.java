package built_in_Methods;

import java.util.Scanner;

public class PalindromeChecker {

	    public static void main(String[] args) {
	
	        String input = getInput();
	
	       
	        boolean isPalindrome = checkPalindrome(input);
	
	        
	        displayResult(input, isPalindrome);
	    }
	
	    
	    public static String getInput() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a word or phrase to check if it's a palindrome: ");
	        String str = scanner.nextLine();
	        scanner.close();
	        return str;
	    }
	
	    // Function to check if the input is a palindrome
	    public static boolean checkPalindrome(String str) {
	        
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	
	        int left = 0;
	        int right = cleaned.length() - 1;
	
	        while (left < right) {
	            if (cleaned.charAt(left) != cleaned.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	
	        return true;
	    }
	
	    
	    public static void displayResult(String str, boolean isPalindrome) {
	        if (isPalindrome) {
	            System.out.println("\"" + str + "\" is a palindrome.");
	        } else {
	            System.out.println("\"" + str + "\" is NOT a palindrome.");
	        }
    }
}
