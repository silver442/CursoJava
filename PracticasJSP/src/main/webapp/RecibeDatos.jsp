<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<h1 style="text-align:center">Datos de Usuario</h1>

Nombre de usuario: <%=request.getParameter("nombre") %><br/><br>

Apellido de usuario: <%=request.getParameter("apellido") %>


</body>
</html>