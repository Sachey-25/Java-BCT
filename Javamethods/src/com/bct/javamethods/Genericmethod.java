package com.bct.javamethods;

public class Genericmethod {
	/*
	 * What is method
	 * -- A method is a block of code that performs a specific task 
	 * -- Method signature should consits of () {}
	 * -- Syntax: 
	 * access specifiers <return type> methods name () {}
	 * -- methods valid within the class
	 */
	
	//create a method
	public int addNumbers() {
		
		int numone=10;
		int numtwo=20;
		//need to store the result
		int result=numone+numtwo; // 10+20
		System.out.println("Addtion of 10 and 20 is : " + result);
		return 0;
	}
	
	//Another example
	public void display() {
		System.out.println("Welcome to the method world");
	}
	
	public int disp() {
		return 0;
		
	}
	
	public String print() {
		return null;
		
	}
	
	//Parameterized methods --- Initializing the variables in the brackets
	public int additonOfTwoNumbers(int numberone, int numbertwo) {
		// We are storing the result
		int print=numberone+numbertwo;
		System.out.println("Method within the class");
		System.out.println("Adding 25 and 25 : " + print);
		return print;
	}
	
	//Static methods
	static void greetings() {
		System.out.println("Hello.. Good afternoon");
	}
	
	private void displ() {
		System.out.println("Private access specifier is also good methods");
	}

	public static void main(String[] args) {
		
		//In order to access the class we need to create an object
		Genericmethod method=new Genericmethod();
		//We need to invoke/call the method using the object. 
		method.addNumbers();
		System.out.println("Method is been called from mainMethod");
		System.out.println("We are actually adding two numbers 10 and 20");
		method.display();
		//While calling/invoking the method we need to pass the values. 
		method.additonOfTwoNumbers(10, 10);
		
		// call the method with the object variable reference. 
		int sum=method.additonOfTwoNumbers(25, 25);
		System.out.println(sum);
		
		// we can directly call/invoke the static method
		greetings();
		//We need to call them through the object only. 
		method.displ();
	}

}
