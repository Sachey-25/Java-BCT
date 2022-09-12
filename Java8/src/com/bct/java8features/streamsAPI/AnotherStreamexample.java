package com.bct.java8features.streamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnotherStreamexample {
	
	/*
	 * Stream filter() and collect();
	 * -- we create a stream and apply filter in a one line. 
	 * The collect() method here collects the final stream and converts into a list. 
	 */

	public static void main(String[] args) {
		
		//create a collection
		List<String> names = new ArrayList<String>();
		//add the elements to the list
		names.add("Sachin"); // 0
 		names.add("Anil");  // 1 
		names.add("Wipro"); // 2 
		names.add("Technologies"); // 3
		names.add("Bangalore"); // 4
		
		//apply the stream API
		List<String> count=names.stream()
				.filter(result -> result.length() > 6)
				.collect(Collectors.toList());
		System.out.println( count );
		System.out.println("--------------------------------------------------------");
		//Stream filter() and multiple methods
		List<String> cities = Arrays.asList("Bangalore","Mumbai","Chennai","Kolkatta");
		
		List<String> namesofCities = cities.stream()
				
				.filter(anyname -> anyname.length()>4 && anyname.length()<10) // multiple conditons
				.filter(anyname -> anyname.length()>4 && anyname.length()<7)
				.filter(anyname -> anyname.length()>4 && anyname.length()<7)
				.filter(anyname -> anyname.length()>4 && anyname.length()<7)

				.collect(Collectors.toList());
		System.out.println(namesofCities);
		
		System.out.println("------------------------------------------------------");
		List<Integer> num = Arrays.asList(1,2,3,4,5,6);
		List<Integer> sqaure = num.stream()
				.map(numbers -> numbers*numbers )
				.collect(Collectors.toList());
		System.out.println(sqaure);
	}
}
