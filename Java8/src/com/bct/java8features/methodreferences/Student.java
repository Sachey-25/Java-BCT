package com.bct.java8features.methodreferences;

import java.util.function.BiFunction;

@FunctionalInterface
interface MyInterface{
	
	//A method -- abstract method
	public void display();
}


// ---> make reference to the abstract method and instance method. --> 	
//Method reference to an instance method of an object - Object::instanceMethod



/* 
 * Method reference to static method of the class.
 * 
 */
class Addition{
	static int add(int numberOne, int numberTwo) {
		return numberOne+numberTwo;
	}
}

public class Student {
	
	/*
	 * Method references is the short hand notation of lambda expression to call a method.
	 * str -> System.out.println(str);
	 * System.out::println
	 */
	
	public void myMethod() {
		System.out.println("Instance Method");
		System.out.println("-----------I have been referenced by the abstract-----------");
	}

	public static void main(String[] args) {
		//Create an object to class - Student
		Student object=new Student();
		
		//Method reference using the object of the class
		MyInterface ref=object::myMethod;
		
		//Calling the method of functional Interface
		ref.display();
		
		// Create an object to class addition
		BiFunction<Integer,Integer,Integer> addition = Addition::add;
		int sum=addition.apply(11, 5);
		System.out.println("Addtion of given number is : " + sum);
		
		
	}

}
