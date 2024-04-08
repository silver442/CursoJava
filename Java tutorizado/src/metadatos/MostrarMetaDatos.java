package metadatos;

import java.sql.*;

public class MostrarMetaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mostrarInfoBBDD();		
	}

	static public void mostrarInfoBBDD() {
		
		Connection miConexion=null;
		
		try {
			miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
		
			// Obtencion de MetaDatos
			
			DatabaseMetaData misDatos=miConexion.getMetaData();
			
			// Mostrar info de la BBDD 
			
			System.out.println("Nombre del gestor: "+ misDatos.getDatabaseProductName());
			
			System.out.println("Versión del gestor: "+ misDatos.getDatabaseProductVersion());
			
			System.out.println("Nombre del driver: "+ misDatos.getDriverName());
			
			System.out.println("Versión del driver: "+ misDatos.getDriverVersion());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				miConexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}


