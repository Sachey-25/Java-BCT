package com.bct.java8features.functional.interfaces;

import java.util.function.IntBinaryOperator;

//default interfaces

interface Myinterface{
	
	//default method
	default void newMethod() {
		System.out.println("Newly added default method.");
	}
	
	//Abstract method
	public void existingMethod(String str);
	
}

//Inheritance concept.
class Example implements Myinterface{

	@Override
	public void existingMethod(String str) {
		System.out.println("String is : " + str);
	}
}


// Creating our own functional interface.
interface MyFunctionalInterface{
	
	//single abstract method.
	public int addMethod(int a, int b);
}

public class Functionalinterface {

	public static void main(String[] args) {
		
		//Lambda Operation
		MyFunctionalInterface sum=(a,b) -> a+b;
		System.out.println("Result = " + sum.addMethod(12, 100));
		
		//predefined functiona interface
		//lambda expression
		System.out.println("----Printed by the predefined interface-----");
		IntBinaryOperator add=(a,b) -> a+b;
		System.out.println("Result = " + add.applyAsInt(12, 100));
		
		//Creating an object to the class Example
		Example instan=new Example();
		//Calling the default method of interface
		instan.newMethod();
		//Calling the abstract method of interface
		instan.existingMethod("Java 8 is easy to learn");
		
	}
}