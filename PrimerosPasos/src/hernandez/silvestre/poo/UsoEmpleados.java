package hernandez.silvestre.poo;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados empleado1=new Empleados("Anna");
		
		System.out.println(empleado1.getDatosEmpleado());
		
		empleado1.setSeccion("RRHH");
		
		System.out.println(empleado1.getDatosEmpleado());
	}
}

class Empleados{
	
	public Empleados(String nombre) {
		
		this.nombre=nombre;
		
		seccion="Administración";
	}
	
	public void setSeccion(String seccion) {
		
		this.seccion=seccion;
		
	}
	
	public String getDatosEmpleado() {
		
		return "El empleado " + nombre + " pertenece a la sección de " + seccion;
	}
	
	private final String nombre;
	
	private String seccion;
}
