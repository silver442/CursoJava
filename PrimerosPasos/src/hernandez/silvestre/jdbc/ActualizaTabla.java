package hernandez.silvestre.jdbc;

import java.sql.*;

public class ActualizaTabla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
			
			// 1. CREAR CONEXIÓN
			
			Connection miCon=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpedidos", "root", "");
		
			// 2. CREAR STATEMENT
			
			Statement miSt=miCon.createStatement();
			
			// 3. CREAR INSTRUCCIÓN SQL
			
			//String inSQL="INSERT INTO PRODUCTOS (CODIGOARTICULO, NOMBREARTICULO, PRECIO) VALUES ('AR45','CAMISA FLORES',50)";
			
			//String inSQL="UPDATE PRODUCTOS SET PRECIO=70 WHERE CODIGOARTICULO='AR45'";
			
			String inSQL="DELETE FROM PRODUCTOS WHERE CODIGOARTICULO='AR45'";
			
			
			// 4. Ejecutar SQL
			
			miSt.executeUpdate(inSQL);
			
			System.out.println("Registro MODIFICADO correctamente");
			
			miCon.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
