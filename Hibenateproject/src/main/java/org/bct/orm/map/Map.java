package org.bct.orm.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Map {

	public static void main(String[] args) {
		
		
		//I need to build the configuration with the hibernate
		//because question and class are the table entity
		Configuration cfg=new Configuration();
		
		//Need to call the xml hibernate
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		//creating a question
		Question queOne=new Question();
			queOne.setQuestionId(1212);
			queOne.setQuestion("What is Java ?");
		
		//creating an answer
		Answer answer=new Answer();
			answer.setAnswerId(341);
			answer.setAnswer("Java is a high level programming language");
			// set the answer w.r.t to the question
			queOne.setAnswer(answer);
		
		// ------------- Second record ---------------------- //
		//creating a question
		Question queTwo=new Question();
		queTwo.setQuestionId(1213);
		queTwo.setQuestion("What is collection framework ?");
		
		//creating an answer
		Answer answera=new Answer();
		answera.setAnswerId(342);
		answera.setAnswer("The Java collections an api which provides object reference. ");
		// set the answer w.r.t to the question
		queTwo.setAnswer(answera);
		
		
		//creating a question
			Question queThree=new Question();
			queThree.setQuestionId(1214);
			queThree.setQuestion("What is Hibernate ?");
				
			//creating an answer
			Answer answerb=new Answer();
			answerb.setAnswerId(345);
			answerb.setAnswer("The Hibernate is a framework which"
						+ " helps to connect DB easily. ");
			// set the answer w.r.t to the question
			queThree.setAnswer(answerb);
		
		//session
		Session session=factory.openSession();
		
		//Transaction
		Transaction tx=session.beginTransaction();
		
		//save the record
		session.save(queOne);
		session.save(queTwo);
		session.save(queThree);
		session.save(answer);
		session.save(answera);
		session.save(answerb);
		//commit to read the query
		tx.commit();
		
		
		//fetching... 
		Question newQ=(Question) session.get(Question.class, 1213);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAnswer().getAnswer());
		
		//close the session
		session.close();
	}

}
