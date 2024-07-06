package classicalExample;
import java.io.File;
import java.io.FileFilter;

public class ShowHiddenFiles {
	
	FileFilter fileFilter;
	
	public static void beforeJava8() {
		File[] hiddenFiles = new File("C:\\Users\\USER\\Desktop")
				.listFiles(new FileFilter() {
					
					public boolean accept(File file) {
						return file.isHidden();
					}
				});
		
		for (File file : hiddenFiles) {
			
			System.out.println(file.getName());
		}
	}
	
	//file->file.isHidden();
	
	public static void usingMethodReference() {
		File[] hiddenFiles = new File("C:\\Users\\USER\\Desktop")
				.listFiles(File::isHidden);
		
		for (File file : hiddenFiles) {
			System.out.println(file.getName());
		}
		
		
	}
	
	public static void main(String[] args) {
		usingMethodReference();
		
		
	}

}
