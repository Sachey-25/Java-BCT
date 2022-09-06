package com.bct.execptions;

public class Flowcontrol {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		
		//exception handling mechnism -- try - catch -- finally 
		try {
			int number=x/y;
			System.out.println("next-Statement: Inside try block");
			System.out.println("Output= " + number);
		}
		catch(Exception ex) {
			System.out.println("Exception");
		} finally {
			System.out.println("THis is finally block");
			System.out.println("There's no exception handled on try block..!");
		}
		
		System.out.println("Next-Statement : Outside of try-catch");
	}
}
