package ProgrammingElements;
import java.util.*;

public class KilometersToMiles {
    public static void main(String[] args) {
        double km;
        Scanner sc = new Scanner(System.in);
        km = sc.nextInt();

        double miles = (1/1.6) * km ;

        System.out.println("The total miles is " + miles + "mile for the given" + km + "km");
        sc.close();
    }
}