package io.java.programming;

public class Ifstatement {

	public static void main(String[] args) {
		//if statement ---> True scenarios...
		int number=2;
		// w.k.t any number which reminder results into 0 is called even.
		int result=number;
		System.out.println((number%2==0 )+ " it is even number");
		System.out.println(result);
		System.out.println("========================================");
		
		//if statement
		if(number%2==0) {
			// if body
			System.out.println("Output: even number " + number);
		}
		//note :---> if statement will execute if its true!!!!
		if(number==2) {
			System.out.println("This is another example");
		}
		if(number!=0) {
			System.out.println("This is one more");
		}
		if(number<50) {
			System.out.println("This is one more");
		}
		if(number >50) {
			System.out.println("This is one more");
		}
		if(number <= 25) {
			System.out.println("This is one more");
			System.out.println("This is crazy!!!");
		}
		//Nested if statement ---> within -- inside 
		/* the first if statement must true to get into another if statement
		the second must be true to get into third if statement
		like wise...... // if any of the if statement is false the chain breaks
		 the execution comes out of if body!. */
		System.out.println("***************************************");
		
		//If statement is valid only at true conditions.
		
		if(true) {
			System.out.println("first if is true");
			if(true) {
				System.out.println("second if is true");
				if(true) {
					System.out.println("Third if is false");
					if(true) {
						System.out.println("fourth if is true");
						
					}
				}
			}
		}		
	}
}