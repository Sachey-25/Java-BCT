package io.java.method.over.loading;

// Demontraition that object creation of abstract class is not allowed.
class Demo extends AbstractDemo{

	@Override
	public void anotherMethod() {
		System.out.println("Abstract Method");
	}
}
abstract class AbstractDemo {
	
	//method
	public void myMethod() {
		System.out.println("Hello.. Good afternoon");
	}
	
	abstract public void anotherMethod();
	
	public static void main(String[] args) {
		//Create an object to the class AbstractDemo
//		AbstractDemo obj=new AbstractDemo();
//		obj.anotherMethod();
//		obj.myMethod();
	}
}
