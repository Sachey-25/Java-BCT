package org.bct.java.collections.comparable;

import java.util.Arrays;

public class Comparableinterface {

	public static void main(String[] args) {
		
		/*
		 * Integer class iomplements comparable
		 * interface so we can use the sort method
		 */
		
		//create an array
		int[] arr= {11,55,22,0,89}; // arr[0]=11, arr[1]=55, arr[2]=22, arr[3]=0, arr[4]=89
		
		// In order to sort the arrays we need to use Arrays.sort();
		Arrays.sort(arr);
		
		System.out.println("Sorted Int Array: " );
		// If the array isn't been converted to string the value will be an object	
		System.out.println(Arrays.toString(arr));
		
		/*
		 * String class implements Comparables
		 * Interface so we can use the sort method
		 * 
		 */
		
		System.out.println("Sorted String Array: ");
		String[] names = {"sachin","anil","sourav","ganguly"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));

	}

}
