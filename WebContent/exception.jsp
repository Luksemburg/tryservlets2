<%
	String message = pageContext.getException().getMessage();
	String exception = pageContext.getException().getClass().toString();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset = "UTF-8"/>
		<title>Exception</title>
	</head>
	
	<body>
		<h1>Exception occured while processing the request!</h1>
		<h2>Details: </h2>
		<p>Type: <%= exception%></p>
		<p>Message: <%= message%></p>
		
		<form action="/RedirectServlet/setsession">
			<input type="submit" value="Set Session">
		</form>
		<br>
		<form action="/RedirectServlet/setcook">
			<input type="submit" value="Set Cookies">
		</form>
	</body>
</html>