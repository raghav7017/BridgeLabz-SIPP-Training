package basics;
import java.util.Scanner;
public class RectanglePerimeter {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter Width of the rectangle: ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);

        System.out.println("Perimeter of the rectangle = " + perimeter);
        scanner.close();
    }
}
