package io.java.oops;

class Animal{
	String AnimalName;
	int Anaimalage;
	String AnimalBreed;
	String AnimalColor;
}

public class Employee {
	//data members
	int empid;
	String name;
	String desig;
	String city;

	public static void main(String[] args) {
		// Creating an object to the class - Employee
		Employee obj=new Employee();
		
		//assigining the values in the main function
		obj.empid=102;
		obj.name="Sachin Anil";
		obj.desig="Technical Lead";
		obj.city="Bangalore";
		
		//Display the output
		System.out.println("Employee Id is : " + obj.empid + "\n" +
				"Employee Name : " + obj.name + "\n" +
				"Employee Designation : " + obj.desig + "\n" +
				"Employee City : " + obj.city);
		
		System.out.println("----------------------------------------");
		System.out.println("-----Below Data are from Animal class-------");
		
		//Creating an object to the class - Animal
		Animal dog=new Animal();
		dog.AnimalName="Dog";
		dog.Anaimalage=8;
		dog.AnimalBreed="German Sheperd";
		dog.AnimalColor="Multicolor";
		System.out.println("Animal is : " + dog.AnimalName + "\n"
				+ "Dog's age is : " + dog.Anaimalage + "\n" 
				+ "Dog's breed is : " + dog.AnimalBreed + "\n"
				+ "Dog's Color is : " + dog.AnimalColor);
	}
}