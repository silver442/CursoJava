package hernandez.silvestre.jdbc;

import java.sql.*;

public class ConectaGestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			// 1. CREAR CONEXIÓN
			
			Connection miCon=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpedidos", "root", "");
		
			// 2. CREAR STATEMENT
			
			Statement miSt=miCon.createStatement();
			
			// 3. EJECUTAR INSTRUCCIÓN SQL
		
			ResultSet miRs=miSt.executeQuery("SELECT * FROM PRODUCTOS");
			
			// 4. LEER EL RESULSET
			
			while(miRs.next()) {
				
				System.out.println(miRs.getString(1) + " " + miRs.getString(3));
				 	
			}
			
			miRs.close(); // cerrar Resultset
			
			miCon.close(); // cerrar la conexión
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
