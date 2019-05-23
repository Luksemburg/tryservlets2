<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Phones</title>
</head>
<body>
	<h3>Name: ${param.name}</h3>
	<h3>Phone 1: ${paramValues.phone[0]}</h3>
	<h3>Phone 2: ${paramValues.phone[1]}</h3>
	<h3>Cookies: ${cookie.fat.value}</h3>
	<h3>User-Agent: ${header["User-Agent"]}</h3>
	<h3>Host: ${header.host}</h3>
	<!--  <h3>Phone 3: ${paramValues.phone[2]}</h3> -->
</body>
</html>