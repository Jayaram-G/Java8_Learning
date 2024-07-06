package anonymousInnerClassUsingConcreteClass;

public class Runner {
	
	public static void main(String[] args) {
		
		Parent child = new Parent() {
			
			public void findPartner() {
				System.out.println("My Life..My Rules from  anonymous inner class !!");
			}
		};
		
		child.educate();
		child.findPartner();
		child.leaveAssets();
		
		Parent parent = new Parent();
		
		parent.findPartner();
		
	}

}
