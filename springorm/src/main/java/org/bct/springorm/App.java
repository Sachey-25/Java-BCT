package org.bct.springorm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.bct.springorm.dao.StudentDao;
import org.bct.springorm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
		
//		Student student=new Student(101,"Sachin Anil","Bangalore");
//		
//		int r=studentDao.insert(student);
//		
//		System.out.println("done record inserted: " + r);
		
		
		
		//I will be performing all the operation below
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		boolean go=true;
		System.out.println("*****Welcome to Spring Orm Application*****\n");
		while(go) {
			
			System.out.println("PRESS 1 for add new Student Record");
			System.out.println("PRESS 2 for display all the student Record");
			System.out.println("PRESS 3 for get all details of single Student ");
			System.out.println("PRESS 4 for delete student record");
			System.out.println("PRESS 5 for Update student");
			System.out.println("PRESS 6 for Exit");
			
			
		//exception here
		try {
			
			// Providing input at the run time 
			int input=Integer.parseInt(br.readLine()); // Integer 1,2,3,4,5,6 
			
			//better program execution
			switch(input) 
			{
			case 1:
				//add a new student
				// taking inputs from users
				System.out.println("Enter student Id: ");
				int studentId=Integer.parseInt(br.readLine());
				
				System.out.println("Enter student name: ");
				String studentName=br.readLine();
				
				System.out.println("Enter student city: ");
				String studentCity=br.readLine();
				
				//create an object w.r.f to the class where the DM exits
				Student student=new Student();
				student.setStudentId(studentId);
				student.setStudentName(studentName);
				student.setStudentCity(studentCity);
				
				//saving the student object by calling insert() from dao class
				int r=studentDao.insert(student);
				System.out.println(r +" Student added");
				System.out.println("*********************************");
				System.out.println();
				
				break;
				
			case 2:
				//display all student
				System.out.println("************************************");
				
				List<Student> allStudents=studentDao.getAllStudents();
				
				for(Student st:allStudents) {
					System.out.println("Id: " + st.getStudentId());
					System.out.println("Name: " + st.getStudentName());
					System.out.println("City: " + st.getStudentCity());
					System.out.println("___________________________________");
				}	
				
				break;
				
			case 3:
				//get single student data
				System.out.println("Enter Student Id : ");
				int StudentId=Integer.parseInt(br.readLine());
				Student stuOne= studentDao.getStudent(StudentId);
					System.out.println("Id : " + stuOne.getStudentId());
					System.out.println("Name : " + stuOne.getStudentName());
					System.out.println("City: " + stuOne.getStudentCity());
					System.out.println("________________________________________");
					
				break;
				
			case 4:
				//delete student record
				System.out.println("Enter Student Id: ");
				int id=Integer.parseInt(br.readLine());
				studentDao.deleteStudent(id);
				System.out.println("Student Deleted..");
				break;
				
				
			case 5:
				//update student record
				System.out.println("Enter Student Id: ");
				break;
				
			case 6:
				//exit the application
				go=false;
				
				break;
			}
		}catch(Exception e) {
				System.out.println("Invalid input Try with another one !!");
			}

			System.out.println("*****Thank you for using my application******");
			System.out.println("See you soon!!");		
		
		((ClassPathXmlApplicationContext) context).close();
		
		}
	}
}