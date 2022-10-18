//default
	


class A{
	
	void displayNumber()
	{
		System.out.println("this is using default modifier");
	}
	
}

public class AccessModifierExample2 {
	
	public static void main(String[] args) {
		
		A obj = new A();
		obj.displayNumber();
		
	}

}

