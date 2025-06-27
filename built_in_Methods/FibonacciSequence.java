package built_in_Methods;

import java.util.Scanner;

public class FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt();


        printFibonacci(terms);

        scanner.close();
    }


    public static void printFibonacci(int terms) {
        int first = 0, second = 1;

        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
        } else if (terms == 1) {
            System.out.println("Fibonacci sequence:");
            System.out.println(first);
        } else {
            System.out.println("Fibonacci sequence:");
            System.out.print(first + " " + second);

            for (int i = 3; i <= terms; i++) {
                int next = first + second;
                System.out.print(" " + next);
                first = second;
                second = next;
            }

            System.out.println(); 
        }
    }
}

