package io.java.programming;

import java.util.*;

public class Dynamicinput {

	public static void main(String[] args) {
		
		// scanner class which is used to do dynamic input.
		// memory container <-- storage --- 10, 20, 30, Sachin, 89
		Scanner input=new Scanner(System.in); // an object. 
		System.out.println("Enter a number : ");
		int number=input.nextInt();
		System.out.println("entered number is : " + number);
		// Check that the number if even or odd
		if(number%2==0) {
			System.out.println(number + " : is even");
		}else {
			System.out.println(number + " : is odd");
		}
		input.close();
	}
}