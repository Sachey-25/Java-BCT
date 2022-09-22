Exception handling in java
---------------------------

Exception Handling is one of the most important features of java that 
allows us to handle the number of errors caused by exceptions.
 
What is execption?
-------------------
-- An Exception is an unwanted event that interrupts the normal flow of 
code execution. When an execption occurs we get a system generated error message. 
which terminates the program. 

-- Compilation error 
-- Runtime error

Note: These are all human errors. 

Why an exceptio occurs?
-- There can be several reasons that can cause a program to throw an exception.
for example: -- a non-existing file in your computer. any bad input provided
by the user, Any syntax mismatch, Invalid operations.

Exception Handling--- Handling the errors.
------------------------------------------------ 
Motive -- We don't want to see the red indication in the console. 

Console output:
=================
red == missed the ; 

handled
============
-- user typen statement 
-- exception handled. 

>>>> if an exception occurs, which has not been handled by the programmer
then program execution gets terminated and a system generated error message
is shown to the user. 

--- 2 types of exception
1. Checked exception  ----all the excetions other than runtime
							check whether the programmer is handled the errors or not
2. Unchecked exception --- Runtime excetions are known an unchecked

*******
How to handle the exception programetically.
------------------------------------------------
1. Try-catch block
2. Nested Try catch
3. Checked and unchecked exceptions
4. Finally block
5. try-catch-finally block
6. finally block & return statement
7. Throw exceptions
8. throw keyword and clause
9. throw and throws

1. Try-catch block
----------------------
try{
	//java code
}catch(Exception e){
	//error handled cause by try block. 
}


**********************************
Nested try and catch

... 
//Main try block
 try{
	 statement1
	 statement2
	 //try-catch block inside another try block
	try{
		 statement3
		 statement4
		// try-catch block inside nested try block
		try{
			statement5
			statement6
		}catch (Exception e1){
			//Exception Message
		}
	catch (Exception e2){
			//Exception Message
		}
 catch (Exception e3){
			//Exception Message
		}
	 }
 }
 
 3. Finally block
 ====================
 -- A finally block contains all the crucial statements that must be executed whether 
 exeception occurs or not. 
 -- The statement presernt in this block will always execute regardless of whether execution
 occurs in try block or not as closing a connection. 
 
 syntax:
 ---------
 try{
	 //Statement that may cause an exception
 }catch(Exception e){
	 //handling exception
 }finally{
	 //statements to be executed
 }
 
 >>> Flow of control in try/catch/finally
 -----------------------------------------
