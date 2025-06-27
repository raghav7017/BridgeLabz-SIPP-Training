package ArraysProblems;

import java.util.*;

public class DigitFrequencyCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // Input the number

        // Convert number to positive (to handle negative input)
        number = Math.abs(number);

        int[] digits = new int[10]; // To store frequency of digits 0–9

        while (number > 0) {
            int digit = number % 10;
            digits[digit]++;
            number = number / 10;
        }

        // Display frequencies
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > 0) {
                System.out.println("Digit " + i + " occurs " + digits[i] + " time(s).");
            }
        }
        sc.close();
    }
}
