package io.java.oops;

public class Student {
	// class body
	
	int id=101; //data-members or instance or field or attributes
	String name="Sachin Anil";
	int age=28;
	String organization="Wipro";
	String location="Bangalore";

	public static void main(String[] args) {
		//main method body
		
		//Creating an object to the class - Student
		// <className> objectName = new <className>();
		Student object=new Student(); 
		//* object created -- JVM has given all the properties of the class
		// access the values of the class via object, that has to be done with the
		// (.)dot operator. 
		
		System.out.println("Student Id is: " + object.id);
		System.out.println("Student name is : " +object.name);
		System.out.println("Student Age: " + object.age);
		System.out.println("Student intership at : " + object.organization);
		System.out.println("Student belong to : " + object.location);

	}

}