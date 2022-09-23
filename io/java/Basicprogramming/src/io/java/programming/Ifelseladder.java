package io.java.programming;

import java.util.Scanner;

public class Ifelseladder {

	public static void main(String[] args) {
		//Calculator program
	
		Scanner sc=new Scanner(System.in);
		//taking the input from user
		System.out.println(" Enter the firstnumber");
		int fstnum=sc.nextInt();
		System.out.println("Enter tyhe secondnumber");
		int sndnum=sc.nextInt();
		
		System.out.println("Select the operation +, - , * , / , %");
		/*String type cast is converted to char
		Char data type in java take the single quote and it will be valied
		with single letter.  */
		char operation=sc.next().charAt(0);
		if(operation=='+') {
			System.out.println("Addition of two numbers: " + (fstnum+sndnum) );
		}else if(operation=='-') {
			System.out.println("Substraction of two numbers: " + (fstnum-sndnum));
		}else if(operation=='*') {
			System.out.println("Mutlipy of two numbers: " + (fstnum*sndnum));
		}else if(operation=='/') {
			System.out.println("Division of two numbers: " + (fstnum/sndnum));
		}else if(operation=='%') {
			System.out.println("Modulo of two numbers: " + (fstnum%sndnum));
		}
		else {
			System.out.println("Invalid operation");
		}
		sc.close();
	}
}