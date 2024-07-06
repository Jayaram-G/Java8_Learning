package streamsAPI;
import java.util.Arrays;
import java.util.List;

public class NoneMatchExample {

	public static void main(String[] args) {
		
		List<String> status =Arrays.asList("SILENT","SILENT","SILENT");
		
		boolean result = status.stream().noneMatch(string->string.equalsIgnoreCase("shout"));
		
		System.out.println(result);

	}

}
