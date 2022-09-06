package com.bct.execptions;

public class ArrayException {

	public static void main(String[] args) {
		
		try {
			
			int array[]=new int[7];
			array[4]=20/0;
			System.out.println("First print statement in try block");
			
		}catch(ArithmeticException e){
			System.out.println("Warning: **Arthmetic-Exception");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Warning: ArrayIndexOutOfBpiundsException");
			
		}catch(Exception e) {
			System.out.println("Warning : Some other exception");
		}
		
		System.out.println("Out of try-catch block....");
	}
}