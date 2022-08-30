package io.java.programming;

public class Switchstatements {

	public static void main(String[] args) {
		int number=6;
		
		switch(number) // switch(3)
		{
		case 1: // first if statement 
			System.out.println("Case 1: Value is : " + number);
			break;
		case 2: // second if statement
			System.out.println("Case 2: Value is : " + number);
			break;
		case 3: // third if statement
			System.out.println("Case 3: Value is : " + number);
			break;
		case 4: // fourth if statement
			System.out.println("Case 4: Value is : " + number);
			break;
		case 5: // fifth if statement
			System.out.println("Case 5: Value is : " + number);
			break;
		default:
			System.out.println("This is  default optional operation");
		}
		
		char ch='I';
		switch(ch) {
		case 'A':
			System.out.println("A is the first vowel");
			break;
		case 'E':
			System.out.println("E is the second vowel");
			break;
		case 'I':
			System.out.println("I is the third vowel");
			break;
		case 'O':
			System.out.println("O is the fourth vowel");
			break;
		case 'U':
			System.out.println("U is the fifth vowel");
			break;
		default:
			System.out.println("Default operation");
		}
	}
}
