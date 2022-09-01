package io.java.oops.inheritance;

class Techical extends Inheritance{
	//data members of subclass
	String subject="Java OOP programming";
}

//Parent class 
public class Inheritance {
	
	//Data members
	String designation="Techincal Trainer";
	String institution="SkillBout";
	
	//Concrete methods
	void display() {
		System.out.println("Training going on");
	}
	void print() {
		System.out.println("We are learnig about inheritance");
	}
	void method() {
		System.out.println("These are all concrete methods");
	}

	public static void main(String[] args) {
		Techical instance=new Techical();
		//below are datamembers of the parent class eventually derived to subclass
		System.out.println(instance.designation);
		System.out.println(instance.institution);
		//below the data members from sublcass 
		System.out.println(instance.subject);
		
		//Invoking the methods 
		instance.display();
		instance.print();
		instance.method();

	}
}