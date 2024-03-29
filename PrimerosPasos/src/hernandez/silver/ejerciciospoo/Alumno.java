package hernandez.silver.ejerciciospoo;

public class Alumno {

	public Alumno(Colegio nombreColegio, String nombreAlumno, double notaMedia) {
		
		this.nombreAlumno=nombreAlumno;
		
		this.nombreColegio=nombreColegio;
		
		this.notaMedia=notaMedia;
		
		nAlumno=numeroAlumno;
		
		numeroAlumno++;
		
	}
	
	//Metodo setter
	
	public void setNotaMedia(double notaMedia) {
		
		this.notaMedia=notaMedia;
	}
	
	// Metodos getter

	
	public String toString() {
		
		return "Nombre Alumno: "+nombreAlumno + "\nColegio: "
		+this.getNombreColegioAlumno() + "\nN° Alunmo: "+nAlumno + 
		"\nNota Media: "+notaMedia;
	}
	
	private String getNombreColegioAlumno() {
		
		return this.nombreColegio.getNombreColegio();
	}
	
	public String getNombreAlumno() {
		
		return nombreAlumno;
	}
	
	private final String nombreAlumno;
	
	private Colegio nombreColegio;
	
	private int nAlumno;
	
	private double notaMedia;
	
	private static int numeroAlumno=1;
}
