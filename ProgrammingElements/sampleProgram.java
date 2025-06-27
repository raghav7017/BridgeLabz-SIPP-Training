
package ProgrammingElements;
import java.util.Scanner;

public class sampleProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter From City: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter Via City: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter To City: ");
        String toCity = sc.nextLine();

        
        System.out.print("Enter distance from From City to Via City (in miles): ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter distance from Via City to Final City (in miles): ");
        double viaToFinalCity = sc.nextDouble();

        System.out.print("Enter time taken from From City to Via City (in minutes): ");
        double timeFromToVia = sc.nextDouble();

        System.out.print("Enter time taken from Via City to Final Destination (in minutes): ");
        double timeViaToFinalCity = sc.nextDouble();

        
        double totalDistanceMiles = fromToVia + viaToFinalCity;
        double totalDistanceKm = totalDistanceMiles * 1.60934;
        double totalTime = timeFromToVia + timeViaToFinalCity;

        // Output
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + totalDistanceKm + " km and the Total Time taken is " + totalTime + " minutes");
        sc.close();
    }
}