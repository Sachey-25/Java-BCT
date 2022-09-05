package io.java.programming;

public class Ifelsestatement {

	public static void main(String[] args) {
		
		int number=20, value=5, data=6; // compile time entry // runtime entry
		
		// 1st if statement - checking 20 is even
		if(number%2==0) {
			System.out.println("The given number 20 is Even");
		}
		else {
			System.out.println("The given number is odd");
		}
		
		// 2nd if statement - checking 5 is even
		if(value%2==0) {
			System.out.println("The given number 5 is even");
		}else {
			System.out.println("The given number is odd");
		}
		
		// 3rd if statement - Checking 6 is even
		if(data%2==0) {
			System.out.println("The given number 6 is even");
		}else {
			System.out.println("The given number is odd");
		}
	}
}