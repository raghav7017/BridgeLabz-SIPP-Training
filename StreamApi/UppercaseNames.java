package StreamApi;

import java.util.Arrays;
import java.util.List;

public class UppercaseNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("deepak", "ravi", "smita");
        names.stream()
             .map(String::toUpperCase)
             .forEach(name -> System.out.print(name + " "));
        
    }
}
