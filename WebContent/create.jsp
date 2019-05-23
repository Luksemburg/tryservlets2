<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create product</title>
</head>
<body>
	<h3>New Product</h3>
	<form method="post">
		<label>Name</label><br>
		<input name="name"/><br><br>
		<label>Price</label>
		<input name="price" type="number" min="100"/><br><br>
		<input type="submit" value="Save"/>
	</form>
</body>
</html>