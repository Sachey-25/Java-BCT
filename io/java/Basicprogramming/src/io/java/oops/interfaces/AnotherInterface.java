package io.java.oops.interfaces;


interface InterfaceOne{
	
	public int screen(); 
}

interface Interfacetwo{
	
	public int screen(); 
}

interface Interfacethr{
	
	public int screen(); 
}

class InterfaceImplii implements InterfaceOne{

	@Override
	public int screen() {
		System.out.println("Hii ");
	
		return 0;
	}
	
}

class InterfaceImpli implements Interfacethr{

	@Override
	public int screen() {
		System.out.println("My name is interface!");
		return 0;
	}
	
}

class InterfaceImpl implements Interfacetwo{

	@Override
	public int screen() {
		System.out.println("Hello");
		return 0;
	}
	
}

public class AnotherInterface {

	public static void main(String[] args) {
		// create an object
		
		InterfaceImpl obj=new InterfaceImpl();
		InterfaceImpli ob=new InterfaceImpli();
		InterfaceImplii o=new InterfaceImplii();
		//invoke the methods from implemented interfaces.
		obj.screen();
		ob.screen();
		o.screen();
		
	}
}
