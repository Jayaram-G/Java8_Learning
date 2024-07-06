package consumerExample;

import java.util.function.Consumer;

public class ConsumerExample  {

	public void usingAnonymousStyle() {
		
		Consumer<String> printThis = new Consumer<String>() {
			@Override
			public void accept(String input) {
				System.out.println(input);
			}
		};
		printThis.accept("Vanakkam !! from Anonymous");
		
	}
	
	public void usingLambda() {
		
		Consumer<String> consumer1 = (input)->System.out.println(input+ " is a word");
		
		Consumer<String> consumer2 = (input)->System.out.println(input+" di mapla is an emotion");
		
		consumer1.andThen(consumer2).accept("Vanakkam");
	}
	
	
	
	public static void main(String[] args) {
		
		ConsumerExample example = new ConsumerExample();
		example.usingAnonymousStyle();
		example.usingLambda();
		
	}

}
