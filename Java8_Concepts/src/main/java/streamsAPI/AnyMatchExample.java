package streamsAPI;
import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {

	public static void main(String[] args) {
		
	List<String> status =Arrays.asList("SHOUT","SILENT","SHOUT");
	
	boolean result = status.stream().anyMatch(string->string.equalsIgnoreCase("shout"));
	
	System.out.println(result);

	}

}
