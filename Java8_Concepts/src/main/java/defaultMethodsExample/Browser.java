package defaultMethodsExample;


public interface Browser {
	
	void browse();
	
	default void playMedia() {
		System.out.println("Browser media player");
	}
	
	default void playMedia1() {
		System.out.println("Browser media player");
	}
	
	default void playMedia2() {
		System.out.println("Browser media player");
	}

}
