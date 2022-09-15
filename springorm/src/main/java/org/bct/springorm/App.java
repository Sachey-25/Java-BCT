package org.bct.springorm;

import org.bct.springorm.dao.StudentDao;
import org.bct.springorm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
		
		Student student=new Student(2526,"SpringOrm","Mumbai");
		
		int r=studentDao.insert(student);
		
		System.out.println("done record inserted: " + r);
		
		((ClassPathXmlApplicationContext) context).close();

	}

}