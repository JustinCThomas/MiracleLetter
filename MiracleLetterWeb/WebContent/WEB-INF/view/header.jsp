<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/resources/css/headerstyles.css" var="headerstylesCSS"/>

<link type="text/css" rel="stylesheet" href="${headerstylesCSS}">

<% String email_address = (String) session.getAttribute("email_address"); %>

<div id="header">

	<a id="ml" href="/MiracleLetterWeb">MiracleLetter</a>
	<% if (email_address != null) {
		out.print("<span id='email-display'>" + "Hello, you're logged in as " + email_address + "</span>");
	}
	%>
	${errorMessage}
	${registerSuccess}
	<nav>
		<a href="letters">View Letter Templates</a>
		<a href="envelopes">View Envelopes</a>
		<a href="design">Design</a>
		<a href="buy">Buy</a>
		<a href="registration">Sign Up</a>
		<a href="login">Login</a>
		<a href="cart">(Cart Symbol)<span id="itemsInCart"></span></a>
	</nav>
	

</div>