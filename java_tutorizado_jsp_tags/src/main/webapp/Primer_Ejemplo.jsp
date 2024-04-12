<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
	
	String empleados[]={"Manuel","Ana","Sandra","Juan"};

	pageContext.setAttribute("misEmpleados", empleados);	

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:forEach var="tempEmpleados" items="$misEmpleados">
	
		${tempEmpleados }<br>
		
	</c:forEach>

</body>
</html>