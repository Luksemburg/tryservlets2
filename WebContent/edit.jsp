<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit product</title>
</head>
<body>
	<h3>Edit product</h3>
	<form method="post">
		<input type="hidden" value="${product.id}" name="id" />
		<label>Name</label><br>
		<input name="name" value="${product.name}" /><br><br>
		<label>Price</label><br>
		<input name="price" value="${product.price}" type="number" min="100" /><br><br>
		<input type="submit" value="Send" />
	</form>
</body>
</html>