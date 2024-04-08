package palmacenados;

import java.sql.*;

public class ConsultaProductos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
		
			CallableStatement miStatement=miConexion.prepareCall("{call MUESTRADEPORTES}");
		
			ResultSet rs=miStatement.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getString(2)+" "+ rs.getString(3)+" "+ rs.getString(4));
			}
			
			rs.close();
			
			miConexion.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
