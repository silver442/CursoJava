package modelo;

public class EjecutaConsultas {

	public String consultaBBDD(String seccion, String pais) {
		
		seleccion="";
		
		if(!seccion.equals("Todas") && pais.equals("Todos")) {
			
			seleccion="Has escogido una sección";
		
		}else if(seccion.equals("Todas") && !pais.equals("Todos")) {
			
			seleccion="Has escogido un pías";
		}else {
			
			seleccion="Has escogido ambas";
		}
		
		return seleccion;
		
	}
	
	
	
	private String seleccion;
	
}
