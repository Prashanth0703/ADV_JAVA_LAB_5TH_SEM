<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Welcome!!</title>
	</head>
	<body>
		<%
			String username = (String) session.getAttribute("username");
			String password = (String) session.getAttribute("password");
			
			if (username.equals("guest1") && password.equals("guest1rit")) {
		
			out.println("<h1>Welcome "+ username +"</h1>");
		 } 
			else {
		
				out.println("<h1> Username or Password is incorrect!!</h1>");
		} %>
	</body>
</html>