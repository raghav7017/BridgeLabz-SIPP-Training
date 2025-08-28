package StreamApi;
import java.util.*;
import java.util.stream.Collectors;
public class ConvetListsToList {
	public static void main (String[] args) {
		List<List<Integer>> list = Arrays.asList(
			    Arrays.asList(1, 2),
			    Arrays.asList(3, 4),
			    Arrays.asList(5, 6)
			);

			List<Integer> flatList = list.stream()
			    .flatMap(List::stream)
			    .collect(Collectors.toList());

			System.out.println(flatList); 

	}

}
