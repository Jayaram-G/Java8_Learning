package streamsAPI;
import java.util.Arrays;
import java.util.List;

public class AllMatchExample {

	public static void main(String[] args) {
		
		List<String> status =Arrays.asList("SILENT","SILENT","SILENT");
		
		boolean result = status.stream().allMatch(string->string.equalsIgnoreCase("silent"));
		
		System.out.println(result);

	}

}
