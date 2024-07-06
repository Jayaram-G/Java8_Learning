package andThenCompose;
import java.util.function.Function;

public class AndThenComposeExample {

	public static void main(String[] args) {

		Function<String, String> tenth = (study) ->{
			System.out.println("Finish 10th std first");
			return "";
		}; 

		Function<String, String> eleventh = (study) ->{
			System.out.println("Study 11th next");
			return "";
		}; 

		//tenth.apply("study");
		//eleventh.apply("");
		
		tenth.andThen(eleventh).apply("");	

		System.out.println("===========================");

		tenth.compose(eleventh).apply("");
	}

}
