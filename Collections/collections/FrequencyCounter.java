package collections;

import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        List<String> items = new ArrayList<>();
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            items.add(sc.nextLine());
        }

        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String item : items) {
            if (frequencyMap.containsKey(item)) {
                frequencyMap.put(item, frequencyMap.get(item) + 1);
            } else {
                frequencyMap.put(item, 1);
            }
        }

        System.out.println("Frequencies: " + frequencyMap);
    }
}