
/*
 * While Loop
 * Do While Loop
 * For Loop/ Enchanced For Loop
 * 
 * 
 * 
 * finite loop
 * infinite loop
 * 
 * 
 * */



	/*  while(condition)
	 * 	{
	 * 		//body holds the initialization, increment/decrement operator
	 * 	
	 * 	}
	 * */


	/* do
	 * {
	 * }
	 * while(condition)
	 * 
	 * 
	 * 
	 * */

	/* For loop
	 * 	for(initialization; condition; increment/decrement)
	 * 	{
	 * 		//code 
	 * 	}
	 * 
	 * */

 
public class LoopingStatements {
	
	public static void main(String[] args) { //main method
		
		//Redundancy code or boiler code
	
		/*
		System.out.println("MS DHONI");
		System.out.println("MS DHONI");
		System.out.println("MS DHONI");
		System.out.println("MS DHONI");
		System.out.println("MS DHONI");
		System.out.println("MS DHONI");
		System.out.println("MS DHONI");
		System.out.println("MS DHONI");
		System.out.println("MS DHONI");
		System.out.println("MS DHONI");
		*/
		
		//int i = 0; 
		/*
		 * while( true ) 
		{
			//System.out.println("i value - " + i);
			System.out.println("MS DHONI"); 
			
		}
		*/

		/*
		
		int age=10; //initialization
		int i=0;

		do
		{
			System.out.println(i);
			System.out.println("my age is " + age);
			age++; //increment& decrement operator
			i++;
		}
		while(age < 20); //condition
		
		//output - saran 19, sister-9
		
		
		*/
		
		
		/*
		for( int i=0; i < 99; i++)
		{
			System.out.println(i);
		}
		*/
		
		String [] names = {"A", "B", "C", "D","E"};
		
		/*
		 * for (String alphabets : names) {
		 
			System.out.println(alphabets);
		}
		*/
		
		
		//palidrome
		// RamuKumar 
		
		
		
		
		
		int [] marks = {69,50,40,20,12,11,1232,234,4343,21312,1232};
		
		
		
		
		
		int totalMark = 0;
		for (int i : marks) {
			
			 totalMark = i + totalMark;
			 System.out.println(totalMark);

			
		}
		
		
		
		
		
		
		
	}

	/*
	private static int CalculateAllMarksInsideMyArray(int[] marks) {
		
		int max = marks[0];
		for (int num: marks) {
			if(num > max)
			{
				max = num;
			}
		}
	
		return max;
	}
	*/

}
