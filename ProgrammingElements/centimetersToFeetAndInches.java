package ProgrammingElements;
import java.util.*;

public class centimetersToFeetAndInches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        double feet = height/(2.54 * 12);

        double inches = height/2.54 ;

        System.out.println("Your Height in cm is "+height+" while in feet is "+feet+" and inches is "+inches);
        sc.close();    }
}