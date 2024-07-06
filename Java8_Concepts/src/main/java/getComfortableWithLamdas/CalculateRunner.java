package getComfortableWithLamdas;

public class CalculateRunner {
	
	public void usingClassicalWay() {
		Calculate calculate = new CalculatorImpl();
		System.out.println("Classical Way :"+calculate.add(1, 2));
	}
	
	public void usingAnonymousClass() {
		
		Calculate calculate = new Calculate() {
			
			@Override
			public int add(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1+num2;
			}
		};
		System.out.println("Using Anonymous class :"+calculate.add(1, 2));
	}
	
	public void usingLambdas() {
		Calculate calc = (val1,val2) -> val1+val2;
		
		System.out.println("Using Lambdas :"+calc.add(1, 2));
	}

	public static void main(String[] args) {
		CalculateRunner runner = new CalculateRunner();
		
		runner.usingClassicalWay();
		runner.usingAnonymousClass();
		runner.usingLambdas();
	}

}
