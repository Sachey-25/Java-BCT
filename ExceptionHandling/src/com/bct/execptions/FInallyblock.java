package com.bct.execptions;

public class FInallyblock {

	public static void main(String[] args) {
		
		try {
			int number=121/2;
			System.out.println(number);
		}catch(ArithmeticException e) {
			System.out.println("Number should not be divided by zero");
		}
		/* Finally block will always executes even 
		 * if there is no exception
		 */
		finally {
			System.out.println("This is finally block");
		}
		System.out.println("Out of try-catch-finally");
		
		System.out.println("------------------------------------------------");
		try {
			return;
			
		}finally {
			System.out.println("This is another finally block");
			System.out.println("FInally block ran even after return statement!");
		}
		
	}
}