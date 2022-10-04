

//Amazon e-commence

// modules --> login, logout, payment gateway etc
//boiler-plate code


//Single inheritance
class One //parent class
{
	void show() {  //methods/functions
		System.out.println("this is class one");
	}
}


class Two extends One //child1 class
{
	void showCar()
	{
		System.out.println("show my car");
	}
}

class Three extends One //child2 class
{
	void ShowTractor()
	{
		System.out.println("show my Tractor");
	}
}


public class Inheritance {
	
	public static void main(String[] args) {
	
		Two t1 = new Two(); //single inheritance
		t1.show();
		t1.showCar();
		
		
		

		Three t3 = new Three();  // multi-level inheritance
		t3.show();
		//t3.showCar();
		t3.ShowTractor();
	
		
		
		
		
	}

}
