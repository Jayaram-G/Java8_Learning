package reusableUtilities7Style;

public class StringUtilsImpl implements IStringUtils {

	@Override
	public String convertToUpperCase(String string) {
		
		return string.toUpperCase();
	}

	@Override
	public String convertToLowerCase(String string) {
		
		return string.toLowerCase();
	}
	

}
