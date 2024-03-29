package hernandez.silvestre.colecciones;

import java.util.Objects;

public class Libro {
	
	public Libro(String autor, String titulo, int isbn) {
		this.autor = autor;
		this.titulo = titulo;
		this.isbn = isbn;
	}
	
	public String getDatos() {
		
		return "El titulo es: " + titulo +". El autor es: " + autor + ". Y el ISBN es: " + isbn;
	}
	
	/*public boolean equals(Object obj) {
		
		Libro otroLibro=(Libro)obj;
		
		if(obj instanceof Libro) {
			
			if(this.isbn==otroLibro.isbn) return true;
			
			else return false;
		}
		else return false;
		
	}*/
	
	

	private String autor;
	
	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return isbn == other.isbn;
	}

	private String titulo;
	
	private int isbn;
	
}
