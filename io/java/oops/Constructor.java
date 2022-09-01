package io.java.oops;

public class Constructor {
	int id;
	String name;
	
	//Contructor --- parameterized contructor
	Constructor(int id,String name){
		this.id=id; // 101
		this.name=name; // sachin anil
	}
	
	//no-arg constructor
	Constructor(){
		System.out.println("This is a no argument constructor");
	}

	public static void main(String[] args) {
		// creating an object to the class
		Constructor object=new Constructor(101, "Sachin Anil"); //external object
		System.out.println(object.id);
		System.out.println(object.name);
		
		//creating an object to the no-arg constructor
		new Constructor(); // invoking the constructor.
		
	}
}