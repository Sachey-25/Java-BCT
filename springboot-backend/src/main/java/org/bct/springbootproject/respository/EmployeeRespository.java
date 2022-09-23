package org.bct.springbootproject.respository;

import org.bct.springbootproject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Resource
@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Long>{
	//FieldName ---- Header names id, firstname, lastname, email
	//FieldValues --- table valus 101, sachin, anil, sachin@email,com
	

}