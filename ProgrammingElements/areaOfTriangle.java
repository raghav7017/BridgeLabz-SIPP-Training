package ProgrammingElements;
import java.util.*;
public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextInt();
        double height = sc.nextInt();

        double areaSqCm = 0.5 * (base * height);
        double areaSqIn = areaSqCm/(2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is "+ areaSqIn + "  and sq cm is " + areaSqCm);
        sc.close();
    } 
    
}