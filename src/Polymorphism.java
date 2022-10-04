
//add, substraction, division, multiplication, mod

class Arithmetic
{
	void sum() //Zero parameters
	{
		System.out.println("no value to add");
	}
	
	void sum(int  i, int j)
	{
		int k = i + j;
		
		System.out.println("sum of two number -" + k );
	}
	
	void sum(int i, int j, int k)
	{
		int h = i+j+k;
		System.out.println("sum of 3 numbers - " + h);
	}
}



public class Polymorphism {
	
	public static void main(String[] args) {
		Arithmetic a = new Arithmetic();
		a.sum(10, 20);
		a.sum(10, 10, 10);
	}
	
	

}
