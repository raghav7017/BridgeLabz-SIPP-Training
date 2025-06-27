package built_in_Methods;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lower = 1;
        int upper = 100;
        boolean correct = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");
        System.out.println("After each guess, type:");
        System.out.println("  'low' if my guess is too low");
        System.out.println("  'high' if my guess is too high");
        System.out.println("  'correct' if I guessed it right");

        while (!correct && lower <= upper) {
            int guess = generateGuess(lower, upper);
            System.out.println("Is your number " + guess + "?");
            String feedback = getFeedback(scanner);

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Yay! I guessed your number!");
                correct = true;
            } else if (feedback.equalsIgnoreCase("low")) {
                lower = guess + 1;
            } else if (feedback.equalsIgnoreCase("high")) {
                upper = guess - 1;
            } else {
                System.out.println("Invalid input! Please type 'low', 'high', or 'correct'.");
            }
        }

        if (!correct) {
            System.out.println("Hmm... something went wrong. Are you sure you gave the right hints?");
        }

        scanner.close();
    }

    
    public static int generateGuess(int lower, int upper) {
        Random rand = new Random();
        return rand.nextInt(upper - lower + 1) + lower;
    }

    
    public static String getFeedback(Scanner scanner) {
        System.out.print("Your feedback (low/high/correct): ");
        return scanner.nextLine();
    }
}

