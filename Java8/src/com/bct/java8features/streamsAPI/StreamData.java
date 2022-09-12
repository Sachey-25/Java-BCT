package com.bct.java8features.streamsAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamData {
	/*
	 * Stream collectors -- To fetching data as list.
	 */
	
	private int id;
	private String name;
	private String orgname;
	private String city;
	
	public StreamData(int id, String name, String orgname, String city) {
		this.id = id;
		this.name = name;
		this.orgname = orgname;
		this.city = city;
	}

	public static void main(String[] args) {
		
		//Lets create a collector
		List<StreamData> empdetails=new ArrayList<StreamData>();
		//Adding the employees
		empdetails.add(new StreamData(11,"Sachin","Wipro","Bangalore"));
		empdetails.add(new StreamData(89,"Sachi","Bct","Chennai"));
		empdetails.add(new StreamData(45,"Sach","GlobalLogic","Bangalore"));
		empdetails.add(new StreamData(33,"Sac","Infosys","Mumbai"));
		
		//Fetching the data as list
		List<String> emp=empdetails.stream()
				.map(n->n.name)
				.collect(Collectors.toList());
		System.out.println(emp);
		
		//Fetching the data as list
		List<Integer> Id=empdetails.stream()
				.map(n->n.id)
				.collect(Collectors.toList());
		System.out.println(Id);
		
		//Fetching the data as list
		List<String> Orgname=empdetails.stream()
				.map(n->n.orgname)
				.collect(Collectors.toList());
		System.out.println(Orgname);
		
		//Fetching the data as list
		List<String> city=empdetails.stream()
				.map(n->n.city)
				.collect(Collectors.toList());  // []
		System.out.println(city);
		
		System.out.println("--------------------------------");
		// Fetching the data as Set	
		Set<String> cities=empdetails.stream()
				.map(n->n.city)
				.collect(Collectors.toSet());  // {} 
		System.out.println(cities);
		
		//Iterating Set to get the full details of an employee
		for(StreamData data : empdetails) {
			System.out.println("*********************************");
			System.out.println("Employee Id : " + data.id);
			System.out.println("Employee Name : " + data.name);
			System.out.println("Employee Orgname : " + data.orgname);
			System.out.println("Employee City : " + data.city);
		}
	}

}
