package com.bct.data.structures;

import java.util.Stack;

public class CollectionStack {

	public static void main(String[] args) {
		
		//Creating an instance of stack
		Stack<Integer> numbers=new Stack<Integer>();
		
		//adding the elements to the stack
		numbers.add(11);
		numbers.add(22);
		numbers.add(33);
		numbers.add(44);
		numbers.add(55);
		
		// displaying the elements
		System.out.println("Elements of the stack: " + numbers);
		
		Stack<String> names = new Stack<String>();
		names.push("Sachin Tendulkar");
		names.push("Virendra sehwag");
		names.push("Gautham Gambhir");
		names.push("Yuvraj Singh");
		//Displaying the elements
		System.out.println("Elements of another stack : " + names);
		
		//Check if the stack is empty
		System.out.println("IS stack emply ? : " + numbers.isEmpty() );
		
		// In order to remove 
		System.out.println("Removed element is : " + numbers.remove(1));
		System.out.println("Removed element from pop() :" + numbers.pop());
		// in order to see the top/peek
		System.out.println("The top/peek of the stack is " + numbers.peek()) ;
		System.out.println("Elements of stack after remove and pop()" + numbers);

	}

}
