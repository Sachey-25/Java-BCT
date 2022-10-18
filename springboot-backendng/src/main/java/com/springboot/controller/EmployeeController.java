package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.exception.ResourceNotFoundException;
import com.springboot.model.Employee;
import com.springboot.repository.EmployeeRespository;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRespository employeerespository;
	
	//Get all Employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeerespository.findAll();
	}
	//Crud operations
	//Create
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeerespository.save(employee);
	}
	
	//get employee by Id rest API
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		Employee employee = employeerespository.findById(id)
				.orElseThrow(() -> 
				new ResourceNotFoundException("Employee not exists with id: " + id));
		return ResponseEntity.ok(employee);
	}
	
	//update employee rest API
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,  
			@RequestBody Employee employeeDetails){
		Employee employee = employeerespository.findById(id)
				.orElseThrow( ()-> 
				new ResourceNotFoundException("Employee not exist with id;" +id));
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmailId(employeeDetails.getEmailId());
		
		Employee updateEmployee=employeerespository.save(employee);
		return ResponseEntity.ok(updateEmployee);
		
	}
	
}
