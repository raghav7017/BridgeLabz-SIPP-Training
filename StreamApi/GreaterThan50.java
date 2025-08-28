package StreamApi;
import java.util.*;
public class GreaterThan50 {
	public static void main (String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 55, 60, 70);
		Optional<Integer> firstGreaterThan50 = numbers.stream()
		     .filter(num -> num > 50)
		     .findFirst();
		System.out.println(firstGreaterThan50.orElse(null)); 

	}

}
