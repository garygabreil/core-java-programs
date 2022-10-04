
/*
 * Abstract keyword should be used
 * Cannot creation/instantiation object  -> new()
 * Can have Abstract methods and variables
 * cannot show the internal implementation
 *
 */


abstract class AbDemo{ //abstract class
	public  void showMyName() // method
	{
		System.out.println("My name is Hitler"); //implemenation
	}
	
	public abstract void DBA();
	public abstract void UI();
	public abstract void Backend();

	
}

class Ab extends AbDemo 
{

	@Override
	public void DBA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UI() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Backend() {
		// TODO Auto-generated method stub
		
	}

	
}



public class Abstraction {
	
	
public static void main(String[] args) {
	
	Ab a1 = new Ab();
	a1.showMyName();
}
	
}
