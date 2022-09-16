package org.bct.springorm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.bct.springorm.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;


public class StudentDao {
	
	//imported the hibernate template to perform dbOperations
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//save the student record 
	@Transactional
	public int insert(Student student) {
		int i=(Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	//Get the single data(object) -- read operation
	public Student getStudent(int studentId){
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	
	//Get the Alldata(objects) -- readAll Operation
	public List<Student> getAllStudents(){
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	//delete the data
	@Transactional
	public void deleteStudent(int studentId) {
		Student student=this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}
	
	//update the data
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}