package hernandez.silvestre.poo;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados empleado1=new Empleados("Anna");
		
		Empleados empleado2=new Empleados("Antonio");
		
		Empleados empleado3=new Empleados("Maria");
		
		System.out.println(empleado1.getDatosEmpleado());
		
		empleado1.setSeccion("RRHH");
		
		System.out.println(empleado1.getDatosEmpleado());
		
		System.out.println(empleado2.getDatosEmpleado());
		
		System.out.println(empleado3.getDatosEmpleado());
		
		System.out.println(Empleados.getIdSiguiente());
	}
}

class Empleados{
	
	public Empleados(String nombre) {
		
		this.nombre=nombre;
		
		seccion="Administración";
		
		Id=IdSiguiente;
		
		IdSiguiente++;
	}
	
	public void setSeccion(String seccion) {
		
		this.seccion=seccion;
		
	}
	
	public String getDatosEmpleado() {
		
		return "El empleado " + nombre + " pertenece a la sección de " + seccion+" y tienen el n° "+Id;
	}
	
	public static String getIdSiguiente() {
		
		return "El Id del siguiente Empleado será: " + IdSiguiente;
		
	}
	
	private final String nombre;
	
	private String seccion;
	
	private int Id;
	
	private static int IdSiguiente=1;
}
