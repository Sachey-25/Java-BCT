package io.java.oops;

public class Staticapproach {
	
	//This is a normal method
	static public void myMethod() {
		System.out.println("This is another static method");
		System.out.println("First variable value: " + numberOne);
		System.out.println("Second variable value: " + name);
	}
	
	//This is a static method
	static public void myMethd() {
		System.out.println("This is static method");
	}
	
	//static variables
	static int numberOne=100;
	static String name="Sachin";
	static String session;
	
	static {
		name="Sachin";
		session="JavaStatic";
	}
	
	//take the static variables and perform addition operation

	public static void main(String[] args) {
		
		// w.k.t in order to access the static method we don't need object.
		myMethd(); 
		//Invoking another static method
		myMethod();		
	}
}