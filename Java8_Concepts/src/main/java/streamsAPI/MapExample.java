package streamsAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
	
	public static void main(String[] args) {
		
		List<String> pirates = Arrays.asList("Monkey D Luffy","Jack Sparrow","Barbosa");
		
	List<Integer> count = pirates.stream()
		.map(String::length)
		.collect(Collectors.toList());
	
	count.forEach(System.out::println);
		
	}

}
