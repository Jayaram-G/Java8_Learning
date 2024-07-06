package getComfortableWithLamdas;

public class PanchayatRunner {
	
	public void usingClassicalWay() {
		IPanchayat panchayat = new PanchayatImpl();
		System.out.println("Classical Way :"+panchayat.interrogate("Ponna kayya pudichi Iluthia ?"));
	}
	
	public void usingAnonymousClass() {
		
		IPanchayat panchayat = new IPanchayat() {
			
			@Override
			public String interrogate(String question) {
				
				return "Enna "+question;
			}
		};
		System.out.println("Anonymous Class :"+panchayat.interrogate("Ponna kayya pudichi Iluthia ?"));
	}
	
	public void usingLambdas() {
		
	IPanchayat panchayat = (question)->"Enna "+question;
	System.out.println("Lambdas :"+panchayat.interrogate("Ponna kayya pudichi Iluthia ?"));
		
	}

	public static void main(String[] args) {
		
		PanchayatRunner runner = new PanchayatRunner();
		runner.usingClassicalWay();
		runner.usingAnonymousClass();
		runner.usingLambdas();
		
	}

}
