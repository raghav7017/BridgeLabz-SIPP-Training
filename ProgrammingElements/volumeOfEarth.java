package ProgrammingElements;
public class volumeOfEarth {
    public static void main(String[] args) {
        double radius = 6378;
        double radiusinMiles = radius * 0.621371;

        double volumeInCubicKm = 4/3 * Math.PI * Math.pow(radius,3);

        double volumeInCubicMiles = 4/3 * Math.PI * Math.pow(radiusinMiles,3) ;

        System.out.println(" The volume of earth in cubic kilometers is " + volumeInCubicKm + " and cubic miles is  " + volumeInCubicMiles);
        
    }
}