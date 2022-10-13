
public class Strings {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		String mad = "csk";   // string literal
		String mad1 = new String("csk"); //using new keyword
		
		
		
		StringBuffer sd = new StringBuffer("csk \n");
		sd.append("mi \n");
		sd.append("srh \n");
		
		/*
		System.out.println(sd.charAt(2));
		System.out.println(sd.length());
		
		*/
		
		
		
		/* common mistake
		 * 		== ---> will compare object not value
		 * 		.equal() --> compares value
		 * */
		
		
		//System.out.println(mad.equals(mad1));
		
		//System.out.println(sd);
		
		
		
		
		
		
		String [] names = {"malayalam", "gary", "saran", "tony", "dhoni", }; //array
		
		for (String name : names) {
			
				StringBuffer temp = new StringBuffer(name);
				
				String s1 = name;
				String s2 = temp.reverse().toString();
				
				System.out.println("name - " + s1 );
				
				if(s1.equals(s2))
				{
					System.out.println("palidrome");
				}
				else
				{
					System.out.println("not palidrome");
				}
				
				
				
			
		}
		
		
	}
}
