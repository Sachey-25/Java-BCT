package io.java.oops.inheritance;

//inheritance
	class Driver extends Carclass{
		String drivername;

		public Driver(String carName, int carId, String drivername) {
			super(carName, carId);
			this.drivername = drivername;
		}		
	}

public class Carclass {
	/*
	 * Association establishes relationship between two separate classes throuh threir
		objects. The relationship can be one to one, One to many, many to one and many to many

	 */
	
	//data members
	String carName;
	int carId;
	
	//Parameterized constructor
	public Carclass(String carName, int carId) {
		super();
		this.carName = carName;
		this.carId = carId;
	}
	
	public static void main(String[] args) {
		Driver object=new Driver("S-Cross", 8899, "Andy");
		System.out.println(object.drivername + " is a driver of car " + 
		object.carId + " and car is " + object.carName);
	}
}
