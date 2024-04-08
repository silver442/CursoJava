package palmacenados;

import java.sql.*;

import javax.swing.JOptionPane;

public class ActualizaProductos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String miPrecio=JOptionPane.showInputDialog("Introduce el precio del producto");
		
		String miArticulo=JOptionPane.showInputDialog("Introduce el nombre del articulo");
		
		try {
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
		
			CallableStatement miStatement=miConexion.prepareCall("{call ACTUALIZA_ARTICULO(?, ?)}");
		
			miStatement.setString(1, miPrecio);
			
			miStatement.setString(2, miArticulo);

			miStatement.execute();
			
			System.out.println("Actualizaciion OK");
			
			miConexion.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
