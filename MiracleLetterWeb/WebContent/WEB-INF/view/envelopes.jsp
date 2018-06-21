<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/resources/css/reset.css" var="resetCSS"/>
<spring:url value="/resources/css/commonstyles.css" var="commonstylesCSS"/>
<spring:url value="/resources/css/envelopesstyles.css" var="envelopesstylesCSS"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="${resetCSS}"/>
<link type="text/css" rel="stylesheet" href="${commonstylesCSS}"/>
<link type="text/css" rel="stylesheet" href="${envelopesstylesCSS}"/>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="miracleletter.models.Envelope" %>
<%@page import="miracleletter.dao.EnvelopeDAO" %> 

<title>MiracleLetter - Envelopes</title>
</head>
<body>
<%
	EnvelopeDAO eDAO = new EnvelopeDAO();
	List<Envelope> envelopes = eDAO.getAllEnvelopes();
%>


<div class="content">

<%@include file="header.jsp"%>
<h1>Envelopes</h1>

<table>
	<tr>
		<th>Envelope</th>
		<th>Color</th>
		<th>Type</th>	
		<th>Price</th>	
	</tr>
	<tr>
		<td><div class="envelope white"></div></td>
		<%
			out.print("<td>" + envelopes.get(0).getEnvelope_color() + "</td>");
			out.print("<td>" + envelopes.get(0).getEnvelope_type() + "</td>");
			out.print("<td>$" + envelopes.get(0).getEnvelope_price() + "</td>");
		%>
	</tr>
	<tr>
		<td><div class="envelope white"><div class="window"></div></div></td>
		<%
			out.print("<td>" + envelopes.get(1).getEnvelope_color() + "</td>");
			out.print("<td>" + envelopes.get(1).getEnvelope_type() + "</td>");
			out.print("<td>$" + envelopes.get(1).getEnvelope_price() + "</td>");
		%>
	</tr>
	<tr>
		<td><div class="envelope blue"></div></td>
		<%
			out.print("<td>" + envelopes.get(2).getEnvelope_color() + "</td>");
			out.print("<td>" + envelopes.get(2).getEnvelope_type() + "</td>");
			out.print("<td>$" + envelopes.get(2).getEnvelope_price() + "</td>");
		%>
	</tr>
	<tr>
		<td><div class="envelope blue"><div class="window"></div></div></td>
		<%
			out.print("<td>" + envelopes.get(3).getEnvelope_color() + "</td>");
			out.print("<td>" + envelopes.get(3).getEnvelope_type() + "</td>");
			out.print("<td>$" + envelopes.get(3).getEnvelope_price() + "</td>");
		%>
	</tr>
	<tr>
		<td><div class="envelope red"></div></td>
		<%
			out.print("<td>" + envelopes.get(4).getEnvelope_color() + "</td>");
			out.print("<td>" + envelopes.get(4).getEnvelope_type() + "</td>");
			out.print("<td>$" + envelopes.get(4).getEnvelope_price() + "</td>");
		%>
	</tr>
	<tr>
		<td><div class="envelope red"><div class="window"></div></div></td>
		<%
			out.print("<td>" + envelopes.get(5).getEnvelope_color() + "</td>");
			out.print("<td>" + envelopes.get(5).getEnvelope_type() + "</td>");
			out.print("<td>$" + envelopes.get(5).getEnvelope_price() + "</td>");
		%>
	</tr>
<!-- 
<% 
	for (int i = 0; i < envelopes.size(); i++){
		out.print("<tr>");
		//out.print("<td>");
		out.print("<td id=\"envelope\" style=\"background-color:" +
			envelopes.get(i).getEnvelope_color() + "\"");
		
		if (i % 2 == 1) {
			out.print("<div id=\"window\"></div>");
		}
		
		out.print("</td>");
		//out.print("</td>");<
		out.print("<td>" + envelopes.get(i).getEnvelope_color() + "</td>");
		out.print("<td>" + envelopes.get(i).getEnvelope_type() + "</td>");
		out.print("<td>" + envelopes.get(i).getEnvelope_price() + "</td>");
		out.print("</tr>");
	}
%>
-->
</table>

</div>

<%@include file="footer.jsp"%>

</body>
</html>