package hernandez.silver.ejerciciospoo;

public class Colegio {
	
	public Colegio(String nombre, int numAlumnos) {
		this.nombre=nombre;
		
		arrayAlumnos=new Alumno[numAlumnos];
	}
	
	public String getNombreColegio() {
		
		return nombre;
		
	}
	
	private Alumno getAlumno(int nAlumno) {
		
		return arrayAlumnos[nAlumno];
		
	}
	
	public void nuevoAlumno(String nombreAlumno, double notaAlumno) {
		
		Alumno nuevoAlumno=new Alumno(this, nombreAlumno, notaAlumno);
		
		arrayAlumnos[posicionArray]=nuevoAlumno;
		
		posicionArray++;
	}
	
	public void expulsarAlumno(String nombreAlumno) {
		
		for(int i=0;i<arrayAlumnos.length;i++) {
			
			if(this.getAlumno(i)!=null) {
				
				if(arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
					
					arrayAlumnos[i]=null;
					
				}
			}
		}
	}
	
	
	public void setNotaMedia(String nombreAlumno, double nuevaNotaMedia) {
		
		for(int i=0;i<arrayAlumnos.length;i++) {
			
			if(this.getAlumno(i)!=null) {
				
				if(arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
					
					arrayAlumnos[i].setNotaMedia(nuevaNotaMedia);
				
				}
			}
		}
	}
	
	// Métodos getter
	public void getTodosAlumnos() {
		
		for(int i=0; i<arrayAlumnos.length;i++) {
			
			if(this.getAlumno(i)!=null) {
				System.out.println(this.getAlumno(i));
				System.out.println();
			}
		}
	}
	
	public void getDatoAlumno(String nombreAlumno) {

		for(int i=0;i<arrayAlumnos.length;i++) {
			
			if(this.getAlumno(i)!=null) {
				
				if(arrayAlumnos[i].getNombreAlumno().equals(nombreAlumno)) {
					
					System.out.println(this.getAlumno(i));
					System.out.println();
				}
			}
		}
	}
	
	
	private final String nombre;
	
	private Alumno arrayAlumnos[];
	
	private int posicionArray=0;
}
