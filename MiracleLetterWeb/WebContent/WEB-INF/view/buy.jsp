<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/resources/css/reset.css" var="resetCSS"/>
<spring:url value="/resources/css/commonstyles.css" var="commonstylesCSS"/>
<spring:url value="/resources/css/buystyles.css" var="buystylesCSS"/>
<spring:url value="/resources/js/buyletter.js" var="buyletterJS"/>
<spring:url value="/resources/js/buyenvelope.js" var="buyenvelopeJS"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="${resetCSS}"/>
<link type="text/css" rel="stylesheet" href="${commonstylesCSS}"/>
<link type="text/css" rel="stylesheet" href="${buystylesCSS}"/>
<title>MiracleLetter - Buy a Letter and an Envelope</title>
</head>
<body>

<div class="content">
<%@include file="header.jsp"%>

<h1>Buy a letter</h1>

<form action="cart" method="POST">
<div id="letter-option">
	<select name="template-choice">
		<option disabled selected hidden>Choose a letter design</option>
		<option value="ocean">Ocean</option>
		<option value="fruitbasket">Fruit Basket</option>
		<option value="sky">Sky</option>
	</select>
</div>

<div id="envelope-option">
	<select name="envelope-type">
		<option disabled selected hidden>Choose an envelope</option>
		<option value="white">White</option>
		<option value="white-window">White Window</option>
		<option value="blue">Blue</option>
		<option value="blue-window">Blue Window</option>
		<option value="red">Red</option>
		<option value="red-window">Red Window</option>
	</select>
</div>

<br />

<div id="base-letter"></div>


<div id="base-envelope"></div>

<br />
<input type="submit" name="submit" value="Add to Cart"/>
</form>

</div>


<%@include file="footer.jsp"%>
<script src="${buyletterJS}"></script>
<script src="${buyenvelopeJS}"></script>
</body>
</html>