<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/resources/css/footerstyles.css" var="footerstylesCSS"/>

<link type="text/css" rel="stylesheet" href="${footerstylesCSS}">

<footer>
	<div id="link-container">
		<a href="about">About Us</a>
		<a href="contact">Contact Us</a>
		<a href="faq">FAQ</a>	
	</div>
</footer>