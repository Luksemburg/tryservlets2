<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Products</title>
</head>
<body>
	<p><a href='<c:url value="/CreateProd"/>'>Create new product</a></p>
	<table>
		<tr><th>Name</th><th>Price</th><th></th></tr>
		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.name}</td>
				<td>${product.price}</td>
				<td>
					<a href='<c:url value="/EditProd?id=${product.id}"/>'>Edit</a>
					<form method="POST" action='<c:url value="/DeleteProd"/>' style="display:inline;">
						<input type="hidden" name="id" value="${product.id}">
						<input type="submit" value="Delete">
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>