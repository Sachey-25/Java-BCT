package io.java.oops.interfaces;

/*
 * if we are inheriting the abstract class to any subclass we need to 
 * extend the class
 * however if it is an interface we need implements in order to inherit.
 */
class InterfaceMethodImpl implements Myinterface{
	/*
	 * This class must have to implement both the abstract methods, else
	 * you will get compilation error.
	 */

	@Override
	public void methodOne() {
		System.out.println("This is method number 1");

	}

	@Override
	public void methodTwo() {
		System.out.println("This is method number 2");
	}

	@Override
	public void methodthr() {
		System.out.println("This is method number 3");
	}

	@Override
	public void methodfou() {
		System.out.println("This is method number 4");
	}

	@Override
	public void methodfif() {
		System.out.println("This is method number 5");
	}

	@Override
	public void methodsix() {
		System.out.println("This is method number 6");
	}

	@Override
	public void methodsev() {
		System.out.println("This is method number 7");
	}

	@Override
	public void methodeig() {
		System.out.println("This is method number 8");
	}
	
}

interface Myinterface {
	/* 
	 * compiler will treat them as 
	 * public abstract void methodOne();
	 */
	public void methodOne();
	public void methodTwo();
	public void methodthr();
	public void methodfou();
	public void methodfif();
	public void methodsix();
	public void methodsev();
	public void methodeig();
	
	public static void main(String[] args) {
		// create an object to the subclass
		InterfaceMethodImpl object=new InterfaceMethodImpl();
		object.methodOne();
		object.methodsix();
	
	}
}