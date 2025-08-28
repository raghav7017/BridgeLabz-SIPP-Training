package StreamApi;
import java.util.*;
import java.util.stream.Collectors;
public class SquaresOfNumbers {
	public static void main (String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> squares = numbers.parallelStream()
		    .map(n -> n * n)
		    .collect(Collectors.toList());

		System.out.println(squares); 

	}

}
