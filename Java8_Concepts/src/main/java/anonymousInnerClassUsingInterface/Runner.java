package anonymousInnerClassUsingInterface;

public class Runner {

	public static void main(String[] args) {
		
		IParent obj = new IParent() {

			@Override
			public void findPartner() {
				
				System.out.println("I will find my partner from inner class");
				
			}
		};
			
			obj.findPartner();

	}

}
