package org.bct.java.collections;

import java.util.HashMap;
import java.util.Map;


public class Hashmap {
	/*
	 * Hash map is a map based collection class. that is used for storing Key& value. 
	 * it is denoted as HashMap<key, Value> or HashMap<K,V>. This class makes no 
	 * guarantees as to the order of map. (null values)
	 */
	public static void main(String[] args) {
		// Creating a hashmap.
		
		HashMap<Integer, String> hmap=new HashMap<>();
		
		//Adding the elements. 
		hmap.put(1, "Sachin");
		hmap.put(2, "Tendulkar");
		hmap.put(3, "Sourav");
		hmap.put(4, "Ganguly");
		hmap.put(5, "Rahul");
		hmap.put(6, "Dravid");	
		//Displaying the values of a hashMap.
		System.out.println("Elements of Map: " + hmap);
		
		// Dispaly the content using Iterator 
		// Iterator -------> over a HashMap ---> we need to convert Hashmap either to list or set
		// we can't apply iteratoration becuae of kay and value nature. 
		// Converting the hashmap to set
//		Set set = hmap.entrySet();
		//Iterate each and every elements of the hash map -- Keys and values. 
		
//		Iterator iterator = set.iterator();
//		while(iterator.hasNext()) {
//			Map.Entry entry = (Map.Entry)iterator.next();
//			System.out.println("key is : " + entry.getKey() +
//					"  & Value is : " + entry.getValue());
//		}
		
		System.out.println("---ForLoop---------");
		for(Map.Entry Elements : hmap.entrySet()) {
			System.out.println("Keys of HashMap : " + Elements.getKey() + " \n "
			+ " Values of HashMap: "+ Elements.getValue());
			
		}
//		System.out.println(hmap.containsKey(hmap));
//		System.out.println(hmap.containsValue(hmap));
		System.out.println(hmap.isEmpty());
		
		// In order to remove the element from HashMap we need to focous on key.
		hmap.remove(1);
		System.out.println("Hmap after an element removed.");
		System.out.println(hmap);
		
		
		// Access the elements
		System.out.println("First element of the HashMap: " + hmap.get(1));
		System.out.println("Second element of the HashMap: " +hmap.get(2));
		System.out.println("Third element of the HashMap: " +hmap.get(3));
		System.out.println("Fourth element of the HashMap: " +hmap.get(4));
		System.out.println("Fourth element of the HashMap: " +hmap.get(5));
		System.out.println("Fourth element of the HashMap: " +hmap.get(6));
		
		
		//Clear the hash map
		hmap.clear();
		System.out.println("All the elements of hmap are erased : " + hmap);

	}
}
