package controles;

public class PeliculasDeTabla {

	public PeliculasDeTabla() {
	
	
	}

	
	public PeliculasDeTabla(String titulo, int año, double precio) {
		this.titulo = titulo;
		this.año = año;
		this.precio = precio;
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getAño() {
		return año;
	}


	public void setAño(int año) {
		this.año = año;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}



	private String titulo;
	private int año;
	private double precio;
	
}
