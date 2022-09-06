package com.bct.data.structures;

public class Arrays {
	/*
	 * properties of arrays
	 * 1. Each element in an array is pf the same data type and carries the same size 
	 * that is 4bytes
	 * 2. Elements in the array arre stored at contiguous memory locations from which
	 * the first element is stored at the smallest memory location
	 * 3. Elements of the array can be randomly accessed since we can calculatre the address
	 * of each element of the arrway with the given base address.
	 * 
	 */

	public static void main(String[] args) {
		
		/*
		 * Representation of the array 
		 * ****************************************************
		 * <ReturnType>[] = {<values/data/elements>};
		 * ****************************************************
		 * 
		 */

		
	/*	byte byteArray[];
		short shortArray[];
		boolean booleanArray[];
		float floatArray[];
		double doubleArray[];
		char charArray[]; */
		
		//declaring an array of Strings
		String[] cricketPlayers;
		
		//Allocation memory of 5 Strings
		cricketPlayers=new String[5];
		
		//Initialize the first elements of the array and rest of the 5 elements
		cricketPlayers[0]="Sachin Tendulkar";
		cricketPlayers[1]="Yuvraj Singh";
		cricketPlayers[2]="Rahul Dravid";
		cricketPlayers[3]="VVS Laxman";
		cricketPlayers[4]="Sourav Ganguly";
		
		//Accessign the values. --- Since arrays works on index places hence we need
		// to make use of loops.
		for(int i=0; i< cricketPlayers.length;i++) {
			System.out.println("Elements of index " + i + " : " 
		+ "Values : " + cricketPlayers[i]);
		}

	}

}
