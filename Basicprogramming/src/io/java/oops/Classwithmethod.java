package io.java.oops;

public class Classwithmethod {
	
	//data members
	String designation="Technical Trainer";
	String corporate="BCT";
	
	//Class Method
	void does() {
		System.out.println("In the training");
	}

	public static void main(String[] args) {
		//Creating an object to the class-Classwithmethod
		Classwithmethod object=new Classwithmethod();
		
		System.out.println(object.designation);
		System.out.println(object.corporate);
		//Trying to call the method using object
		object.does();

	}

}
