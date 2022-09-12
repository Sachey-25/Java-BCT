package com.bct.java8features.optional.classes;

import java.util.Optional;

public class ExampleofOptionalClass {
	/*
	 * Without optional classes. 
	 * 
	 */
	public static void main(String[] args) {
		
		//array..
		String[] str = new String[10];
		//Getting an substring
		//String subString = str[9].substring(2,5);
		//Displaying substring	
/*
 * Exception in thread "main" java.lang.NullPointerException: 
 * Cannot invoke "String.substring(int, int)" because "str[9]" is null
	at com.bct.java8features.optional.classes.
	ExampleofOptionalClass.main(ExampleofOptionalClass.java:15)
 */			
		//solution : using optional Classes 
		Optional<String> isNull=Optional.ofNullable(str[9]);
		if(isNull.isPresent()) {
			//Getting the substring
			String subString = str[9].substring(2, 5);
			//Displaying the substring
			System.out.println("Substring is : " + subString);
		}else {
			System.out.println("Cannot get the substring from empty string ");
		}
		str[9]="Sachin";
		Optional<String> isNullCheck= Optional.ofNullable(str[9]);
		if(isNullCheck.isPresent()) {
			//Getting the substring
			String subStringTwo=str[9].substring(2,5);
			//Displayng the values
			System.out.println("Substring is :" + subStringTwo);
		}else {
			System.out.println("Cannot get the substring from the empty string");
		}
	}
}