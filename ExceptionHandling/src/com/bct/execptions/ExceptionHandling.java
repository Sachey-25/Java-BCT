package com.bct.execptions;

public class ExceptionHandling {
	/*
	 * Try block
	 * -- try block contains set of statements where an exception can occurs. 
	 * A try block is always followed by catch block, which handles the exception 
	 * occurs in the associated try block. 
	 * 
	 * A try block must be followed by catch blocks or finally block or both.
	 */

	public static void main(String[] args) {
		
		int numberone,numbertwo;
		numberone=10;
		numbertwo=0;
		
		System.out.println("The value of number two is : " + numbertwo);
		try {
			System.out.println(numberone/numbertwo);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Number can't be devided by zero.");
			System.out.println("Exception handled");
		}
		catch(NullPointerException e) {
			System.out.println("Another exception handled");
		}
		catch(Exception e) {
			System.out.println("Exception Handled");
		}	
	}
}
