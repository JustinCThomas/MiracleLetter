<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/resources/css/reset.css" var="resetCSS"/>
<spring:url value="/resources/css/commonstyles.css" var="commonstylesCSS"/>
<spring:url value="/resources/css/designstyles.css" var="designstylesCSS"/>
<spring:url value="/resources/js/design.js" var="designJS"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="${resetCSS}"/>
<link type="text/css" rel="stylesheet" href="${commonstylesCSS}"/>
<link type="text/css" rel="stylesheet" href="${designstylesCSS}"/>
<title>MiracleLetter - Design</title>
</head>
<body>

<div class="content">
<%@include file="header.jsp"%>

<h1>Design</h1>

<h3>Base Template</h3>
<select name="template-choice">
	<option disabled selected hidden>Choose a letter design</option>
	<option value="ocean">Ocean</option>
	<option value="fruitbasket">Fruit Basket</option>
	<option value="sky">Sky</option>
</select>

<div id="base-letter">
</div>

</div>

<%@include file="footer.jsp"%>
<script src="${designJS}"></script>
</body>
</html>