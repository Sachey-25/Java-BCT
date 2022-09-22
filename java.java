1) What would be the output of the below code?

public static voud main(String args[]){
	int rollNo = 101;
	float newRollNo = rollNo;
	System.out.println(newRollNo);
}

a) 101
b) compilation error: cannot convert from int to float
c) 101.0
d) runtime error

Ans : c

2) Which is the correct order of widening conversion for the below types?
byte, double, int, short

a) short ---> int ---> byte ---> double
b) byte ---> int ----> short ---> double
c) byte ---> short ---> int ---> double
d) double ---> int ---> short ---> byte

Ans : c

3) What will be the output of the below code?

public static voud main(String args[]){
	short number = 32767;
	short numberTwo=(short)(number+1);
	System.out.println(numberTwo);
}
a) compilation error: cannot convert from int to float
b) 32767
c) 32768
d) -32768

Ans : d) -32768

4) What will be the output of the below code?

public class Tester{
	public boolean checkTemp(int temp){
		if(temp > 100){
			return true;
		}else{
			return false;
		}
  }
public static void main(String args[]){ 
	Tester tester = new Tester();
	if(tester.checkTemp(110)){
		System.out.println("Data is valid");
	}else{
		System.out.println("Data is invalid");
	}
  }
}

a) Data is invalid
b) Data is valid
c) true
d) false

Ans: b) Data is valid

5) What will be the output of the below code?
public class Tester{
	public void demoMethod(){
		int varOne=1000;
		float varTwo=20.00f;
		double varThree=0.0;
		varThree=(double)(varTwo+varOne*(7.0/100));

  }
public static void main(String args[]){ 
	Tester tester = new Tester();
	tester.demoMethod();
	}
  }
}

a) varThree:20.0
b) vatThree:90.0
c) varThree:1020.0
d) varThree:0.0
Ans : b) vatThree:90.0

6) Identify the number of instances and local variables present in the Student class given below
	public class Student{
		public int rollNo;
		public String studentName;
		
		public void findGrade(int marks){
			char grade;
			if(marks > 90)
				grade = 'A';
			else if (marks < 90 && marks > 90)
				grade = 'B';
			else if (marks < 80 && marks > 70)
				grade = 'C';
			else
				grade 'D';
			System.out.println(grade);
		}
	}

a) 2 instances variables, 2 local variables
b) 3 instances variables, 1 local variables
c) 2 instances variables, 1 local variables
d) 4 instances variables, 0 local variables	

Ans : 	a) 2 instances variables, 2 local variables

7) 	What is the output of the below code?
public class Tester{
	public int subtract(int a, int b){
		return (a-b);
	}
	public static void main(String args[]){
		int a=10;
		int b=20;
		Tetster tester = new Tester();
		int res = tester.subtract(b,a);
		System.out.println(res);
	}
}
a) 0
b) -10
c) 10
d) Compilation error: the name of the formal and actual parameters must be the same

Ans: c) 10

8) 7) 	What is the output of the below code?
public class Tester{
	public int add(int a, int b){
		return (a+b);
	}
	public static void main(String args[]){
		int a=10;
		int b=20;
		int sum=0;
		Tetster tester = new Tester();
		tester.add(a,b);
		System.out.println(sum);
	}
}
a) 0
b) -10
c) 10
d) 30

Ans :a) 0

9) What will be the output of the below code?
class demo{
	public int value=20;
	
	Demo(){
		value=40;
	}
}
public class Tester{
	public static void main(String args[]){
		Demo demo= new Demo();
		System.out.println(demo.value);
	}
}
a) 0
b) 20
c) 40
d) Compilation error: Variable 'value' is nor declared

Ans: C

class Demo{
	
	public int var1=20;
	public int var2=40;
	Demo(int v1, int v2){
		var1=v1;
		var2=v2;
	}
}
public class Tester{
	public static void main(String args[]){
		Demo demo-new Demo();
		System.out.println(demo.var1);
		System.out.println(demo.var2);
	}
}

20.40;
0.0;
40.20;
compilation error: Tetser has no default constructor



public class Circle{
	public double radius;
	
	Circle(double r){
		radius =r;
	}
}
Which is following option create an object for the class?


What will be the output of the below code?
public class Tester{
	public int num1;
	public int num2;
	
	Tester(int num1, int num2){
		num1=num1;
	num2=num2;
	}
	public static void main(String args[]){
		Tester tester - new Tester();
		System.out.println(testerr.num1);
		System.out.println(tester.num2);
		
	}
}
