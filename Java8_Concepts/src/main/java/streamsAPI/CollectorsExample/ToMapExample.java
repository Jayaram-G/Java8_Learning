package streamsAPI.CollectorsExample;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMapExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("MSD","Virat","Jadeja","MSD");

		Map<String,Integer> map = names.stream().collect(Collectors.toMap
				(Function.identity(), String::length,(key1,key2)->key1));
		
		System.out.println(map);

	}

}
