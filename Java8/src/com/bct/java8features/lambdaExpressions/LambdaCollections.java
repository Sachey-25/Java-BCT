package com.bct.java8features.lambdaExpressions;

import java.util.ArrayList;


public class LambdaCollections {

	public static void main(String[] args) {
		
		//Create the collection list
		ArrayList<String> ll=new ArrayList<String>();
		ll.add("Violet");
		ll.add("Indigo");
		ll.add("Blue");
		ll.add("Green");
		ll.add("Yellow");
		ll.add("Orange");
		ll.add("Red");
		
		ll.forEach( (colors) -> System.out.println(colors));
	}
}