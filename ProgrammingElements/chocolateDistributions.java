
package ProgrammingElements;
import java.util.Scanner;

public class chocolateDistributions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of chocolates: ");
        int numberOfchocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        int chocolatesPerChild = numberOfchocolates / numberOfChildren;
        int remainingChocolates = numberOfchocolates % numberOfChildren;

        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +
                " and the number of remaining chocolates is " + remainingChocolates);
        sc.close();
    }
}