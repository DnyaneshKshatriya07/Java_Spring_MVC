<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- Without the help of @ModelAttribute --> 
<%-- 	<h1>
		Username= ${name}
		<br>
		Email= ${email}
		<br>
		Password= ${password}
	</h1> --%>
	
	<!-- With the help of @ModelAttribute --> 
	<h1>
		Username= ${user.name}
		<br>
		Email= ${user.email}
		<br>
		Password= ${user.password}
	</h1>
	
	<hr>
	<h1>${tit}</h1>
	<p>${desc}</p>
</body>
</html>