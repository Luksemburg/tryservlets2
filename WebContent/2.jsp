<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	String header = "JSP Show Date";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP get info from servlet</title>
</head>
<body>
	<h2><%= header %></h2>
	<h2>Today <%= new java.util.Date() %></h2>
	
	<h2>Request Context: </h2>
	<h2>Surname: ${surname}</h2>
	<h2>Height: ${height}</h2>
	
	<h2>App Context: </h2>
	<h2>Car: ${car}</h2>
	<h2>Number: ${car_numb}</h2>
	
	<h2>Session Context: </h2>
	<h2>Plane: ${plane}</h2>
	<h2>Model: ${model}</h2>
</body>
</html>