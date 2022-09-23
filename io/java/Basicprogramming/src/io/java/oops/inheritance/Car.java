package io.java.oops.inheritance;

//child class
class MarutiSuzuki extends Car{
	
	//method
	void display() {
		System.out.println("MarutiSuzuki lauched the recent SUV recently");
	}
}

class GrandVittera extends MarutiSuzuki{
	//method
	void disp() {
		System.out.println("And the SUV is GrandVittera");
	}
}

//Parent class
public class Car {
	
	//Method of car class
	public void car() {
		System.out.println("Class Car");
	}
	//another method
	public void vehicleType() {
		System.out.println("Vehicle Type: SUV");
	}

	public static void main(String[] args) {
		//Creating an object to the subclass to GrandVittera
		GrandVittera instance=new GrandVittera();
		System.out.println("----------MultiLevel Inheritance-----------");
		instance.car();
		instance.vehicleType();
		instance.display();
		instance.disp();
	}
}