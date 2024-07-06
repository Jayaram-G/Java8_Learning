package streamsAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		
		List<String> DC = Arrays.asList("Batman","Superman","Flash");
		List<String> Marvel = Arrays.asList("Captain America","Iron Man","Spider Man");
		List<String> XMen = Arrays.asList("Wolverine","Magneto","Professor X");
		
		List<List<String>> supers =	Arrays.asList(DC,Marvel,XMen);
		
		System.out.println(supers);
		
		List<String> singleList =supers.stream()
		.flatMap(List :: stream)
		.collect(Collectors.toList());
		
		System.out.println(singleList);

	}

}
