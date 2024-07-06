package biPredicateExample;

import java.util.function.BiPredicate;

public class Runner {

	public static void main(String[] args) {
		
		//last name hould not be empty
		
		BiPredicate<String,String> pred1 = (firstName,lastName)->{
			
			return	lastName.length()>0;
		};
		
		System.out.println(pred1.test("jai",""));
		
		//check equality of two strings
		
		BiPredicate<String,String> pred2 =(string1,string2)->{
			return string1.equals(string2);
		};
			System.out.println(pred2.test("JAI","jai"));
			
		//check equality ignore case sensitivity
			
		BiPredicate<String, String> pred3 = (input1,input2)->input1.equalsIgnoreCase(input2);
		
		System.out.println(pred3.test("Ram","ram"));
	}

}
