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
<title>MiracleLetter Login</title>
</head>
<body>
	<h1>Sign in</h1>
	${errorMessage}
	<form method="POST" action="processlogin">
		<label for="email_address">Email</label> 
		<input type="text" name="email_address" required/>
		
		<label for="password">Password</label>
		<input type="password" name="password" required/>
		
		<input type="submit" name="submit" value="Submit">
	</form>
	<p>Don't have an account yet?</p>
	<a href="registration">Sign up here!</a>
</body>
</html>