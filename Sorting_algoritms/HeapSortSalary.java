package Sorting_algoritms;
import java.util.Scanner;
public class HeapSortSalary {
	 // Heap Sort function
    public static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Step 1: Build a Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root (largest) to end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Call heapify on the reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Heapify function to maintain heap property
    public static void heapify(int[] salaries, int heapSize, int rootIndex) {
        int largest = rootIndex; // Initialize largest as root
        int left = 2 * rootIndex + 1; // left child
        int right = 2 * rootIndex + 2; // right child

        // If left child is larger than root
        if (left < heapSize && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < heapSize && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // If largest is not root, swap and heapify affected subtree
        if (largest != rootIndex) {
            int swap = salaries[rootIndex];
            salaries[rootIndex] = salaries[largest];
            salaries[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(salaries, heapSize, largest);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of applicants
        System.out.print("Enter number of job applicants: ");
        int n = scanner.nextInt();

        int[] salaries = new int[n];

        // Input: salary demands
        System.out.println("Enter the salary expectations:");
        for (int i = 0; i < n; i++) {
            salaries[i] = scanner.nextInt();
        }

        // Sort using Heap Sort
        heapSort(salaries);

        // Output: sorted salaries
        System.out.println("Sorted salary expectations in ascending order:");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }

        scanner.close();
    }

}
