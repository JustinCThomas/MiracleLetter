<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/resources/css/reset.css" var="resetCSS"/>
<spring:url value="/resources/css/commonstyles.css" var="commonstylesCSS"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="${resetCSS}"/>
<link type="text/css" rel="stylesheet" href="${commonstylesCSS}"/>
<%@page import="java.util.List" %>
<% List<String> template_choice = (List<String>) session.getAttribute("template_choice"); %>
<title>MiracleLetter Shopping Cart</title>
</head>
<body>

<div class="content">
<%@include file="header.jsp"%>

<h2>You have <%=template_choice %> items in cart</h2>


</div>

<%@include file="footer.jsp"%>

</body>
</html>