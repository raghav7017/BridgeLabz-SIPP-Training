package ControlFlow;
import java.util.Scanner;

public class naturalSum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
            
        }

        int sum1
         = 0;
        int counter = 1;
        while (counter <= n) {
            sum1
             += counter;
            counter++;
        }

        int sum2
         = n * (n + 1) / 2;

        System.out.println("Sum using while loop: " + sum1
        );
        System.out.println("Sum using formula: " + sum2
        );

        if (sum1
         == sum2
         ) {
            System.out.println("Both computations are correct and equal.");
        } else {
            System.out.println("There is a mismatch in the results.");
        }
        sc.close();
    }
}