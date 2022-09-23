package Bctjavabasics;

//class
public class Javavariables {
	
	// class body
	// variables in the class body ----> Instance variables.
	int valueofzerofactorial=1;
	int defaultvalueofsqaure=2;
	
	// preceding ----> flow of code implementation <--- java coded on rules.
	// static will be taken before the datatype declaration.
	 static int binary=200; // object created. 
	
	//main method
	public static void main(String[] args) {
		//method body ()
		
		// integer 
		// Rule of variable naming convention --> all the variable must start with lower-case 
		// code quality ----> code must not contain any anomalies, warnings 
		// Code must have comments whenever found a logic.
		
		// Local variables.
		int number=100;
		int num=1234;
		int numb=34;
		int numbe=1000;
		int nu=45678;
		int n=9876;
		
		String name="Sachin"; 
		String greetings="Hi to the world";
	
		System.out.println("My first integer value is : " + number);
		System.out.println("My second integer value is : " + num);
		System.out.println("My third integer value is : " + numb);
		System.out.println("My fourth integer value is : " + numbe);
		System.out.println("My fifth integer value is : " + nu);
		System.out.println("My sixth integer value is : " + n);
		
		System.out.println("--------------------------------------------");
		// println if used execution goes to the nextline.
		
		// Concatenation <--- combine 
		System.out.println("My name is : " + name + " " + greetings); 
		//System.out.println("Message: " + greetings); 
		
	}
}