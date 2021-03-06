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
<title>MiracleLetter FAQ (Frequently Asked Questions)</title>
</head>
<body>

<div class="content">
<%@include file="header.jsp"%>

<ol>
	<li>How long does it take for mail to arrive? Mail arrives within 3 to 5 business days.</li>
	<li>Do you ship internationally? Unfortunately, we only ship within the USA and Canada.</li>
	<li>Can I order same day delivery? No.</li>
	<li>How long have you been in business? For as long as the internet has been around. We are veterans.</li>
</ol>


</div>

<%@include file="footer.jsp"%>

</body>
</html>