<%@ page import = "hernandez.silvestre.calculosmatematicos.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Ejemplos de expresiones</h1>

Convirtiendo a mayúscilas: <%= new String("silver").toUpperCase() %>

<br>

La suma de 6 y  2: <%= 6 + 2 %>

<br>

30 es mayor que 300: <%= 30>300 %>
<br>

<h1>Ejemplos de scriptlets</h1>

<%

	for(int i=0;i<10;i++){
		
		out.println("Vuelta de bucle n°: " + i + "<br>");
		
	}

%>

<h1>Declaraciones</h1>

La suma de 5 + 5 es: <%= CalculosM.suma(5, 5) %>
<br>
la resta es: <%= CalculosM.resta(5, 5) %>
<br>
La miltiplicación es: <%= CalculosM.multiplica(5, 5) %>
</body>
</html>