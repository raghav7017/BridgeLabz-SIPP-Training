package StreamApi;

import java.util.Arrays;
import java.util.List;

public class SortDescending {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 9, 2, 7, 3);
        numbers.stream()
               .sorted((a, b) -> b - a)
               .forEach(n -> System.out.print(n + " "));
        
    }
}
