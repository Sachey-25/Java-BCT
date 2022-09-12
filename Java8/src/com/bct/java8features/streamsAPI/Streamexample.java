package com.bct.java8features.streamsAPI;

import java.util.ArrayList;
import java.util.List;

public class Streamexample {

	public static void main(String[] args) {
		//Create a collection
		List<String> names=new ArrayList<String>();
		
		//add the elements to the list
		names.add("Sachin"); // 0
 		names.add("Anil");  // 1 
		names.add("Wipro"); // 2 
		names.add("Technologies"); // 3
		names.add("Bangalore"); // 4
		
		// I would like to count the number of elements present in the list. 
		//Without stream implementation
	
		int count=0;		
		for(String ele : names) {
			if(ele.length() < 6)
				count++;
		}		
		System.out.println("There are : " + count + " Strings with length less than 6");
		
		System.out.println("----------------------------------------------------------");
		
		// Lets apply stream now! - Using lambda Expression.
		int number=(int) names.stream().filter(ele -> ele.length()<6).count();
		System.out.println("There are : " + number + " Strings with length less than 6");
		
	}
}