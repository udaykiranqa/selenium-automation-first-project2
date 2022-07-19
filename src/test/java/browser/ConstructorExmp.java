package browser;

public class ConstructorExmp {

	// declaration.
	int a = 10, b = 20, c;
	
	//constructor - Method
	public ConstructorExmp() {
		System.out.println("this is a method --constructor");
	}

	// method
	public void add() {
		c = a + b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		//call this function - by using object.
		
		ConstructorExmp obj = new ConstructorExmp();
		obj.add(); //call
		
		
	}
	
}
