<%-- Comments --%>
<%@ page import="java.util.Date" %>
<%@ page import="redirect.servlet.src.SessData" %>
<%
	String[] users = {"Anna", "Dasha", "Kolya", "Sasha"};
	String header = "User List: ";
	int base = 3475;
	int exp = 3;
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset = "UTF-8"/>
		<title>Lambs</title>
	</head>
	
	<body>
		<jsp:include page="header.html" />
		<h3>2 + 2 = <%= 2 + 2 %></h3>
		<h3>5 < 3 = <%= 5 < 3 %></h3>
		<h3>1789 * 17343 = <%= 1789 * 17343 %></h3>
		<h3><%= new String("Hello").toUpperCase() %></h3>
		<h3>Today <%= new Date() %></h3>
		<h3>
			<ul>
				<%
						for(int i = 1; i < 6; i++){
							out.println("<li>" + i + "-th ...lamb</li>");
						}
				%>
			</ul>
		</h3>
		
		<h2><%= header %></h2>
		<h3>
			<ul>
				<% 
					for(String u: users){
						out.println("<li>" + u + "</li>");
					}
				%>
			</ul>		
		</h3>
		
		<h3>
			<ul>
				<%
					for(int i = 1; i < 6; i++){
						out.println("<li>" + i + " ==> " + square(i) + "</li>");
					}
				%>
			</ul>
		</h3>
		
		<h3>
			<% out.println("Radical " + base + " exp " + exp + " = " + SessData.radical(base, exp)); %>
		</h3>
		
		<h3>Name:	<%= request.getParameter("name") %>	</h3>		
		<h3>Age: <%= request.getParameter("age") %></h3>
		<h3>Country: <%= request.getParameter("country") %></h3>
		<h3>Gender: ${param.gender}</h3>
		<h3>Selected courses: </h3>
		<ul>
			<%
				String[] courses = request.getParameterValues("courses");
				for(String s: courses){
					out.println("<li>" + s + "</li>");
				}
			%>
		</ul>
		
		<jsp:include page="footer.jsp" />
	</body>
</html>
<%!
	int square(int x){
		return x * x;
	}
%>