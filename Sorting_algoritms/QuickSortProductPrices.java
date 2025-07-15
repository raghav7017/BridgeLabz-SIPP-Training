package Sorting_algoritms;
import java.util.Scanner;
public class QuickSortProductPrices {
	// Quick Sort function
    public static void quickSort(double[] prices, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(prices, low, high);

            // Recursively apply Quick Sort to the left and right subarrays
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Partition function
    public static int partition(double[] prices, int low, int high) {
        double pivot = prices[high]; // Choosing the last element as pivot
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is less than or equal to pivot
            if (prices[j] <= pivot) {
                i++;
                // Swap prices[i] and prices[j]
                double temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Swap pivot with the element at i+1 to put pivot in correct position
        double temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1; // Return the pivot index
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of products
        System.out.print("Enter number of products: ");
        int n = scanner.nextInt();

        double[] prices = new double[n];

        // Input: product prices
        System.out.println("Enter the prices of " + n + " products:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextDouble();
        }

        // Sort the prices using Quick Sort
        quickSort(prices, 0, n - 1);

        // Output: sorted prices
        System.out.println("Sorted Product Prices in ascending order:");
        for (double price : prices) {
            System.out.print(price + " ");
        }

        scanner.close();
    }

}
