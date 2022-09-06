package com.bct.execptions;

public class Nestedtrycatch {

	public static void main(String[] args) {
		
		//main try block
		try {
			//try-blcok 2
		
			try {
				//try-block 3
				
				try {
					int arr[]= {1,2,3,4};
					/*I'm tring to display the value of 
					 * an element which doesn't exist. 
					 * the code should thrown an exception
					 */
				System.out.println(arr[10]);
				
				}catch(ArithmeticException e) {
					System.out.println("Warning: Arithmetic Exception");
					System.out.println("handled in try-block-3");
				}
				
			}catch(ArithmeticException e) {
				System.out.println("Warning: Arithmetic Exception");
				System.out.println("handled in try-block-2");
				
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Warning: ArrayIndexOutOfBoundsException ");
			System.out.println("handled in the main try-block");
			
		}catch(Exception e) {
			System.out.println("Exception");
			System.out.println("handled in main try-block");
		}
	}
}