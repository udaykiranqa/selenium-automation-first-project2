package browser;

public class StringFunctionsExa {

	public static void main(String[] args) {

		String name = "UdayKiran"; // index starts from 0

		// count - length
		int count = name.length();
		System.out.println(count);

		// conversion functions.
		// UpperCase

		System.out.println(name.toUpperCase());

		// to LowerCase
		System.out.println(name.toLowerCase());

		// Substring -----
		String str = "Selenium java welcome";
		System.out.println(str.substring(9)); // extract sub portion value.
		System.out.println(str.substring(9, 13));

		// chartAt
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(9));
		System.out.println(str.charAt(14));

		// a[index] --array
		// list.get(index) --collection
		// chartAt(index) --String.

		// starts-with
		String company = "Wipro";
		System.out.println(company.startsWith("C")); // true

		// compare functions.
		// ---equals // exact match
		String expectedTitle = "Google";
		String actualTitle = "google"; // read from application.
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("PASS -- title does matches");
		} else {
			System.out.println("FAIL -- title does not matches");

		}
		// equalsIgnoreCase
		if (expectedTitle.equalsIgnoreCase(actualTitle)) {
			System.out.println("PASS -- title does matches");
		} else {
			System.out.println("FAIL -- title does not matches");

		}

		// Contains.//read from application.
		String url = "https://www.citi.com/credit-cards/compare/view-all-credit-cards";

		if (url.contains("https://www.citi.com")) {
			System.out.println("CITI Bank - PASS");
		}else {
			System.out.println("Not redirecting CITI Bank - FAIL");

		}
		
		
	}

}
