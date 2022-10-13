
public class Arrays {
	
	public static void main(String[] args) {
		
		/*Array can be created in 2 ways:
			1) using new keyword
			2) dynamic 
		*/
		
		
		//Single dimensional array or 1D	
		int [] numb = {1,3,4,5,5,4,65,56565,65,56}; //dynamic --> created using curely braces {}
		/*for (int i : numb) {
			System.out.println(i);
		}
		*/
		
		int [] numb2 = new int[10];
		numb2[9]= 99;
		numb2[2]=100;
		
		/*
		for (int i : numb2) {
			System.out.println(i);
		}*/
		
		
		
		//multi-dimensional array or 2D
		int [][] array2D = { // 0	1	2  3
							 {1, 2 , 3, 4}, //0
							 {1, 47, 3, 4}, //1
							 {9, 5 , 5, 5},	//2
							 {9, 5 , 99, 7},//3
							 {9, 5 , 5 , 5},//4
		};
		
		
		System.out.println(array2D[3][2]);	//row/column
		
		
	/*	
		for(int i=0; i < array2D.length; i++) //column
		{
			for(int j=0; j <array2D[i].length; j++)
			{
				//System.out.println(i + "- " + j);
			}
		}
		*/
		
		
	
		
	}

}
