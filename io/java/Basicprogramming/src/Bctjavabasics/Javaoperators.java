package Bctjavabasics;

public class Javaoperators {

	public static void main(String[] args) {
		
		// Unary Operators
		int numberOne=5;
		System.out.println("Initial number is : " + numberOne);  // 5
		//Applying the unary operator
		
		numberOne++;
		System.out.println("Initial number is : " + numberOne); // 6
		
		System.out.println("After Unary Operation number is : " + numberOne);
		
		numberOne++;
		System.out.println("After Unary Operation number is : " + numberOne); // 7
		
		numberOne--; // post decrement =====> operations taken place decrementing the number
		
		System.out.println("Initial number is : " + numberOne); // 7
		System.out.println("After Unary Operation number is : " + numberOne);
		
		//pre increment/decrement
		++numberOne;
		--numberOne;

		int numberTwo=2;
		numberTwo++;
		numberTwo++;
		numberTwo++;
		System.out.println("Another Number : " + numberTwo );
		numberTwo--;
		System.out.println("One more operartion : " + numberTwo);
		
		//Arithmetic Operators
		int valueOne=10;
		int valueTwo=20;
		System.out.println("Addition of valueOne and valueTwo is : " + (valueOne+valueTwo));
		System.out.println("Subtraction of valueOne and valueTwo is : " + (valueOne-valueTwo));
		System.out.println("Multiply of valueOne and valueTwo is : " + valueOne*valueTwo);
		System.out.println("Division of valueOne and valueTwo is : " + valueOne/valueTwo);
		System.out.println("Modulo of valueOne and valueTwo is : " + valueOne%valueTwo);
		
		System.out.println(10*8-10*78/2*3-24%3);

	}
}
