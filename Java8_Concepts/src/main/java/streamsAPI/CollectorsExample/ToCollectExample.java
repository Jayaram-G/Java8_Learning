package streamsAPI.CollectorsExample;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ToCollectExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("MSD","Virat","Jadeja","MSD");
		
		LinkedList<String> result = names.stream().filter(name->name.length()>4).collect(Collectors.toCollection(LinkedList::new));

		System.out.println(result);
	}

}
