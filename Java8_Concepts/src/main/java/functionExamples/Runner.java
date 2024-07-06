package functionExamples;

import java.util.function.Function;

public class Runner {
	
	public void lambdaStyle() {
		
		Function<Integer,Double> usd2Inr = usd -> usd*81.5;
		
		System.out.println("Lambda :"+usd2Inr.apply(10));
	}
	
	public void usingAnonymous() {
		
		Function<Integer,Double> usd2Inr = new Function<Integer, Double>() {
			
			@Override
			public Double apply(Integer usd) {
				
				return usd*81.5;
			}
		};
		System.out.println("Anonymous :"+usd2Inr.apply(12));
	}
	
	public void askRockyLambdaStyle() {
		
		Function<String,String> askRocky =	question -> "Intha ulagam !!";
	
		System.out.println(askRocky.apply("Enna thanda venum unakku?"));
		
	}

	public static void main(String[] args) {
		
		Runner runner = new Runner();
		runner.lambdaStyle();
		runner.usingAnonymous();
		runner.askRockyLambdaStyle();
	}

}
