package io.java.loops;

public class Whileloop {

	public static void main(String[] args) {
		
		//Initialization outside of the loop
		int i=6;
		while(i>1) {
			System.out.println(i);
			i--;
		}
		// controlling statements -- continue, break
		// continue ---> after an appropriate condition holds good the interation
		// should call the loop back without executing that iteration.
		// break -----> after an appropriate condition holds good the interation
		// should terminate from there.
		int counter=10;
		while(counter >=0) {
			System.out.println("one more execution: " + i);
			if(counter==7) {
				counter--;
				continue;
			}
			System.out.println(counter+ " ");
			counter--;
		}
		
		//1. Use break statement to come out of the loop instantly. 
		//2. It is also used in switch statement to control the cases/conditions
		
		int number=0;
		while(number<=100) {
			System.out.println("Value of variable is: " + number);
			if(number==10) {
				break;
			}
			number++;
		}
		System.out.println("Out of the while-loop");
	}
}