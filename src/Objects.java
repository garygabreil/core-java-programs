
/*
 * Object - Instance of a class (theory)
 * 		eg: Entity
 * 				1. State
 * 				2. Behavior
 *		refer examples in the shared ppt
 * */





public class Objects {
	
	int a = 10; //variable
	
	public String show() //Methods/Functions ()  -- Behavior
	{
		
		return "Hello, Good morning!!";
	}
	
	
	public static void main(String[] args) {
		
		Objects abc1 = new Objects();
		
		System.out.println(abc1.a + "   " + abc1.show());
		/*
		 * Syntax:
		 * <Class_name> <Object_name> = new <Class_name> ()
		 * */
		
	}
	


}
