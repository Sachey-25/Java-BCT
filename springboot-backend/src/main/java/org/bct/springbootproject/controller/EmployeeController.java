package org.bct.springbootproject.controller;

import org.bct.springbootproject.model.Employee;
import org.bct.springbootproject.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees") //http://localhost:8080/api/employees -- REST URI
public class EmployeeController {
	
	//DI
	private EmployeeService employeeService;

	//Constructor injection
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	} 
	
	//Build create employee REST API
	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>
		(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}
}
