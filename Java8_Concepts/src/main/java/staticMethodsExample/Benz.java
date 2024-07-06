package staticMethodsExample;

public class Benz implements Car {
	
	
	public static void start() {
		System.out.println("Started from Benz static method");
	}

	public static void main(String[] args) {
		
		Car.start();
		Benz.start();

	}

}
