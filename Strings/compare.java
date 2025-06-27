package Strings;
import java.util.*;

public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        boolean result1 = compareString(s1, s2);

        boolean result2 = s1.equals(s2);

        if(result1 == result2) {
            System.out.println("Result are same");
        }
        else{
            System.out.println("Results are not same");
        }
         sc.close();
    }
    public static boolean compareString(String s1, String s2) {
        for(int i =0;i<s1.length();i++) {
            if(s1.charAt(i) == s2.charAt(i)) {
                return true;
            }
        }
        return false;
        
    }
}