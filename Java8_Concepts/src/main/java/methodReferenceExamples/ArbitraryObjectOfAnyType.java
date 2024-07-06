package methodReferenceExamples;
import java.util.function.Function;

public class ArbitraryObjectOfAnyType {

	public static void main(String[] args) {
		
		Function<String, String> lambda_lowerCase = input->input.toLowerCase();
		System.out.println(lambda_lowerCase.apply("DHONI"));
		
		Function<String,String> metRef_LowerCase = String :: toLowerCase;
		System.out.println(metRef_LowerCase.apply("DHONI"));
		
		Function<String,Integer> lambda_Count = input->input.length();
		System.out.println(lambda_Count.apply("Dhoni"));
		
		Function<String,Integer> metRef_Count = String::length;
		System.out.println(metRef_Count.apply("Msdhoni"));

	}

}
