package defaultMethodsExample;

public class Chrome implements Browser{

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("Chrome Browse");
		
	}
	
	public void playMedia() {
		System.out.println("Chrome media player");
	}
	
	public static void main(String[] args) {
		
		Browser chrome = new Chrome();
		
		chrome.playMedia();
		
	}

	

}
