package com.bct.java8features;

@FunctionalInterface
interface Myfunction{
	
	// A method with single parameter
	public int incrementByFive(int number);
}

@FunctionalInterface
interface addtion{
	//A method with multiple parameter
	public int addition(int num, int numb);
}

@FunctionalInterface
interface subtract{
	//A method with multiple parameter
	public int subtract(int num, int numb);
}

@FunctionalInterface
interface multiply{
	//A method with multiple parameter
	public int multiply(int num, int numb);
}

@FunctionalInterface
interface divide{
	//A method with multiple parameter
	public int divide(int num, int numb);
}

public class LambdaSingleParameter {

	public static void main(String[] args) {
		
		//Lambda expression with single parameter number. 
		Myfunction f = (number) -> number+5;
		System.out.println(f.incrementByFive(23));
				
		System.out.println(" ---- Additon operation --- ");
		addtion addition = (num, numb) -> num+numb;
		System.out.println(addition.addition(2, 2));
		
		System.out.println(" ---- Substract operation --- ");
		addtion subtract = (num, numb) -> num-numb;
		System.out.println(subtract.addition(2, 2));
		
		System.out.println(" ---- Multiply operation --- ");
		addtion multiply = (num, numb) -> num*numb;
		System.out.println(multiply.addition(2, 2));
		
		System.out.println(" ---- Devide operation --- ");
		addtion devide = (num, numb) -> num/numb;
		System.out.println(devide.addition(2, 2));
	}

}
