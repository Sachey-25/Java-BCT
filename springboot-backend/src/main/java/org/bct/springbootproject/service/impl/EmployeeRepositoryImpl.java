package org.bct.springbootproject.service.impl;

import org.bct.springbootproject.model.Employee;
import org.bct.springbootproject.respository.EmployeeRespository;
import org.bct.springbootproject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeRepositoryImpl implements EmployeeService{
	
	//Dependency Injection
	@Autowired
	private EmployeeRespository employeeRespository;
	
	//Constructor injection. ----> store the values.
	public EmployeeRepositoryImpl(EmployeeRespository employeeRespository) {
		super();
		this.employeeRespository = employeeRespository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRespository.save(employee);
	}
}