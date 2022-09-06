package com.bct.execptions;

public class Throwkeyword {
	
	//local variable number whose value is 12. 
	// If I found number is equal to 12 I will ask the jvm to throw an exception.
	
	static void myMethod(int testnumber) throws Exception {
		System.out.println("Start-Mymethod");
		if(testnumber==12) {
			throw new Exception();
		}
		System.out.println("end-method");
		return ;
	}

	public static void main(String[] args) {
		
		int testnumber=12;
		
		//local variable number whose value is 12. 
		// If I found number is equal to 12 I will ask the jvm to throw an exception.
		
		 try {
	         System.out.println("try - first statement");
	         
	         //Invoking the method
	         myMethod(testnumber);
	         
	         System.out.println("try - last statement");
	      }
	      catch ( Exception ex) {
	         System.out.println("An Exception");
	      }
	      finally {
	         System. out. println( "finally") ;
	      }
	}
}
