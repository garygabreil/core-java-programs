

//non static variable
class Cars
{
	static String brand ="bmw";
	static String[] model = {" X series", " Y series"," Z series",};
	static String url = "";	
}


public class StaticNonStaticVariable {
	public static void main(String[] args) {
	
		
		//System.out.println(Cars.model.toString());
		
		for (String string : Cars.model) {
			System.out.println(string.toString());
		}
		
		
		
		System.out.println(Cars.brand);

	
		/*
		System.out.println(c1.brand);
		System.out.println(c1.model);
		System.out.println(c2.brand);
		System.out.println(c2.model);	
		System.out.println(c4.brand);
		System.out.println(c3.model);	
		System.out.println(c5.brand);
		System.out.println(c3.model);	
		System.out.println(c5.brand);
		System.out.println(c4.model);
		*/

	}

}
