package hernandez.silver.ejerciciospoo;

public class UsoColegio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Colegio cervantes=new Colegio("Cervantes", 20);
		
		cervantes.nuevoAlumno("Antonio", 7);
		
		cervantes.nuevoAlumno("Rosa", 8);
		
		//cervantes.getDatoAlumno("Rosa");
		
		cervantes.expulsarAlumno("Antonio");
		
		cervantes.setNotaMedia("Rosa", 9);
		
		cervantes.getTodosAlumnos();
	}

}
