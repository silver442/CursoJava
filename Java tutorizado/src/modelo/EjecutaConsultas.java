package modelo;

import java.sql.*;

public class EjecutaConsultas {

	
	public EjecutaConsultas() {
		
		miConexion=new Conexion();
	}

	public ResultSet consultaBBDD(String seccion, String pais) {
		
		Connection conecta=miConexion.getConexion();
		
		rs=null;
		
		try {
			if(!seccion.equals("Todas") && pais.equals("Todos")) {
				
				enviConsSeccion=conecta.prepareStatement(CONSULTASECCION);
			
				enviConsSeccion.setString(1, seccion);
				
				rs=enviConsSeccion.executeQuery();
				
			}else if(seccion.equals("Todas") && !pais.equals("Todos")) {
				
				enviConsSeccion=conecta.prepareStatement(CONSULTAPAIS);
				
				enviConsSeccion.setString(1, pais);
				
				rs=enviConsSeccion.executeQuery();
				
				//seleccion="Has escogido un pías";
			}else {
				
				enviConsSeccion=conecta.prepareStatement(CONSULTAPAISSECCION);
				
				enviConsSeccion.setString(1, pais);
				
				enviConsSeccion.setString(2, seccion);	
				
				rs=enviConsSeccion.executeQuery();
				//seleccion="Has escogido ambas";
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return rs;
		
	}
	
	
	
	private Conexion miConexion;
	
	private ResultSet rs;
	
	private PreparedStatement enviConsSeccion;
	
	private final String CONSULTASECCION="SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM PRODUCTOS WHERE SECCION=?";

	private final String CONSULTAPAIS="SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM PRODUCTOS WHERE PAISDEORIGEN=?";

	private final String CONSULTAPAISSECCION="SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM PRODUCTOS WHERE PAISDEORIGEN=? AND SECCION=?";

}
