package anonymousInnerClassUsingAbstractClass;

public class Runner {

	public static void main(String[] args) {

		Parent obj = new Parent() {

			@Override
			public void findPartner() {
				System.out.println("My Life..My Rules from inner class !!");
			}
		};
		
		obj.findPartner();

	}

}
