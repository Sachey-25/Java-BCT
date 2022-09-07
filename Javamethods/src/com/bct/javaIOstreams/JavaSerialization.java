package com.bct.javaIOstreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

@SuppressWarnings("serial")
public class JavaSerialization implements java.io.Serializable{
	//data members
	
	/*
	 * This class implements serilization interface which means it can be serialized.
	 * All the fields of this class can be written to file after converted to stream of bytes.
	 * except those fields that are declared transient. 
	 * 
	 */
	
	private int stuRollNum;
	private int stuNum;
	private String stuName;
	private transient String stuAddress;
	private transient int stuHeight;
	
	// Parameterized constructor
	public JavaSerialization(int stuRollNum, int stuNum, String stuName, 
			String stuAddress, int stuHeight) {
		super();
		this.stuRollNum = stuRollNum;
		this.stuNum = stuNum;
		this.stuName = stuName;
		this.stuAddress = stuAddress;
		this.stuHeight = stuHeight;
	}
	//Getters and setters
	public int getStuRollNum() {
		return stuRollNum;
	}

	public void setStuRollNum(int stuRollNum) {
		this.stuRollNum = stuRollNum;
	}

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuAddress() {
		return stuAddress;
	}

	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

	public int getStuHeight() {
		return stuHeight;
	}

	public void setStuHeight(int stuHeight) {
		this.stuHeight = stuHeight;
	}

	//Main-Method
	public static void main(String[] args) {
		
		/*
		 * Serialization of Object
		 * This class is writting an object of JavaSerialization to the 
		 * JavaSerialization.ser file 
		 * I will be using fileOutputStream and ObjectOutputStream to write the object to
		 * File
		 * 
		 */
		JavaSerialization object = new JavaSerialization(101,25,"Sachin Anil","Bidar",5);
		
		// Best practice if we are dealing with any IO related operations 
		// we need to make use of Exception handling
		try {
			
			FileOutputStream fos=new FileOutputStream("Student.ser"); 
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(object);
			oos.close();
			fos.close();
			System.out.println("Seriliazation Done!!");
			
		}catch(IOException ioe) {
			System.out.println(ioe);
		}
		
		System.out.println("Student name: " + object.stuName);
		System.out.println("Student rollno: " + object.stuRollNum);
		System.out.println("Student Id: " + object.stuNum);
		System.out.println("Student city: " + object.stuAddress);
		System.out.println("Student height: " + object.stuHeight);

	}	
}
