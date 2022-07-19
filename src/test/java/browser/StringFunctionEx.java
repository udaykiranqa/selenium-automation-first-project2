package browser;

public class StringFunctionEx {

	public static void main(String[] args) {

		String name = "Uday";

		// length
		int count = name.length();
		System.out.println("length is: " + count);

		String str = "Selenium";

		// conversion functions
		// lowerCase
		System.out.println(str.toLowerCase());

		// upperCase
		System.out.println(str.toUpperCase());

		// comparision functions.
		// Expected value vs actual value.
		String expectedTitle = "Google";
		String actualTitle = "google"; // reading from application.

		// Equals -------- exact Match (with lowercase/uppercase)
		// EqualsignoreCase --------ignore lowercase/uppercase.
		// contains.

		// verify --condition
		if (expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("PASS - both values are Equal");
		} else {

			System.out.println("FAIL - both values are not Equal");
		}

		// contains
		String citiUrl = "https://www.citi.com/credit-cards/compare/view-all-credit-cards";

		// verify.
		if (citiUrl.contains("https://www.citii.com")) {

			System.out.println("PASS - url contains citi.com");
		} else {
			System.out.println("FAIL - url doesn't contains citi.com");

		}

		//starts-with		
		String companyName="CTS";
		// starts with 'C
		
		//check
		if (companyName.startsWith("C")) {
			System.out.println("Yes");
			
		}else {
			System.out.println("No");
		}
		
		//Substring
		String strr="selenium java";
		System.out.println(strr.substring(0));
		System.out.println(strr.substring(0, 8));
		
		//Array ---index starts from '0
		//Collection ----------------'0
		//String --------------------'0
		
		String companyNames[]={"CTS", "Wipro", "TCS", "Capgemini", "CompuCom"};
		//Print all the compaNy Names that starts-with 'C
		
	}

}
