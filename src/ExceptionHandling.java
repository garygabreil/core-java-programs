import java.sql.SQLException;
import java.util.ArrayList;

public class ExceptionHandling {
	
	public static void main(String[] args) throws Exception, SQLException {
		
		ArrayList<String> s1 = new ArrayList();
		s1.add("ronaldo");
		s1.add("messi");
		s1.add("neymar");
		s1.add(null);
		s1.add("sterling");
		
		
		for (String playernames : s1) {
			try
			{
				if(playernames.length() >= 1)
				{
					System.out.println("valid players " + playernames );
				}
			}
			catch(Exception e)
			{
				System.out.println("not valid player" + e);
			}
			
		}
		
		
		
		/*try
		{
			
			//c: 
			int[] numbers = {1,2,3,4,5,6};
			
			System.out.println(numbers[7]);
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("this can be done");
		}
		
		*/
		
		
		
	}
	
	

}
