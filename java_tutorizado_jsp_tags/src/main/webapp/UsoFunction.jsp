<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="datosPersona" value="Maria, López, Perú, Java, 1900"/>

<c:set var="arrayPersonas" value="${fn:split(datosPersona, ',')}"/>

<input type="text" value="${arrayPersonas[0]}">
<input type="text" value="${arrayPersonas[1]}">
<input type="text" value="${arrayPersonas[2]}">
<input type="text" value="${arrayPersonas[3]}">
<input type="text" value="${arrayPersonas[4]}">
</body>
</html>