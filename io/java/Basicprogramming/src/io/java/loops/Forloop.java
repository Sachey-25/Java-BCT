package io.java.loops;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		//first loop
		System.out.println("-----First loop---------");
		for(int i=1; i<=5; i++) {
			System.out.println("count :" + i);
		}
		
		//second loop
		System.out.println("-----Second loop---------");
		for(int i=5; i>1;i--) {
			System.out.println("count : " + i);
		}
		
		//third loop
		System.out.println("-----Third loop---------");
		for(int value=10; value>1; value--) {
			System.out.println("The value of iteration : " + value);
		} 
		//for ( ; ; )
		for(int a=2;a>0;a--) {
			System.out.println("For loop display");
		}
		//for(String str: <variable>){}
		String arr[]= {"hi","Hello","bye"};
		for(String display:arr) {
			System.out.println(display);
		}
		// Print any string
		int n=5;
		for(int name=1; name<=n; ++name) {
			System.out.println("My name is Sachin and java is crazy!");
		}
		
		// I wanted to know sum of n numbers
		// sum from 1 to 100 , result maximum
		int result=0;
		int maximum=100;
		for(int number=1; number<= maximum; ++number) {
			result +=number;
		}
		System.out.println("Sum of first 100 integers is: " + result);
		
		// sum of first 10 natural numbers
		int value, total=0, count;
		System.out.println("Enter the value of n");
		Scanner input=new Scanner(System.in);
		//nextInt() method reads integer entered by the user.
		value=input.nextInt();
		//closing the scanner after use. 
		input.close();
		for(count=1; count<=value; count++) {
			total += count;
		}
		System.out.println("Sum of first " +value+ "natual numbers is:" + total);
	}
	// java code to produce the table of 6;
}
