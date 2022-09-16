package org.bct.orm;

import org.bct.orm.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Application started");
        
        //create an IOC to talk to the hibernate
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        //Checking if the session created
        System.out.println(factory);
        System.out.println(factory.isClosed());
        
        //Create the student record
        Student student=new Student();
        student.setId(1011);
        student.setName("Tendulkar");
        student.setCity("Mumbai");
        System.out.println(student);
        
        
        //lets start the session
        Session session = factory.openSession(); //localSession
        
        //save session to save the data
        session.save(student);
        
        //Trasaction -- to make the data writable
        Transaction tx=session.beginTransaction();
        //commit 
        tx.commit();
        
        //close
        session.close();
        
        
    }
}
