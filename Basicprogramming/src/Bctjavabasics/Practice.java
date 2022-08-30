package Bctjavabasics;

public class Practice {

	public static void main(String[] args) {
		int numberOne=10;
		int numberTwo=20;
		int result=numberOne+numberTwo;
		
		numberTwo=numberOne;
		System.out.println("=Output : " + numberTwo);
		
		numberTwo+=numberOne;
		System.out.println("=Output: " + numberTwo);
		
		numberTwo*=result;
		System.out.println("=Output: " + numberTwo);
		
		//Relationship operator
		System.out.println("=Output if eqauls: " + (numberTwo==result));
		System.out.println("=Output if lesser than : " + (numberTwo<result));
		System.out.println("=Output if greater than : " + (numberTwo>result));
		System.out.println("=Output if not equals :" + (numberTwo!=result));
		
		//Logical Operator
		System.out.println("=Output Logical and operator : " +
							(numberTwo<result && numberTwo>numberOne)); 
		System.out.println("=Output Logical OR operator : " +
				(numberTwo<result || numberTwo>numberOne)); 
		System.out.println("=Output Logical not operator : " +
				(numberTwo<result && numberTwo!=numberOne)); 
		System.out.println("-----------------------------------------");
		//Ternary Operator
		numberTwo=(numberOne==10)? 100 : 200;
		System.out.println("=numberTwo : " + numberTwo);
		
		//return type ---> int, str, boolean, float, double 
		boolean numTwo=true;
		numTwo=(numberOne==10)? true : false;
		System.out.println(numTwo);
		numTwo=(numberOne!=10)? true : false;
		System.out.println(numTwo);
	}
}