<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/resources/css/headerstyles.css" var="headerstylesCSS"/>

<link type="text/css" rel="stylesheet" href="${headerstylesCSS}">

<%@page import="miracleletter.models.Customer" %>
<% String email_address = (String) session.getAttribute("email_address"); %>
<% String password = (String) session.getAttribute("password"); %>

<div id="header">

	<a id="ml" href="/MiracleLetterWeb">MiracleLetter</a>
	<% if (email_address != null) {
		out.print("<span id='email-display'>" + "Hello, you're logged in as " + email_address + "</span>");
	}
	%>
	<nav>
		<a href="letters">View Letter Templates</a>
		<a href="envelopes">View Envelopes</a>
		<a href="registration">Sign Up</a>
		<a href="login">Login</a>
		<a href="cart">(Cart Symbol)<span id="itemsInCart">0</span></a>
	</nav>
	

</div>