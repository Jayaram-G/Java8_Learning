package streamsAPI;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethodExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

		Optional<Integer> result = numbers.stream().reduce((sum,elements)->sum+elements);
		
		System.out.println(result);
		
		Optional<Integer> max = numbers.stream().reduce(Integer::max);
		
		System.out.println(max);
		
		Optional<Integer> min = numbers.stream().reduce(Integer::min);
		
		System.out.println(min);
		
		long count = numbers.stream().count();
		
		System.out.println(count);
		
	}

}
