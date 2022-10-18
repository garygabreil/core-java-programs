
/*Private 
	 variable
	 methods
	 constructor (not recommended)
	 classes (not recommended)
*/

class ExampleOfPrivate{
	
	private  int a = 10; //variable
	
	
	 private void sum() // method
	{
		System.out.println( a + a );
	}
	
	 
	 /*
	 private ExampleOfPrivate() //constructor
	 {
		 
	 }
	 */
	 
	 
	 
	

}

class AccessModifier {
	
	public static void main(String[] args) {
		
		ExampleOfPrivate obj = new ExampleOfPrivate();
		//System.out.println(obj.sum());
		
	}

}
