
public class ConditionalStatments {

	//if statement
	
	/*
	 * syntax
	if(condition <true>)
	{
		
	}
	*/
	
	
	//if else statemet
	/*
	 * syntax
	 * if(condition)
	 * {
	 * }
	 * else
	 * {
	 * 	//code
	 * }
	 * 
	 * 
	 * */
	
	
	//nested if statement
	/*
	 * syntax
	 * 	if(main -condition)
	 * {
	 * 	if(sub-condition)
	 * 		{
	 * 		}
	 * }
	 * 
	 * 
	 *
	 * 
	 * 
	 * 
	 * */
	
	/*if else if ladder
	 * 
	 * 
	 * if(main condition)
	 * {
	 * 	if()
	 * 	{
	 * 	}
	 * }
	 * else if(main condition)
	 * {
	 * }
	 * else if(condition)
	 * {
	 * }
	 * 
	 * else
	 * {
	 * }
	 * 
	 * 
	 * */
	
	
	/* switch
	 * switch(expression)
	 * case value1:
	 * 		code 
	 * 		break;
	 *  case value2:
	 *  	code
	 *  	break;
	 *  
	 *  default:
	 *  
	 * 
	 * */
	
	
	
	public static void main(String[] args) {
		
		/*
		boolean flag = true;
	
		if(flag)
		{
			System.out.println("my flag");
		}
		*/
		
		/*
		int age = 18;
		
		if( age >= 20)
		{
			System.out.println("my age is greater");
		}
		*/
		
		
		
		/*
		int number = 13;
		
		if( (number%2) == (0))
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
		*/
		
		
		/*
		 *
		 * int year = 2020;
		
		if((year%4 == 0))
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap");
		}*/
		
		
		/*
		
		int subject_maths_marks = 91; 
		
		
		if(subject_maths_marks >= 35)
		{
			//pass
			System.out.println("Student passed");
			
			if(subject_maths_marks > 35 && subject_maths_marks < 50)
			{
				System.out.println("Grade C");
				
			}
			
			if(subject_maths_marks > 50 && subject_maths_marks < 70)
			{
				System.out.println("Grade B");
			}
			
			if(subject_maths_marks > 90 && subject_maths_marks < 99)
			{
				System.out.println("Grade A");
			}		
			
		}
		else
		{
			System.out.println("student has failed");
		}
		
		*/
		
		
		/*
		int marks = 75;
		
		if(marks < 50)
		{
			System.out.println("fail");
		}
		else if( marks>= 50 && marks < 60)
		{
			System.out.println("D grade");
		}
		
		else if(marks>= 70 && marks < 80)
		{
			System.out.println("E grade");
		}
		
		else
		{
			System.out.println("invalid");
		}*/
		
		
		int number = 10;
		
		
		switch(number)
		{
			//case statements
			case 10: System.out.println("10");
			break;
			case 20: System.out.println("20");
			break;
			case 30: System.out.println("30");
			break;
		}
		
		
		
		
		
	}
	
	
}
