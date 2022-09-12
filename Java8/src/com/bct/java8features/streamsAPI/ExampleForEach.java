package com.bct.java8features.streamsAPI;

import java.util.HashMap;
import java.util.Map;

public class ExampleForEach {

	public static void main(String[] args) {
		
		// Create a collection 
		Map<Integer, String> hmap=new HashMap<Integer,String>();
		
		//adding the elements
		hmap.put(1, "white");
		hmap.put(2, "red");
		hmap.put(3, "black");
		hmap.put(4, "pink");
		hmap.put(5, "grey");
		hmap.put(6, "yellow");
		
		/*
		 * forEach to iterate and display each key and value pair of hashMap.
		 */
		
		//make use of forEach()
		hmap.forEach((key,value) -> System.out.println(key + " " + value));
		
		//lets find the value by key
		hmap.forEach( (key,value) -> {
			if(key==4) {
				System.out.println("Value associated with the key 4 is : " + value);
			}
		});
		

	}
}