<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%  pageContext.setAttribute("some_str", "PAGE STRING");
	request.setAttribute("some_str", "REQUEST STRING");
%>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Try EL</title>
<style type="text/css">
	.block1{
		width: 200px;
		background: #fc0;
		padding: 5px;
		border: solid 2px black;
		float: left;
		position: realtive;
		top: 40px;
		left: -70px;
	}
</style>
</head>
<body>
	<h3>Output: ${requestScope.some_str}</h3>
	<h3>Output: ${pageScope.some_str}</h3>
	<br>
	<h3>First: ${arr[0]}</h3>
	<h3>Second: ${arr[1]}</h3>
	<h3>Third: ${arr[2]}</h3>
	<br>
	<div class = block1>
		<h3>Nick: ${person.nick}</h3>
		<h3>Foot: ${person.footsize}</h3>
		<h3>Guest: ${param.guest}</h3>
	</div>
		
</body>
</html>