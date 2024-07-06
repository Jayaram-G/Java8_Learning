package biFunctionExample;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Runner {

	public static void main(String[] args) {
		
		//firstname,lastname -> fullname
		
		BiFunction<String, String, String> fullName = 
			(firstName,lastName)->firstName +" "+ lastName;
		System.out.println(fullName.apply("Bat", "Man"));
		
		//num1,num2 -> avg
		
		BiFunction<Integer,Integer,Number> average = 
				(num1,num2)-> (num1+num2)/2.0;
		System.out.println(average.apply(1, 2));
		
		//Bat,Super,Wonder -> list
		//man,man,woman -> list
		//Bat man,Super man,Wonder woman -> list
		
		List<String> list1 =Arrays.asList("Bat","Super","Wonder");
		List<String> list2 =Arrays.asList("man","man","woman");
		
		List<String> supers = new ArrayList<String>();
		
		BiFunction<List<String>, List<String>, List<String>> justiceLeague =
				(n1,n2)->{
					for(int i=0;i<list1.size();i++) {
						supers.add(list1.get(i)+list2.get(i));
					}
					return supers;
				};
		System.out.println(justiceLeague.apply(list1, list2));
		

	}

}
