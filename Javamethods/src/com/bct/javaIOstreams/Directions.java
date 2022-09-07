package com.bct.javaIOstreams;


enum Something{
	EAST,
	WEST,
	SOUTH,
	NORTH
}

public class Directions {
	/*
	 * Enum is a special type of datatype which is basically a collection (set)
	 * of constants. 
	 */
	
	String EAST;
	String WEST;
	String NORT;
	String SOUTH;
		
	public static void main(String[] args) {
		//create an object to access the ENUM
		
		// Unable to create an object ----> by default enum is static
		Something object= Something.NORTH;
		
		if(object==Something.EAST) {
			System.out.println("Direction: EAST");
			
		}else if(object==Something.WEST) {
			System.out.println("Direction: WEST");
			
		}else if(object==Something.NORTH) {
			System.out.println("Directions: NORTH");
			
		}else if(object==Something.SOUTH) {
			System.out.println("Directions: SOUTH");
		}
	
	}

}
