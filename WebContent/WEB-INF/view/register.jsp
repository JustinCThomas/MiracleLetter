<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<spring:url value="/resources/css/reset.css" var="resetCSS"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="${resetCSS}"/>
<title>MiracleLetter Registration</title>
</head>
<body>
	${emailInUse}
	<h1>Create new account</h1>
  	<form method="POST" action="processregistration">
		<label for="email_address">Email</label> 
		<input name="email_address" type="text" minlength="8" required/>
		
		<label for="password">Password</label>
		<input name="password" type="password" minlength="8" required/>
		
		<input type="submit" value="Submit">
	
	</form>

	<p>Already have an account?</p>
	<a href="login">Sign in here!</a>
</body>
</html>