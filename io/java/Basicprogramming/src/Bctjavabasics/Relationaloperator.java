package Bctjavabasics;

public class Relationaloperator {

	public static void main(String[] args) {
		
		//Relational Operators ===> is always returns boolean type -> true or false. 
		/*
		 * 1. Lesser than
		 * 2. Greater than
		 * 3. Equals to 
		 * 4. Not Equals to 
		 */
		int alphaOne=23;
		int BetaOne=35;
		
		System.out.println("First check: " + (alphaOne < BetaOne)); // lesser than : true
		System.out.println("Second check: " + (alphaOne > BetaOne)); // greater than : false
		System.out.println("Third check: " + (alphaOne == BetaOne)); // equals : false
		System.out.println("Fourth check: " + (alphaOne != BetaOne)); // not equals : true
		//lesser than equals to // greater than equals to. 
		System.out.println("Fifth check: " + (alphaOne <= BetaOne)); // true
		System.out.println("Sixth check: " + (alphaOne >= BetaOne)); // false
		
		//Logical Operators
		/*
		 * 1. Logical and  ---> returns true if both the operands are true
		 * 2. Logical or   ---> returns true if any one operand is true
		 * 3. Logical not  ---> negation ----> true <if negations applied --> false.
		 * 
		 */
		System.out.println("---------AND Operator----------------");
		System.out.println("First check: " + (alphaOne < BetaOne && alphaOne<=BetaOne));
		System.out.println("First check: " + (alphaOne < BetaOne && alphaOne>=BetaOne));
		System.out.println("---------OR OPERATOR----------------");
		System.out.println("First check: " + (alphaOne < BetaOne || alphaOne<=BetaOne));
		System.out.println("First check: " + (alphaOne < BetaOne || alphaOne>=BetaOne));
		
		int num=10;
		System.out.println("Initial number is : " + num);
		num++;
		num++;
		int result=num; // 12
		System.out.println("After operation" + result);
		int display=num; // Assignment operator
		// 12<12
		System.out.println(display<result); // false
		// 12>12 && 12!=12 F && F ---> F
		System.out.println(display>result && display!=result); // false
		// 12==12 || 12<=12 T || F ----> T
		System.out.println(display<=result); // true
		System.out.println(display); // 12
		System.out.println(result); // 12
		System.out.println(num); // 12
		
		// Assignment Operator
		// Whatever we give the value/data at right hand side gets assigned to left hand
		// side. 
		
		int assignnumber=345;
		System.out.println(assignnumber); // 345
		assignnumber +=345; 
		// assignnumber = assignnumber+345
		// 		=====>    345+345 ==> 690 		
		System.out.println(assignnumber); // 
		
		// +=, -=, *=, /=, %=
		// += =====> av=av+ad;
		
		int a=9;
		a+=6; // ==> a=a+6 ==> 9+6 ==> 15
		System.out.println(a);
		a-=6; // ==> a=a-6 ==> 15-6 ==> 9
		System.out.println(a);
		a*=6; // ==> a=a*6 ==> 9*6 ===> 54
		System.out.println(a);
		a/=6; // ===> a=a/6 ==> 54/6 ==> 9
		System.out.println(a);
		a%=6; // ====> a=a%6 ==> 9%6 ==> 3
		System.out.println(a);
		
		//Note : a is being updated and JRE is considering updated value of variable. 		

	}
}