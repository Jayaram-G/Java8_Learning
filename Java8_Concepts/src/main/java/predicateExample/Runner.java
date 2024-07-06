package predicateExample;

import java.util.function.Predicate;

public class Runner {

	public static void main(String[] args) {
		
		Eligibility eligibility = new Eligibility();
		
		System.out.println(eligibility.above18(13));
		
		Predicate<Integer> eligible=(age)->age>=18;
		
		System.out.println(eligible.test(18));

	}

}
