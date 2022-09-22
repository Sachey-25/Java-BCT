*****Spring Framework ***********
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
--- Spring Framework IOC and Beans  -- dealt with the beans
--- Spring JDBC --- Object for the db -- Config file
--- Spring ORM --- Object for the db  -- Config file
--- Spring Hibernate ---- Object for db -- Config file


*****Spring boot ***************
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
-- Spring boot is module of spring from which we speed up the development
-- Spring boot makes it easy to create stand-alone, production-grade spring based applications
		than you "just run"
-- It provides easier and faster way to set up, configure and run both simple 
		and web-based applications
-- No configuration at all 
-- Convention over configuration software design style
-- It decreases the effort of the developer
-- Opinionated default --- Automatically configure
-- Scan the class path and find the dependency it will automatically configure the things

Advantages
------------
1. It creates stand-alone spring applications that can be started using java-jar
2. Embed Tomcat, Jetey, or undertow directly (no need to deploy war file)
3. Provide opinionated starter dependencies and 3rd party libraries whenever possible.
4. Provide production-ready features such as metrics, health checks, abd externalized configuration
5. ABsolutely no code generation and no requiredment for XML configuration.


***********Programatic Configurations***********

-- Starter POM 
-- Spring-Boot-Starter-web
-- Spring-boot-starter-data-jpa


*****How to create spring boot project**********????

>> In order to create the project -- eclipse(spring starter project), spring initializr, STS IDE.

>> sts -- Application Interface.

JavaProjects -- Programming based practice
Maven  -- Spring based projects --- IOC, JDBC, ORM, Hibernate
SpringBoot -- Is an interface of spring framework -- JPA -- Jakarta EE -- API
1. Every project needs to be created with spring starter project.
2. Every spring boot project works on MVC design pattern 1. Model 2. View 3. controller

--- Controller who interacts with springboot application and the browser on relatively on a 
particular port. -- Controller resides in the embeded server Apache Tomcat on 8080 port by default.
3. Spring boot is most reliable on annotations.
4. Spring boot is also reliable on method approach.


********************Application Properties**********************************
-- Application configuration
1. This is a file which is preconfigured application to customize the application.
List properties that can be configured in application property.
-- Core properties
-- Data properties
-- Transaction properties
-- Server properties
-- Actuator properties
-- Devtools properties
-- Json properties 
-- web properties
-- Testing properties

-- Application yml



