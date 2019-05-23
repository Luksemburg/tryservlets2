<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Try</title>
</head>
<body>
	<h2><c:out value="${mes}" default="Default value: somnambula!"/></h2>
	<ul>	
		<c:forEach var="car" items="${cars}">		
			<li><c:out value="${car}" /></li>
		</c:forEach>
	</ul>		
	<ul>
		<c:forEach var="cook" items="${cookie}">
			<li>
				<p><c:out value="${cook.value.name}" /></p>
				<p><c:out value="${cook.value.value}" /></p>
			</li>
		</c:forEach>
	</ul>
	
	<c:if test="${isVisible == true}">
		<p>Visible</p>
	</c:if>
	<c:if test="${isVisible == false}">
		<p>Invisible</p>
	</c:if>
	
	<c:choose>
		<c:when test="${nominal == 1}">
			<p>Nominal eq. 1</p>
		</c:when>
		<c:when test="${nominal == 2}">
			<p>Nominal eq. 2</p>
		</c:when>
		<c:when test="${nominal == 3}">
			<p>Nominal eq. 3</p>
		</c:when>
		
		<c:otherwise>
			<c:redirect url="/notfound"/>
		</c:otherwise>
	</c:choose>
	
	<a href='<c:url value="/form.html" />'> = = = FORM = = = </a>
	
</body>
</html>