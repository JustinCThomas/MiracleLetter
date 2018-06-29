# Case Study: MiracleLetter
Case Study Project for PerScholas/Cognizant Java Developer Program

MiracleLetter is a website that allows users to customize a letter, choose an envelope and send the letter to an address that they provide.

## Requirements for running project locally
* Java 8 SDK & JRE
* Eclipse IDE
* Oracle 12c Database
* JUnit 4
* Oracle JDBC library (JAR file)
* Hamcrest Library (JAR file)

## Setting Up Database
1.	Upon launching Oracle SQL, run the CreateMiracleLetterTables.sql file to populate the database with the necessary tables and some starter data for testing purposes.
2.	The db.properties file in the miracleletter.resources package needs to be changed to have your own username and password.

## Test Cases
After opening the project in Eclipse, the test cases can be found in the test folder in the miracleletter.dao.testcases package.
JUnit 4 must be properly configured in order to run the test cases.
The test cases make use of Oracle JDBC and Hamcrest, so they too must be downloaded.

## Bugs
* Adding to cart displays Null.
* Design page can be accessed without being logged in.

## Incomplete
* Contact Us form data is not being used by the backend.
* User cannot place an order.
* Login and Sign Up page need more styling.
* Once logged in, login and sign up options should be missing and replaced with a log out option.
* Taking a picture of customized letter by clicking a button.
* Sending said picture to the server upon creation.

## Built With
* Java 8 - OO Programming Language
* Spring MVC - Java Framework for Full Stack Apps
* JSP - Java Server Pages
* Maven - Dependency Management for Java
* JUnit 4 - Runs Test Cases for Java projects
* [SVG Editor](http://editor.method.ac/) - For making one of the letter templates

## User Stories
1.	As a user I can sign up.
2.	As a user I can login.
3.	As a user I can logout. (Next Sprint)
4.	As a user I can delete my account. (Next Sprint) 
5.	As a user I can change my password. (Next Sprint)
6.	As a user I can customize a letter.
7.	As a user I can add a customized letter and chosen envelope to cart. (Next Sprint)
8.	As a user I can place an order. (Next Sprint)
9.	As a user I can see previously placed orders and their details. (Next Sprint)
10.	As a user I can delete an order. (Next Sprint)


## Author
* **Justin Thomas**
