package Sorting_algoritms;
import java.util.Scanner;
public class MergeSortBookPrices {
	// Merge Sort function
    public static void mergeSort(double[] prices, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Recursively divide the array into halves
            mergeSort(prices, left, mid);
            mergeSort(prices, mid + 1, right);

            // Merge the sorted halves
            merge(prices, left, mid, right);
        }
    }

    // Merge function
    public static void merge(double[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        double[] leftArray = new double[n1];
        double[] rightArray = new double[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            leftArray[i] = prices[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = prices[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge the arrays back into prices[]
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                prices[k] = leftArray[i];
                i++;
            } else {
                prices[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            prices[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            prices[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of books
        System.out.print("Enter number of books: ");
        int n = scanner.nextInt();

        double[] prices = new double[n];

        // Input: book prices
        System.out.println("Enter the prices of " + n + " books:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextDouble();
        }

        // Sort the array using Merge Sort
        mergeSort(prices, 0, n - 1);

        // Output: sorted prices
        System.out.println("Sorted Book Prices in ascending order:");
        for (double price : prices) {
            System.out.print(price + " ");
        }

        scanner.close();
    }
	

}
