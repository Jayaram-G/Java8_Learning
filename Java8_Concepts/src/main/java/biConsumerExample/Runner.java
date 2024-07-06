package biConsumerExample;

import java.util.function.BiConsumer;

public class Runner {

	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> add = (num1,num2)->System.out.println(num1+num2); 
		
		//add.accept(1, 2);
		
		BiConsumer<Integer, Integer> multiplication = (num1,num2)->System.out.println(num1*num2);
		
		//multiplication.accept(3, 3);
		
		add.andThen(multiplication).accept(1, 7);
	}

}
