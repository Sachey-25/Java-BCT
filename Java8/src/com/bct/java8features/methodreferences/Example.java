package com.bct.java8features.methodreferences;

import java.util.Arrays;

//Method reference to an instance method of an arbitrary object of a particular type.


public class Example {

	public static void main(String[] args) {
		//Create a collection
		String[] stringArray= {
				"Sachin","Anil","Java","programming","Java8","Method","reference"
		};
		
		/*
		 * Method reference to an instance method of an arbitrary object of a particular type
		 */
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		for(String data:stringArray) {
			System.out.println(data);
		}

	}

}
