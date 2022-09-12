package com.bct.java8features.streamsAPI;

import java.util.StringJoiner;

public class Stringjoinermethods {

	public static void main(String[] args) {
		
		StringJoiner joinnames=new StringJoiner(",");
		
		//print empty
		System.out.println(joinnames);
		
		//We can set default empty value
		joinnames.setEmptyValue("It is empty");
		System.out.println(joinnames);
		
		//Adding values to StringJoiner
		joinnames.add("Sachin");
		joinnames.add("Rahul");
		System.out.println(joinnames);
		
		//Returns StringJoiner as StringType
		String str=joinnames.toString();
		System.out.println(str);
		
		//Now, we can apply String methods on it.
		char ch=str.charAt(3);
		System.out.println("Charecter at index 3 : " + ch);
		
		//Adding one element
		joinnames.add("Yuvraj");
		System.out.println(joinnames);
		
		//Returns length
		int newLength=joinnames.length();
		System.out.println("NewLength : " + newLength);

	}

}
