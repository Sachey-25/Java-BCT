Java Serialization
--------------------
-- Serialization is the mechanism to convert an object into stream of bytes
so that it can be written into a file, tranporated through a network or stored into database. 

-- De-serialization is rebuilding the object from stream of bite.



Java ENUM
-----------
JAVA 8 and its features
----------------------------------------------------------------------------------------------
-- There are several new features introduced in Java 8
1. Java Lambda Expressions
***********************************************************************************************
-- Lambda Expression is an anonymous functions/method. A function that doesn't have
a name and doesn't belong to any class. 

Syntax:
----------
(parameter_list) -> { functionBody   }

>> Lambda expression vs concrete method
-- A concrete method (regular method) -- name, Parameter list, Body, return type
-- A lambada method -- No name, parameter list, Body, No-return type. 
***********************************************************************************
Lambda helps to reduce the lines codes where more optimestic or productive
***********************************************************************************

>> Uses of Lambda method
1. To use lambda expression, you need to either create your own functional interface or
use the pre-defined interface provided by java.

-- An interface with only single(one) abstract method is called functional interface. 

*********************************************************************************************


2. Java Method interfaces

1. -- Method reference to an instance method of an object - Object::instanceMethod
2. -- Method reference to a static method of a class -- Class::staticMethod
3. -- Method reference to an instance method of an arbitrary object of a particular type - 
		Class::intanceMethod
4. -- Method reference to a constructor - Class::new


3. Java Functional interfaces

--An interface with only single abstract method is called functional interface. 
since functional interfaces has single abdtract method thats the reason we call them SAM
Single abstract method interface.

Rules
-----
--> The functional interface should have Only one abstract method, along the one abstract method.
they can have any number of default and static methods. 


4. Java Stream
-- java.util.stream -- package 
-- By usoing the stream we can perform varios aggregation operations on the data returned from 
the collections, arrays. Input/Output operations. 


Without Java Streams -- Collections :-- Example


5. Java Stream filters

-- 

6. Java interfaces changes -- default and static methods

8. Java String Collectors 

9. Java StringJoiners

7. Java forEach || Method.
--> ForEach is also considered to be loop ---> 
--> Collections and Streams. 
1. forEach() 
2. forEachOrdered() ---> methods to loop a particular collection and stream. 

10. Java Optional Classes

---> This class is introduced to avoid NullPointerException, that we frequrntly encounter if we 
do not perform null checks in our code. 
---> Using this class we can easily check whether a variable has null value or 
not. and by doing this we can avoid the nullPointerException. 


11. Java Array Parrell sort
