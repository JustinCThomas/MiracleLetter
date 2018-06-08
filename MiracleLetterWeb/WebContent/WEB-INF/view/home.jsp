<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/resources/css/reset.css" var="resetCSS"/>
<spring:url value="/resources/css/home.css" var="homeCSS"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="${resetCSS}"/>
<link type="text/css" rel="stylesheet" href="${homeCSS}"/>
<title>Miracle Letter</title>
</head>
<body>
<%@include file="header.jsp"%>
<div>Section 1</div>
<div>Section 2</div>
<div>Section 3</div>


<%@include file="footer.jsp"%>
</body>
</html>