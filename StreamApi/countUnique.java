package StreamApi;
import java.util.*;
public class countUnique {
	public static void main (String[] args) {
	List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana");
	long uniqueCount = words.stream().distinct().count();
	System.out.println (uniqueCount);
	
}
}
