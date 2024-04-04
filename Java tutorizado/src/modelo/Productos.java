package modelo;

public class Productos {

	
	public Productos() {
		
		nomArticulo="";
		
		seccion="";
		
		precio="";
		
		fecha="";
		
		paisOrigen="";
	
	}
	
	public String getNomArticulo() {
		return nomArticulo;
	}

	public void setNomArticulo(String nomArticulo) {
		this.nomArticulo = nomArticulo;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}



	private String nomArticulo;
	
	private String seccion;
	
	private String precio;
	
	private String fecha;
	
	private String paisOrigen;
	
}
