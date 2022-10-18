package com.javacrashcourse1;
import com.javacrashcourse.*; // technique-1
//import com.javacrashcourse.B; // technique-2
//import com.javacrashcourse.AccessModiferExample3;



//* --> wildcard (will search for everything)
 
public class SubClassOfA extends AccessModiferExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubClassOfA scoa = new SubClassOfA();
		scoa.message();
		System.out.println(scoa.a);
		
		com.javacrashcourse.B obj = new com.javacrashcourse.B(); //fully qualified name
		obj.displayMessage(); 
		
		A obj1 = new A();
		obj1.displayMessage();
		
		
		B obj2 = new B();
		obj2.displayMessage();
		
		
		
		
		
		
		
		
		
		
		

	}

}
