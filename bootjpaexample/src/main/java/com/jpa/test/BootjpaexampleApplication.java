package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.Userrepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		//IoC
		ApplicationContext context=SpringApplication.run
				(BootjpaexampleApplication.class, args);
		
		//DI
		Userrepository userRepository=context.getBean(Userrepository.class);
		
		// Assigning the values to the constructor -- dataTable objects.
		//Create
		/*-----------------%% 1st data insertion---------------------*/
//		User user=new User();
//		user.setName("Programming");
//		user.setCity("Bidar");
//		user.setStatus("Java FullStack");
//		//We need to save the object values to the database;
//		userRepository.save(user);
//				
//		/*----------------%% 2nd data insertion-----------------------*/
//		User userone=new User();
//		userone.setName("Sachin Anil");
//		userone.setCity("Bangalore");
//		userone.setStatus("I am Java programmer");
//		//We need to save the object values to the database;
//		userRepository.save(userone);
//		
//		/*-----------------%% 3rd data insertion---------------------*/
//		User usertwo=new User();
//		usertwo.setName("Sourav Gangully");
//		usertwo.setCity("Kolkatta");
//		usertwo.setStatus("BCCI chaiman");
//		//We need to save the object values to the database;
//		userRepository.save(usertwo);
//		
//		/*----------------%% 4th data insertion-----------------------*/
//		User userthr=new User();
//		userthr.setName("Rahul Dravid");
//		userthr.setCity("Indore");
//		userthr.setStatus("IC Coach");
//		//We need to save the object values to the database;
//		userRepository.save(userthr);
//		
//		/*----------------%% 5th data insertion-----------------------*/
//		User userfour=new User();
//		userfour.setName("Brian Lara");
//		userfour.setCity("WestIndies");
//		userfour.setStatus("First batsman to reach 400* in Test");
//		//We need to save the object values to the database;
//		userRepository.save(userfour);
//	
//		//read any one record
//		List<User>users=List.of(user,userone,usertwo,userthr,userfour);
//		Iterable<User> result=userRepository.saveAll(users);
//		result.forEach(read -> {System.out.println(read.toString());});
//		
//		//update the record --- we need to find(exits)
//		// repository
//		Optional <User> optional=userRepository.findById(44);
//		User update=optional.get(); // true -- 24
//		update.setName("Yuvraj Singh");
//		update.setCity("Chandigarh");
//		update.setStatus("Man of the tournment in 2011 ODI WC");
//		User saveUpdate=userRepository.save(update);
//		System.out.println(saveUpdate);
//		
//		
//		//findByAll
//		Iterable<User> singleData=userRepository.findAll();
//		Iterator<User> iterator=singleData.iterator();
//		
//		while(iterator.hasNext()) {
//			User userItr=iterator.next();
//			System.out.println(userItr);
//		}
//		
//		//Read a single data record.
//		Optional<User> optionaldata=userRepository.findById(44);
//		User singleDt=optionaldata.get();
//		User data = userRepository.save(singleDt);
//		System.out.println(data);
//		
//		//delete single data record
//		userRepository.deleteById(39);
//		System.out.println("Id 39 is been deleted..!");
//		
//		
//		//deleteAll
//		Iterable<User> allusers=userRepository.findAll();
//		allusers.forEach(input -> {System.out.println(input);});
//		userRepository.deleteAll(allusers);
//		System.out.println("All records are wiped..!");
		
		
		List<User> users=userRepository.findByName("Yuvraj Singh");
		users.forEach(e -> System.out.println(e));
		System.out.println(users);
		
		List<User>userNameandCity=userRepository.findByNameAndCity("Yuvraj Singh", "Chandigarh");
		userNameandCity.forEach(input -> {System.out.println(input);});
		System.out.println(userNameandCity);
	}
}