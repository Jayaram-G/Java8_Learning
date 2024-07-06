package anonymousInnerClassAsMethodArguments;

public class Runner {

	public static void main(String[] args) {
		
		Friend friend = new Friend();
		
		friend.canManage(new IManageable() {
			public void manage() {
				System.out.println("Kaal la vilunthu kathariduven..!!");
			}
		});

	}

}
