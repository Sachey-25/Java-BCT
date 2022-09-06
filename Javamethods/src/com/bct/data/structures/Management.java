package com.bct.data.structures;

//Program to demonstrate the an array objects

class StudentTwo{
	
	//data member
	public String sname;
	
	//Contructor for second class 
	StudentTwo(String sname){
		this.sname=sname;
	}
	
}

class Student{
	
	//data members
	public int rollNo;
	public String name;
	
	//Constructor
	Student(int rollNo, String Name){
		// in ordeer to initialize the variables we use this keyword
		this.rollNo=rollNo;
		this.name=Name;
	}

}

public class Management {

	public static void main(String[] args) {
		
		//Decalre an arrays of values.
		Student[] details;
		
		//Allocate the size of the array
		details=new Student[5];
		
		//Allocating the values 
		details[0]=new Student(1,"Sachin Anil");
		details[1]=new Student(2,"Sachin Anil");
		details[2]=new Student(3,"Sachin Anil");
		details[3]=new Student(4,"Sachin Anil");
		details[4]=new Student(5,"Sachin Anil");
		
		//accessign the values 
		for(int i=0; i<details.length;i++) {
			System.out.println("Student name : " + details[i].name + " " +
					"Student rollNo : " + details[i].rollNo );
			
		}
		System.out.println("--------------------------------------------");
		
		//Decalres an Array and initializing the element sof the array.
		StudentTwo[] detailsTwo=new StudentTwo[] { new StudentTwo("Sachin") };
		
		//access the values
		for(StudentTwo st: detailsTwo) {
			System.out.println(st.sname);
		}
	}

}
