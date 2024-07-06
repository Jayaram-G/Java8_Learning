package getComfortableWithLamdas;

public class CarRunner {
	
	public void classicalWay() {
		Car benz = new Benz();
		benz.start();
	}
	
	public void usingAnonymousInnerClass() {
		Car benz = new Car() {
			@Override
			public void start() {
				System.out.println("Benz start from inner class");
			}		
		};
		benz.start();
	}
	
	
	public void usingLambdas() {
		Car benz = ()-> System.out.println("Start from Lambda");
		benz.start();
	}

	public static void main(String[] args) {
		
		CarRunner runner = new CarRunner();
		
		runner.classicalWay();
		runner.usingAnonymousInnerClass();
		runner.usingLambdas();

	}

}
