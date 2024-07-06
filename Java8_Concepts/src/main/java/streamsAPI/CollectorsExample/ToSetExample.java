package streamsAPI.CollectorsExample;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class ToSetExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("MSD","Virat","Jadeja","MSD");
		
		Set<String> duplicatesRemoved = names.stream().collect(Collectors.toSet());
		
		System.out.println(duplicatesRemoved);

	}

}
