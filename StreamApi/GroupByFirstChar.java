package StreamApi;
import java.util.*;
import java.util.stream.Collectors;
public class GroupByFirstChar {
	public static void main (String[] args) {
		List<String> names = Arrays.asList("apple", "ant", "banana", "ball", "cat");
		Map<Character, List<String>> grouped = names.stream()
		     .collect(Collectors.groupingBy(name -> name.charAt(0)));
		System.out.println(grouped);
		

	}

}
