package io.java.oops;

public class EncapsulationExample {
	//data members
	private int empId;
	private String ename;
	private String city;
	private int pincode;
	
	//Getter and setter
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getCity() {
		return city;
	}
	
	public void setCity(String city) { // initialize the value
		this.city = city;
	}

	public int getPincode() { // display the output
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public static void main(String[] args) {
		//create an object
		EncapsulationExample object=new EncapsulationExample();
		object.setEmpId(40080257);
		object.setEname("Sachin Anil");
		object.setCity("Bangalore");
		object.setPincode(560045);
		
		System.out.println("Employee ID : " + object.getEmpId());
		System.out.println("Employee Name: " + object.getEname());
		System.out.println("Employee City: "+ object.getCity());
		System.out.println("Employee Pincode" + object.getPincode());

	}
}
