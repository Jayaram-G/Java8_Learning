package streamsAPI.CollectorsExample;
import static java.util.stream.Collectors.*;
import java.util.Arrays;
import java.util.List;

public class ToUnmodifiableListExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("MSD","Virat","Jadeja");
		
		List<Integer> length = names.stream().map(String::length).collect(toUnmodifiableList());
		
		System.out.println(length);
		
		length.add(5);
		
		System.out.println(length);
		

	}

}
