<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page import="java.util.*, java.sql.*, hdz.silvestre.usuarios.*" %>

<%

	ArrayList<Usuario> datosUsuarios=new ArrayList<>();

	Class.forName("com.mysql.jdbc.Driver");

	try{
		
		Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_web_jsp", "root", "");
		
		Statement miSt=miConexion.createStatement();
		
		String miSql="SELECT * FROM USUARIOS";
		
		ResultSet miRs=miSt.executeQuery(miSql);
		
		while(miRs.next()){
			
			datosUsuarios.add(new Usuario(miRs.getString(2), miRs.getString(3), miRs.getString(4), miRs.getString(6), miRs.getDouble(8)));
			
		}
		
		miRs.close();
		
		miConexion.close();
		
	}catch(Exception e){
		
		out.println("Ha ocurrido un error en la conexión con la BBDD");
		
	}
	
	pageContext.setAttribute("losUsuarios", datosUsuarios);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
	
	<tr style="font-weight:bold"><td>Nombre:</td><td>Apellido</td><td>Usuario</td><td>Pais</td><td>Localización</td><td>Salario</td><td>Tipo de Salario</td></tr>
	
	<c:forEach var="UsuTemp" items="${losUsuarios}">
	
	<tr>
		<td>${UsuTemp.nombre}</td>	<td>${UsuTemp.apellido}</td>	<td>${UsuTemp.usuario}</td>	<td>${UsuTemp.pais}</td>
		<td>
			<c:if test="${UsuTemp.pais.equals('España')}">Nacional</c:if>
			
			<c:if test="${!UsuTemp.pais.equals('España')}">Internacional</c:if>
		</td>
		<td>${UsuTemp.salario}</td>
		<td>
		
		<c:choose>
		
			<c:when test="${UsuTemp.salario>1800 }">Salario Alto</c:when>
		
			<c:when test="${UsuTemp.salario>1100 }">Salario Medio</c:when>
			
			<c:otherwise>Salario bajo</c:otherwise>
		</c:choose>
		
		</td>
	</tr>
	</c:forEach>
	</table>

</body>
</html>