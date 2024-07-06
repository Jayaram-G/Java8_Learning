package methodReferenceExamples;

interface IAdd{
	public void add(int num1,int num2);
}

public class StaticExample {
	
	public static void sum(int val1,int val2) {
		System.out.println(val1+val2);
	}

	public static void main(String[] args) {
		
		//sum(1,2);
		
		IAdd iAdd = StaticExample::sum;
		iAdd.add(1, 2);
		
		
	}

}
