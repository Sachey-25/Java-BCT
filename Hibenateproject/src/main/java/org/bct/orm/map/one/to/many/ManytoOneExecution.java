package org.bct.orm.map.one.to.many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManytoOneExecution {

	public static void main(String[] args) {
		//I need to build the configuration with the hibernate
		//because question and class are the table entity
		Configuration cfg=new Configuration();
		
		//Need to call the xml hibernate
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		//creating another question
		ManytoOneQues queOne=new ManytoOneQues();
		queOne.setQuestionId(110);
		queOne.setQuestion("What is Rocket Science ?");
		
		//creating answer
		ManytoOne ansOne=new ManytoOne();
		ansOne.setAnswerId(111);
		ansOne.setAnswer("Something which is very diffiicult to understand");
		ansOne.setQuestion(queOne);
		
		ManytoOne ansTwo=new ManytoOne();
		ansTwo.setAnswerId(112);
		ansTwo.setAnswer("It is a part of AeroSpace Engineering");
		ansTwo.setQuestion(queOne);
		
		ManytoOne ansThr=new ManytoOne();
		ansThr.setAnswerId(113);
		ansThr.setAnswer("It deals with the expert mathematics");
		ansThr.setQuestion(queOne);
		
		List<ManytoOne> list = new ArrayList<ManytoOne>();
		list.add(ansOne);
		list.add(ansTwo);
		list.add(ansThr);
		
		queOne.setAnswers(list);
		
		//session
		Session s=factory.openSession();
		//Transaction
		Transaction tx = s.beginTransaction();
		//save
		s.save(queOne);// one data/record reference to 
		s.save(ansOne); // 1
		s.save(ansTwo); // 2
		s.save(ansThr); // 3-----> many ..!!!!
		//commit
		tx.commit();
		//close
		s.close();
		
		factory.close();
	
	}

}
