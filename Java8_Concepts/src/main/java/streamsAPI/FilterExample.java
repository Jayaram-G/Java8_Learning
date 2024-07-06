package streamsAPI;
import java.util.ArrayList;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		
		List<String> countries = new ArrayList<String>();
		
		countries.add("USSR");
		countries.add("USA");
		countries.add("China");
		countries.add("India");
		
		countries.stream()
		.limit(4)
		.forEach(System.out::println);

	}

}
