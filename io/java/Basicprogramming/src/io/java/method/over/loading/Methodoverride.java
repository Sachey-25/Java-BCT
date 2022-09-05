package io.java.method.over.loading;

class Human{
	
	//Method
	public void eat() {
		System.out.println("Human is eating");
	}
}

class Boy extends Human{
	public void eat() {
		System.out.println("Boy is eating");
		
	}
}

class MybaseClass{
	//method
	public void disp() {
		System.out.println("Parent class Method");
	}
}
class MychildClass extends MybaseClass{
	//method - which should be present in parent class
	public void disp() {
		System.out.println("Child class Method");
	}
}

public class Methodoverride {

	public static void main(String[] args) {
		//Creating an object
		Boy object=new Boy();
		object.eat();
		System.out.println("---------Below is another example of method override-------");
		MybaseClass obj=new MybaseClass();
		obj.disp();
	}
}