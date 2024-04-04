package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	Connection miConexion=null;
	
	public Conexion() {
		
	}
	
	public Connection getConexion() {
		
		try {
			miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return miConexion;
		
	}
	
}
