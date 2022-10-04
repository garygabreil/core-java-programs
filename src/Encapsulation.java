

class DataProvider{ //outer class
	
	private int dataId;  // integer variable
	private String dataType; //string variable
	private String dataFlow; //string variable
	public static int accountNumber; 
	
	public void setDataId(int id)  //method to set DataID
	{
	      dataId = id;
	}
	
	public int getDataId() //method to view my dataID
	{
		return dataId;
	}
	
	
}


//intranet url--> public, company restricted, strictly restricted --> url
//leave/task management application
		//contractor
		//consultant
		// employee


public class Encapsulation {
	public static void main(String[] args) {
		
		DataProvider dp = new DataProvider();
		dp.setDataId(10);  //protected and changed
		System.out.println(dp.getDataId());  //protected and viewbale
		
		
	}
}
