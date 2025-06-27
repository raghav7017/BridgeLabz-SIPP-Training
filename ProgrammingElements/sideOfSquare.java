package ProgrammingElements;
import java.util.*;

public class sideOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int perimeter = sc.nextInt();

        int sides = perimeter /4;

        System.out.println("> The length of the side is " + sides + " whose perimeter is " + perimeter );
        sc.close();
    }
}