<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@page isELIgnored="false" %> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
</head>
<body>

	<h1>This is home page</h1>
	<h1>Called by home controller</h1>
	<h1>url /home</h1>
	
	
	<%
		String name= (String)request.getAttribute("name");
		Integer id= (Integer)request.getAttribute("id");
		List<String> friends=(List<String>) request.getAttribute("f");
	%>
	
	<h1>Name is <%= name%></h1>
	<h1>Id is <%= id%></h1>
	
	<!-- Without the help of expresion language -->
	<%-- <h1>
		Friends are:- 
		<%
			for(String s:friends){
				out.println(s);
			}
		%>
	</h1> --%>
	<!-- With the help of expresion language -->
	<c:forEach var="item" items="${f}">
		<h1>${item}</h1>
	</c:forEach>
</body>
</html>