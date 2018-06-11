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
	<form:form method="POST" action="/MiracleLetterWeb" modelAttribute="customer">
		<form:label path="email_address">Email</form:label> 
		<form:input path="email_address" type="text"/>
		
		
		<form:label path="password">Password</form:label>
		<form:input path="password" type="password"/>
		
		<input type="submit" value="Submit">
	
	</form:form>


</body>
</html>