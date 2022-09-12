package com.bct.java8features.lambdaExpressions;

import java.util.ArrayList;

//Java Lambda Expression with no parameter. 
interface Mymethod{
	//A methos with no parameter
	public String sayHello();
}

public class AnotherExample {
	
	//Concrete/regular method
	public void display() {
		System.out.println("Hello World..!!");
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(16);
		al.add(18);
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al);
		}
		System.out.println("------------------------------------------");
		
		al.forEach( (result)-> {System.out.println(result);});
		
		//Lambda expression for the method which has no parameter.
		Mymethod display = () -> { System.out.println("Hello");
		return "Hello in return";};
		System.out.println(display.sayHello());
	}
	
}
