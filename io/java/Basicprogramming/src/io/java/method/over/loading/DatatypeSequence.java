package io.java.method.over.loading;

class Definition{
	
	//Methods
	public void disp(char c, int num) {
		System.out.println("I'm the first defination of method disp");
	}
	public void disp(int num, char c) {
		System.out.println("I'm second defination of method disp");
		System.out.println("===============================");
	}
}

// return keyword.

class Seconddefinition
{
	public double myMethod(double numberOne, int numberTwo) {
		System.out.println("Fitst method of class Seconddefinition");
		return numberOne+numberTwo;
	}
	public int myMethod(int variableOne, int variableTwo) {
		System.out.println("Second myMethod of class Seconddefinition");
		return variableOne-variableTwo ;
	}
}

public class DatatypeSequence {
	
	public static void main(String[] args) {
		
		// create an object 
		Definition signature=new Definition();
		signature.disp('X', 52);
		signature.disp(52, 'Y');
		
		//Create an object
		Seconddefinition ob=new Seconddefinition();
		ob.myMethod(10.23, 25);
		ob.myMethod(34, 26);
		}
}