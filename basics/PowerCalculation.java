package basics;
import java.util.Scanner;
public class PowerCalculation {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter Exponent: ");
        double exponent = scanner.nextDouble();

        double result = Math.pow(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " = " + result);
        scanner.close();
    }

}
