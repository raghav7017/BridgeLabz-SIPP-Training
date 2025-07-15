package Sorting_algoritms;
import java.util.Scanner;

public class SelectionSortExamScores {
	 // Selection Sort function
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        // Move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of students
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[] scores = new int[n];

        // Input: exam scores
        System.out.println("Enter the exam scores of " + n + " students:");
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        // Sort the exam scores using Selection Sort
        selectionSort(scores);

        // Output: sorted scores
        System.out.println("Sorted Exam Scores in ascending order:");
        for (int score : scores) {
            System.out.print(score + " ");
        }

        scanner.close();
    }

}
