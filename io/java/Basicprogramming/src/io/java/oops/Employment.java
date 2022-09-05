package io.java.oops;

public class Employment {
	//data members
	int empid;
	String ename;
	int empage;
	String city;
	int epin;
	String state;
		
	//parameterized constructor
	public Employment(int empid, String ename, int empage, String city, int epin, String state) {
		super(); // optional 
		this.empid = empid;
		this.ename = ename;
		this.empage = empage;
		this.city = city;
		this.epin = epin;
		this.state = state;
	}
	//methods
	public int empid() {
		System.out.println("empid: " +empid);
		return empid;
	}
	public void ename() {
		System.out.println("empname: " + ename);
	}
	public int empage() {
		System.out.println("empage: " +empage);
		return empage;
	}
	public void empcity() {
		System.out.println("empscity: " +city);
	}
	public int epin() {
		System.out.println("empin: " +epin);
		return epin;
	}
	
	public void empstate() {
	System.out.println("empstate: " +state);
	}

	public static void main(String[] args) {
		// we need to create an object in order to access the data memebers
		Employment emp=new Employment(101,"Sachin Anil",28,"Bangalore",560045,"KA");
		//we need to invoke the every method using the class object.
		emp.empid();
		emp.ename();
		emp.empage();
		emp.empcity();
		emp.epin();
		emp.empstate();
	}
}