package io.java.method.over.loading;

class anotherExample {
	public void disp() {
		System.out.println("print C");
	}
	public void disp(double d) {
		System.out.println(d + " By default java stores the decimal in terms of double");
	}
	public void disp(char a) {
		System.out.println(a + " This is a letter");
	}
}

public class Overloading {
	// data members --- Variables
	
	//Methods 
	public void disp() {
		System.out.println("This is a class method");
	}
	public void disp(int a, int b) {
		System.out.println("This is a class method");
		int result=a+b;
		System.out.println("Adding the 10 and 20 are : " + result);
	}
	public void disp(int a, float b) {
		System.out.println("This is a class method");
	}
	public void disp(int a, String name) {
		System.out.println("This is a class method");
	}
	
	public static void main(String[] args) {
		
		//Creating an object to the class Overloading
		Overloading object=new Overloading();
		object.disp();
		object.disp(10, 10.09f); // parameter passing 
		object.disp(10, 20);
		object.disp(10, "Sachin ");
		
		// Creating an object to the clss anotherExample
		anotherExample instance=new anotherExample();
		instance.disp();
		instance.disp(9.812);
		instance.disp('S');
	}
}
