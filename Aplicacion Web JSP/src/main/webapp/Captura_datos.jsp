<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import="java.sql.*" %>
<%@ page import="org.apache.commons.codec.digest.*" %>

	<%
	
		String nombre=request.getParameter("nombre");
	
		String apellido=request.getParameter("apellido");
			
		String usuario=request.getParameter("usuario");
		
		String contra=request.getParameter("contra");
	
		String contraEnc=DigestUtils.md5Hex("contra");
		
		String pais=request.getParameter("pais");
		
		String tecno=request.getParameter("tecnologias");
		
		Class.forName("com.mysql.jdbc.Driver");
		
		try{
		
			Connection miConexion=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_web_jsp","root","");
			
			// Comprobar si existe USuario-------------------------------------
			
			PreparedStatement miPr=miConexion.prepareStatement("SELECT * FROM USUARIOS WHERE USUARIO=?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			miPr.setString(1, usuario);
			
			ResultSet miRs=miPr.executeQuery();
			
			if(miRs.absolute(1)) out.println("Ya existe el usuario");
			
			else{
			//---------------------------------------------------------------
			
				Statement miSt=miConexion.createStatement();
				
				String insSql="INSERT INTO USUARIOS (NOmbre, Apellido, Usuario, Contrasena, Pais, Tecnologia) VALUES('" + nombre + "','" + apellido + "','" + usuario + "','" + contraEnc + "','" + pais + "','" + tecno + "')";
			
				miSt.executeUpdate(insSql);
				
				out.println("Usuairo registarado con éxito!!");
			}	
		}catch(Exception e){
			
			e.printStackTrace();
		}
	%>
</body>
</html>