package reusableUtilities7Style;

public class Runner {

	public static void main(String[] args) {
		
		String name1 = "DHONI";
		
		String name2 = "dhoni";
		
		IStringUtils stringUtils = new StringUtilsImpl();
		
		String convertedString1 = stringUtils.convertToLowerCase(name1);
		
		String convertedString2 = stringUtils.convertToUpperCase(name2);
		
		System.out.println(convertedString1);
		
		System.out.println(convertedString2);
		
	}

}
