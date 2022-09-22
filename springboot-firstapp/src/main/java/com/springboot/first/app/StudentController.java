package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController      //--- Interacts with the http method 
public class StudentController {
	
	//http method -- Get method --- information
	//http:locahost:8080/student -----> JSON format {}
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Sachin","Anil");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		//Creating a collection of list
		List<Student> students=new ArrayList<>();
		students.add(new Student("Sachin","Tendulkar"));
		students.add(new Student("Tony","Stark"));
		students.add(new Student("Rohit","Sharma"));
		return students;
	}
}
