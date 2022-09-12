package com.bct.java8features.streamsAPI;

import java.util.StringJoiner;

public class ExampleStringjoiner {
	/*
	 * java.util 
	 * -- String Joiner --> we can join more than one strings with the speficied delimiter.
	 * we can also prefix and suffix to the final string while joining mulitple 
	 * strings.
	 */

	
	// 1. Joing strings by specifing delimiter. *, _, , , . '' , " " , 
	
	public static void main(String[] args) {
		
		//passng Hyphen (-) as delimiter.
		
		StringJoiner myString = new StringJoiner(" * ");
		myString.add("Programming");
		myString.add("is");
		myString.add("Easy");
		myString.add("and Fun");
		
		//Displaying the output String
		System.out.println(myString);
		System.out.println("--------------------------------------");
		
		StringJoiner myStringOne = new StringJoiner("-");
		myStringOne.add("Programming");
		myStringOne.add("is");
		myStringOne.add("Easy");
		myStringOne.add("and Fun");
		
		//Displaying the output String
		System.out.println(myStringOne);
		System.out.println("--------------------------------------");
		
		StringJoiner myStringTwo = new StringJoiner(",");
		myStringTwo.add("Programming");
		myStringTwo.add("is");
		myStringTwo.add("Easy");
		myStringTwo.add("and Fun");
		
		//Displaying the output String
		System.out.println(myStringTwo);
		System.out.println("--------------------------------------");
		
		StringJoiner myStringThree = new StringJoiner(" ");
		myStringThree.add("Programming");
		myStringThree.add("is");
		myStringThree.add("Easy");
		myStringThree.add("and Fun");
		
		//Displaying the output String
		System.out.println(myStringThree);
	
	}
}