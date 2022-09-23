package io.java.oops.inheritance;
//Inheritance we need to two classes -- 1. main class 2. subclass

//Inheritance aplied -- childclass
class Javatraining extends Training{
	String mainSubject="Java fullstack development";
}

//parent class 
public class Training {
	String designation="Technical Trainer";
	String corporate="BCT";
	
	//method
	void does() {
		System.out.println("Teaching.. single inheritance!!!");
	}
	void print() {
		System.out.println("Teaching.. single inheritance!!!");
	}
	void display() {
		System.out.println("Teaching.. single inheritance!!!");
	}
	void info() {
		System.out.println("Teaching.. single inheritance!!!");
	}
	void message() {
		System.out.println("Teaching.. single inheritance!!!");
	}

	public static void main(String[] args) {
		Javatraining object=new Javatraining();
		System.out.println(object.designation);
		System.out.println(object.corporate);
		System.out.println(object.mainSubject);
		object.does();
		object.print();
		object.display();
		object.info();
		object.message();
	}
}
