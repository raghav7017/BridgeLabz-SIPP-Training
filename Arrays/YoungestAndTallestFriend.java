package ArraysProblems;

import java.util.*;

public class YoungestAndTallestFriend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Step 1: Take user input for age and height
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age and height for " + names[i] + ":");
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }

        // Step 2: Find youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Step 3: Display results
        System.out.println("\nYoungest friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + ")");

        sc.close(); // Close the scanner
    }
}
