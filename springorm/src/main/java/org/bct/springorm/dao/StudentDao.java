package org.bct.springorm.dao;

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

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}