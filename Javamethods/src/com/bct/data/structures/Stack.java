package com.bct.data.structures;

public class Stack {
	/*
	 * Stack is a linear data stracuture that follows a particular order in which
	 * the operation are perfrom.
	 * 
	 * --- LIFO (Last In First Out)
	 */
	
	// Implementing the stack using LinkedList
	static final int MAX=100;
	
	//define the top and tail. 
	int top;
	//a[100];
	int a[]=new int[MAX];
	
	//I need to check if the stack is empty or full 
	boolean isEmpty() {
		return (top<0);
	}
	
	//default constructor
	Stack(){
		top=-1;
	}
	
	// lets add the data to the stack
	boolean push(int value) {
		// -1 >= 100-1
		// -1 >= 99 // false ---> if (false)
		if(top>=(MAX-1)) {
			System.out.println("Stack Overflow");
			return false;
		}else {
			// a[0]=value
			a[++top]=value;
			System.out.println(value + " : Pushed into the stack");
			return true;
		}
	}
	
	int pop() {
		if(top<0) {
			System.out.println("Stack Overflow");
			return 0;
		}else {
			int value=a[top--];
			return value;
		}
	}
	
	int peek() {
		if(top<0) {
			System.out.println("Stack overflow");
			return 0;
		}else {
			int value=a[top];
			return value;
		}
	}
	//accessing the stack workflow
	public void display() {
		for(int i=top; i>-1; i--) {
			System.out.println(" " + a[i]);
		}
	}

	public static void main(String[] args) {
		/*
		 * Basic operations that stack follows
		 * 1. push() ---> to insert element into the stack
		 * 2. pop() ----> to remove an element from the stack
		 * 3. top() ----> Returns the top element of the stack
		 * 4. isEmpty() ---> returns true is stack is empty else false
		 * 5. size() ---> returns the size of stack
		 */
		Stack sobj=new Stack();
		sobj.push(10);
		sobj.push(20);
		sobj.push(11);
		sobj.push(22);
		sobj.push(30);
		System.out.println("Elements of stack are : " );
		sobj.display();
		
		System.out.println("The top element of the stack is always last in value");
		System.out.println(sobj.peek());
		System.out.println("The poped element would the top value itself");
		System.out.println(sobj.pop());
		System.out.println("--------------------------------------------------");

		System.out.println("Elements of stack are : " );
		sobj.display();

	}

}
