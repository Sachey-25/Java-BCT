package io.java.oops;

//parent class
abstract class Greetings{
	//abstract method
	public abstract void greet();
}

public class Abstractgreet extends Greetings {
	
	@Override
	public void greet() {
		System.out.println("Good morning.. My name is Abstract method");
		System.out.println(" I will override the abstract class body.");
	}

	public static void main(String[] args) {
		// General way of creating an object to the class.
		// Greetings obj=new Greetings();
		// but for abstract method we need to apply on subclass w.r.t mainclass
		
		Greetings obj=new Abstractgreet();
		obj.greet(); // object invoking the subclass 
	}
}