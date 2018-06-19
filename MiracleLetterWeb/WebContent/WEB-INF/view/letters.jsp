<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/resources/css/reset.css" var="resetCSS"/>
<spring:url value="/resources/css/commonstyles.css" var="commonstylesCSS"/>
<spring:url value="/resources/css/lettersstyles.css" var="letterstylesCSS"/>
<spring:url value="/resources/images/oceantemplate.svg" var="ocean"/>
<spring:url value="/resources/images/skytemplate.svg" var="sky"/>
<spring:url value="/resources/images/fruitbaskettemplate.svg" var="fruitbasket"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="${resetCSS}"/>
<link type="text/css" rel="stylesheet" href="${commonstylesCSS}"/>
<link type="text/css" rel="stylesheet" href="${letterstylesCSS}"/>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="miracleletter.models.LetterTemplate" %>
<%@page import="miracleletter.dao.LetterTemplateDAO" %> 
<title>MiracleLetter - Letters</title>
</head>
<body>

<%
	LetterTemplateDAO lDAO = new LetterTemplateDAO();
	List<LetterTemplate> letters = lDAO.getAllLetterTemplates();
%>
<div class="content">

<%@include file="header.jsp"%>
<h1>Letters</h1>

<table>
	<tr>
		<th>Base Letter Design</th>
		<th>Template Name</th>
		<th>Template Description</th>	
		<th>Base Price</th>	
	</tr>
	<tr>
		<td><img src="${ocean}"/></td>
		<%
			out.print("<td>" + letters.get(0).getLetter_template_name() + "</td>");
			out.print("<td>" + letters.get(0).getLetter_template_description() + "</td>");
			out.print("<td>$" + letters.get(0).getLetter_template_base_price() + "</td>");
		%>
	</tr>
	<tr>
		<td><img src="${sky}"/></td>
		<%
			out.print("<td>" + letters.get(1).getLetter_template_name() + "</td>");
			out.print("<td>" + letters.get(1).getLetter_template_description() + "</td>");
			out.print("<td>$" + letters.get(1).getLetter_template_base_price() + "</td>");
		%>
	</tr>
	<tr>
		<td><img src="${fruitbasket}"/></td>
		<%
			out.print("<td>" + letters.get(2).getLetter_template_name() + "</td>");
			out.print("<td>" + letters.get(2).getLetter_template_description() + "</td>");
			out.print("<td>$" + letters.get(2).getLetter_template_base_price() + "</td>");
		%>
	</tr>


</table>

</div>

<%@include file="footer.jsp"%>

</body>
</html>