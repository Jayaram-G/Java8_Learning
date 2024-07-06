package defaultMethodsWithMultipleInheritance;

public class Neenga implements IThagappar,IAalu {
	
	public void joinCollege() {
		
		System.out.println("Seetu kuliki pottu decide pannikuran !!");
	}

	public static void main(String[] args) {
		
		IThagappar neenga = new Neenga();
		neenga.joinCollege();
	}

}
