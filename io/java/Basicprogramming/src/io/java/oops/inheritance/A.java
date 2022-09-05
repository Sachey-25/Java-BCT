package io.java.oops.inheritance;

//subclass
class B extends A{
	//method
	public void methodB() {
		System.out.println("method of class B");
	}
}

//subclass
class C extends A {
	//method
	public void methodC() {
		System.out.println("method of class C");
	}
}

//subclass
class D extends A {
	//method
	public void methodD() {
		System.out.println("method of class D");
	}
}

//parent
public class A {
	
	//method
	public void methodA() {
		System.out.println("method of class A");
	}

	public static void main(String[] args) {
		//since all the sub classes are different to each other we need to create indivisual objects.
		B objectb=new B();
		C objectc=new C();
		D objectd=new D();
		//All the classes can access the method of class A
		objectb.methodA();
		objectc.methodA();
		objectd.methodA();
	}
}