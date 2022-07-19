package browser;

public class Program {

	public static void main(String[] args) {
		// find a company starts with 'C
		// single or multiple values ?

		String company[] = {"CTS", "Wipro", "CompuCom", "TCS"};
		int count = company.length;
		System.out.println("count is :: " + count);

		//index
		for (int i = 0; i <count; i++) {
			
			//condition
			if (company[i].startsWith("C")) {
				System.out.println(company[i]);
			}
			
		}
		
	}

}
