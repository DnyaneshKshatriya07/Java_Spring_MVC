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

	<%
		/* Without the help of expresion language */
		//String name= (String)request.getAttribute("name");
	
		//Integer roll= (Integer)request.getAttribute("rollnumber");
	%>
	
	<!-- With the help of expresion language -->
	<%-- <h1>Name is <%= name%></h1> --%>
	<h1>Name is ${name}</h1>
	
	<%-- <h1>Id is <%= roll%></h1> --%>
	<h1>Id is ${rollnumber}</h1>
</body>
</html>