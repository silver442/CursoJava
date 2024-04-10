<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<%@ page import="java.sql.*" %>

	<%

		String usuario=request.getParameter("usuario");
		
		String contra=request.getParameter("contra");
		
		Class.forName("com.mysql.jdbc.Driver");
		
		try{
		
			Connection miConexion=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_web_jsp","root","");
			
			PreparedStatement miPr=miConexion.prepareStatement("SELECT * FROM USUARIOS WHERE USUARIO=? AND CONTRASENA=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			miPr.setString(1, usuario);
			
			miPr.setString(2, contra);
			
			ResultSet miRs=miPr.executeQuery();
			
			if(miRs.absolute(1)) out.println("Login correcto");
			
			else out.println("No existen usuarios con esos datos");
			
		}catch(Exception e){
			
			 out.write("Error al ejecutar la consulta: " + e.getMessage());
			
			e.printStackTrace();
		}
	%>
</body>
</html>