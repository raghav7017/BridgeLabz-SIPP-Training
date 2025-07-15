package Sorting_algoritms;
import java.util.Scanner;
public class CountingSortStudentAges {
	 // Counting Sort function
    public static void countingSort(int[] ages) {
        int minAge = 10;
        int maxAge = 18;
        int range = maxAge - minAge + 1;

        // Step 1: Count frequency of each age
        int[] count = new int[range];
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 2: Compute cumulative frequency
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Build the output (sorted) array
        int[] sortedAges = new int[ages.length];
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            sortedAges[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }

        // Step 4: Copy sorted array back to original
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sortedAges[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of students
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[] ages = new int[n];

        // Input: student ages
        System.out.println("Enter the ages of " + n + " students (between 10 and 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = scanner.nextInt();
            if (ages[i] < 10 || ages[i] > 18) {
                System.out.println("Invalid age! Please enter ages between 10 and 18.");
                i--; // repeat this index
            }
        }

        // Sort the ages using Counting Sort
        countingSort(ages);

        // Output: sorted ages
        System.out.println("Sorted student ages in ascending order:");
        for (int age : ages) {
            System.out.print(age + " ");
        }

        scanner.close();
    }

}
