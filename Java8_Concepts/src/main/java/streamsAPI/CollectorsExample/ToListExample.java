package streamsAPI.CollectorsExample;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

public class ToListExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("MSD","Virat","Jadeja");
		
		List<Integer> length = names.stream().map(String::length).collect(toList());
		
		System.out.println(length);
		
		//length.add(5);
		
		//System.out.println(length);
		
		
	}

}
