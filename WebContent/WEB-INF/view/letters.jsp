<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/resources/css/reset.css" var="resetCSS"/>
<spring:url value="/resources/css/commonstyles.css" var="commonstylesCSS"/>
<spring:url value="/resources/css/lettersstyles.css" var="letterstylesCSS"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="${resetCSS}"/>
<link type="text/css" rel="stylesheet" href="${commonstylesCSS}"/>
<link type="text/css" rel="stylesheet" href="${letterstylesCSS}"/>
<title>MiracleLetter - Letters</title>
</head>
<body>

<%@include file="header.jsp"%>
<h1>Letters</h1>

<table>
	<tr>
		<th>Color</th>
		<th>Type</th>	
		<th>Price</th>	
	</tr>
	<tr>
		<td>White</td>
		<td>White</td>
		<td>White</td>
	</tr>
	<tr>
		<td>Blue</td>
		<td>Blue</td>
		<td>Blue</td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<td></td>
		<td></td>
		<td></td>
	</tr>


</table>
<%@include file="footer.jsp"%>

</body>
</html>