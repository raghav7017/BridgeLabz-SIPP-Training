package Stack_and_Queue_and_HashMaps;

import java.util.*;

public class PairWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        boolean found = hasPairWithSum(arr, target);

        if (found) {
            System.out.println("Yes, a pair with the given sum exists.");
        } else {
            System.out.println("No, such a pair does not exist.");
        }
    }

    static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println("Pair found: " + complement + " + " + num + " = " + target);
                return true;
            }
            seen.add(num);
        }

        return false;
    }
}

