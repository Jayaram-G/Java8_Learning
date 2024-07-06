package functionExamples;

import java.util.function.Function;

public class MoreFunctionExamples {
	
	public void findSquare() {
		
		Function<Integer,Integer> square = input -> input*input;
		
		System.out.println(square.apply(7));
	}
	
	public void countTheLetters() {
		
		Function<String, Integer> length = givenString -> givenString.length();
		
		System.out.println(length.apply("MSDhoni"));
	}
	
	public void convertToUpperCase() {
		
		Function<String, String> toUpperCase = inputString -> inputString.toUpperCase();
		
		System.out.println(toUpperCase.apply("spiderman"));
	}
	
	public void checkEmpty() {
		
		Function<String,Boolean> empty =inputString -> inputString.isEmpty() 
				|| inputString.isBlank() || inputString.equals("");
		
		System.out.println(empty.apply("Empty?"));
	}
	
	public static void main(String[] args) {
		
		MoreFunctionExamples examples = new MoreFunctionExamples();
		examples.findSquare();
		examples.countTheLetters();
		examples.convertToUpperCase();
		examples.checkEmpty();
	}

}
