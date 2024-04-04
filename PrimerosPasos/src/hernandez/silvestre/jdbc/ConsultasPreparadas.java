package hernandez.silvestre.jdbc;

import java.sql.*;

public class ConsultasPreparadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
			
			// 1. CREAR CONEXIÓN
			
			Connection miCon=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionpedidos", "root", "");
		
			// 2. CREAR STATEMENT
			
			//Statement miSt=miCon.createStatement();
			
			String sentencia="SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM PRODUCTOS"+
			" WHERE SECCION=? AND PAISDEORIGEN=?";
			
			PreparedStatement miPSt=miCon.prepareStatement(sentencia);
			
			miPSt.setString(1, "confección");
			
			miPSt.setString(2, "España");
			
			// 3. EJECUTAR INSTRUCCIÓN SQL
		
			ResultSet miRs=miPSt.executeQuery();
			
			// 4. LEER EL RESULSET
			
			while(miRs.next()) {
				
				System.out.println(miRs.getString(1) + " "+ miRs.getString(2)+ " " + miRs.getString(3) + " " + miRs.getString(4));
				 	
			}
			
			miRs.close(); // cerrar Resultset
			
			// REUTILIZACIÓN DE CONSULTA PREPARADA
			
			System.out.println();
			System.out.println();
			
			miPSt.setString(1, "deportes");
			
			miPSt.setString(2, "usa");
			
			ResultSet miRs2=miPSt.executeQuery();
			
			while(miRs2.next()) {
				
				System.out.println(miRs2.getString(1) + " "+ miRs2.getString(2)+ " " + miRs2.getString(3) + " " + miRs2.getString(4));
				 	
			}
			
			miCon.close(); // cerrar la conexión
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
