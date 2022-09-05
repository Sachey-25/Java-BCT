package org.bct.java.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		
		/*
		 * Array list -- The limitation for array is a fixed length. 
		 * ArrayList can dynamically grow and shrink
		 */
		
		//How to create arraylist		
		// Syntax : ArrayList<returnType> ArrayListName = new ArrayList<returnType>();
		
		//Created
		ArrayList<String> alist=new ArrayList<String>(); // object ---> store... 
		
		//Adding an elements to the arraylist
		alist.add("Sachin"); // 0
		alist.add("Rahul"); // 1
		alist.add("Sourav"); // 2
		alist.add("Rohit"); // 3
		Collections.sort(alist);

		//Displaying the elements
		System.out.println("Data of ArrayList: " + alist);
		// Adding an element at the specific posotion(2)
		alist.add(2, "Virendra");
		System.out.println("Data of ArrayList: " + alist);
		// Change the element
		alist.set(2, "Yuvraj");
		System.out.println("Data of ArrayList: " + alist);
		// Remove the element
		alist.remove("Sachin");
		System.out.println("Data of ArrayList: " + alist);
		
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println(numbers);
		
		// new arraylist -- colors.
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("white");
		colors.add("red");
		colors.add("green");
		colors.add("indigo");
		colors.add("orange");
		System.out.println("<-----Before Sort ----> " + colors);
		Collections.sort(colors);		
		
		System.out.println("----------------After sort : 2nd Array List--------------");
		//iterate into the arrayList
		for(String result:colors) {
			System.out.println("Data of arrayList : " + result);
			//System.out.print("Data of arrayList : " + result);
		}
		
		// inbuild methods
		// I wanted to the now the lenght of arrayList :  nameofArrayList.size();
		System.out.println("Number of elements in ArrayList: " + colors.size());
		
		
		// Sort the arrayList.
		
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("mango");
		fruits.add("strawberry");
		fruits.add("kiwi");
		fruits.add("muskmelon");
		fruits.add("orange");
		System.out.println("<----- Before Sort ---->" + fruits);
		
		// In order to sort the elements of the array list we need to call the class interface
		Collections.sort(fruits);
		System.out.println("<--After Sort -------> " + fruits );
		
		// Iterate over the arraylist --- Single elements
		for(String display:fruits) {
			System.out.println(display);
		}		
		
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		
		ArrayList<String> alphabets = new ArrayList<String>();
		
		alphabets.add("z");
		alphabets.add("k");
		alphabets.add("b");
		alphabets.add("g");
		alphabets.add("a");
		System.out.println("Elements of arraylist is : " + alphabets);
		Collections.sort(alphabets);
		System.out.println("Elements of arrayList is : " + alphabets);
		
		System.out.println("*****************************************************");
		// Add n number of array list 
		colors.addAll(fruits);
		System.out.println("ArrayList elements after append to fruits " + colors);
		
		//Clear the elements from the arraylist
		colors.clear();
		System.out.println("After clearing the elements arrayList go empty: " + colors);
		
		//Get method ----> accessging the specfied element
		System.out.println("***************************************************");		
		System.out.println("First element of the ArrayList: " + alist.get(0));
		System.out.println("Second element of the ArrayList: " + alist.get(1));
		System.out.println("Third element of the ArrayList: " + alist.get(2));
		System.out.println("fourth element of the ArrayList: " + alist.get(3));
	}
}