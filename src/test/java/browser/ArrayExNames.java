package browser;

public class ArrayExNames {
	
	public static void main(String[] args) {
		
		//arrays
		String names[]= {"uday", "goury", "avinash", "mounika", "venki"};
	
		// n-1 --last value
		int count = names.length;
		for (int i = 0; i < count; i++) {
			
			System.out.println(names[i]);
			
			if (names[i]=="avinash") {
				break;
				
			}
			
		}
		
		
	}

}
