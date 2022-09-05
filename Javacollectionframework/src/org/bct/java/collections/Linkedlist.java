package org.bct.java.collections;

import java.util.LinkedList;

public class Linkedlist {
	/*
	 * Linkedlist is almost identical to the arrayList.
	 */
	

	public static void main(String[] args) {
		/* Methods involved in the Linkedlist 
		 * 
		 * 1. addFirst()
		 * 2. addLast()
		 * 3. removeFirst()
		 * 4. removeLast()
		 * 5. getFirst()
		 * 6. getLast()
		 */
		// we need to create linked list. 
		LinkedList<String> cars=new LinkedList<>();
		// adding an elements to the linked list. 
		
		cars.add("S-cross");
		cars.add("Baleno");
		cars.add("GrandVittera");
		cars.add("Ignis");
		cars.add("XL6");
		System.out.println("Elements of Linked list are : " + cars);
		
		// Using the addFirst()  --> adds the elements at the left side of LL
		cars.addFirst("Nexon");
		System.out.println("After addFirst()");
		System.out.println(cars);
		cars.addFirst("Harrior");
		System.out.println("After addFirst()");
		System.out.println(cars);
		cars.addFirst("Tesla");
		System.out.println("After addFirst()");
		System.out.println(cars);
		
		// Using the addLast() ---> adds the elements at the end of the LL
		cars.addLast("Nexon");
		System.out.println("After addFirst()");
		System.out.println(cars);
		cars.addLast("Harrior");
		System.out.println("After addFirst()");
		System.out.println(cars);
		cars.addLast("CRETA");
		System.out.println("After addFirst()");
		System.out.println(cars);
		
		// Is there anything that we can add the elements at the specific place?
		cars.add(4, "SANTRO");
		System.out.println("After adding an element at the specific place");
		System.out.println(cars);
		
		
		// Accessing the elements of the linked list. 
		for(int i=0; i<cars.size(); i++) {
			System.out.println("Elements at index : " + cars.get(i));
			
		}
		
		System.out.println("Elements at index 0 : " + cars.get(0));
		System.out.println("Elements at index 1 : " + cars.get(1));
		System.out.println("Elements at index 2 : " + cars.get(2));
		System.out.println("Elements at index 3 : " + cars.get(3));
		System.out.println("Elements at index 4 : " + cars.get(4));
		System.out.println("Elements at index 5 : " + cars.get(5));
		
		System.out.println("======================================================");
		
		// We make use of getFirst and getLast in order to access the elements
		System.out.println("First element of LinkedList : " + cars.getFirst());
		System.out.println("Last element of LinkedList : " + cars.getLast());
		System.out.println("First element of LinkedList : " + cars.getFirst());
		
		System.out.println("Before remove ");
		System.out.println("-------------------------------------------------------");
		System.out.println(cars);
		
		System.out.println(" <---- Removing the elements from LinkedList-----> ");
		System.out.println("First element been removed : " + cars.removeFirst());
		System.out.println("Last element been removed : " + cars.removeLast());
		System.out.println("----------------------------------------------------");
		System.out.println("After remove");
		System.out.println(cars);
		
		
		// we can also remove the element by using just remove();
		cars.remove();
		System.out.println("elements been removed" + cars);
		
		System.out.println("-------------------------------------------");
		// If we want to clear off the elements from the linked list 
		cars.clear();
		System.out.println("Elements of the LL : " + cars);

	}
}
