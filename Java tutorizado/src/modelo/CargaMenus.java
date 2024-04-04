package modelo;

import java.sql.*;

public class CargaMenus {

	public CargaMenus() {
		
		miConexion=new Conexion();
		
	}
	
	public ResultSet[] ejecutaConsultas() {
		
		Connection accesoBBDD=miConexion.getConexion();
		
		ResultSet resSec=null;
		
		ResultSet resPaises=null;
		
		try {
			
			Statement secciones=accesoBBDD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			resSec=secciones.executeQuery("SELECT DISTINCTROW SECCION FROM PRODUCTOS");
		
			Statement paises=accesoBBDD.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			resPaises=paises.executeQuery("SELECT DISTINCTROW PAISDEORIGEN FROM PRODUCTOS");
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		resultadosConsultas=new ResultSet[2];
		
		resultadosConsultas[0]=resSec;
		
		resultadosConsultas[1]=resPaises;
	
		return resultadosConsultas;
	
	}
	
	private Conexion miConexion;
	
	private ResultSet resultadosConsultas[];
}
