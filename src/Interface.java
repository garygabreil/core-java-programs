

/*
 *  -->  Interface keyword should be used
	-->  Method can be declared not defined
	-->  “Implements” keyword should to use interface methods
	-->  Cannot create objects
 * */

interface Abc
{
	
	//public static and final-- variable
	
	//public static final ;
	int a = 0;
	
	//public abstract --methods
	void sumOfTwoNumber();
    void show();
}



public class Interface implements Abc{

	@Override
	public void sumOfTwoNumber() {
		
		System.out.println(2 + 2 );
		
		
	}

	@Override
	public void show() {
		
		//logic
		System.out.println("show sum my interace");
		
	}
	
	
	public static void main(String[] args) {
		Interface i1 = new Interface();
		i1.show();
		i1.sumOfTwoNumber();
	}
	
	
}
