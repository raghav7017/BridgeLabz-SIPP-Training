package Stack_and_Queue_and_HashMaps;

import java.util.*;

public class ZeroSumSubarrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findZeroSumSubarrays(arr);
    }

    static void findZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> sumToIndices = new HashMap<>();
        int currentSum = 0;
        sumToIndices.put(0, new ArrayList<>());
        sumToIndices.get(0).add(-1);

        boolean found = false;

        
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (sumToIndices.containsKey(currentSum)) {
                List<Integer> startIndices = sumToIndices.get(currentSum);
                for (int start : startIndices) {
                    System.out.println("Zero-sum subarray: [" + (start + 1) + ", " + i + "]");
                    found = true;
                }
            }

            if (!sumToIndices.containsKey(currentSum)) {
                sumToIndices.put(currentSum, new ArrayList<>());
            }
            sumToIndices.get(currentSum).add(i);
        }

        if (!found) {
            System.out.println("No subarrays with zero sum found.");
        }
    }
}

