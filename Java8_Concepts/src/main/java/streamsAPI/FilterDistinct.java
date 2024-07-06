package streamsAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDistinct {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ram","Deepi","Abi","Manju","Ram","Abi","Ram");
		
		names.stream().distinct().forEach(System.out::println);
		
	}
}
