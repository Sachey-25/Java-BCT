package io.java.programming;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {		
		
		String info="-------Person details---------";
		System.out.println(info);
		// Scanner object and pass the string in it.
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a name");
		String personname=input.next();
		
		if(personname=="Sachin") {
			System.out.println("Person name : " + personname);
		}
		
		//I need check age
		System.out.println("Enter the age :");
		int age=input.nextInt();
	
		if(age>=22) {
			System.out.println("I am a graduate");
		}else {
			System.out.println("I am still studying");
		}
		
		// For address
		System.out.println("Enter an address");
		String address=input.next();
		if(address=="Bangalore") {
			System.out.println("I work in Bangalore");
		}
		//For organization
		System.out.println("Enter your ornanization name");
		String orgname=input.next();
		if(orgname=="Wipro") {
			System.out.println(" Entered orgnization is : " + orgname);
		}
		
		// For the location
		System.out.println("Enter the location");
		String location=input.next();
		if(location=="Bangalore") {
			System.out.println("My org is located in bangalore");
		}
		input.close();
	}
}