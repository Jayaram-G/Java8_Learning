package forEachExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Runner {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,5,7,9);
		//before 1.5
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("==========================");
		//for each
		for(Integer listOfElements:list) {
			System.out.println(listOfElements);
		}
		
		System.out.println("==========================");
		//for each ()
		Consumer<Object> consumer = input->System.out.println(input);
		
		list.forEach(consumer);
		
		//list.forEach(input->System.out.println(input));

	}

}
