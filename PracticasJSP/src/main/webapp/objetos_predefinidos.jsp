<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Objetos JSP predefinidos</h1>

Petici�n datos del navegador: <%=request.getHeader("User-Agent") %>

<br>

Petici�n idioma usuario: <%= request.getLocale() %>

</body>
</html>