package introspeccion;

public class PruebaIntrospeccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona ana=new Persona("Ana");
		
		//System.out.println(ana.getNombre());
		
		Empleado javier=new Empleado("Javier", 45000);
		
		/*System.out.println(javier.getNombre());
		
		System.out.println(javier.getSalario());*/
		
		// System.out.println(ana.getClass());
		
		String nombreClase="introspeccion.Empleado";
		
		
		Class emp1;
		
		
		try {
			emp1 = Class.forName(nombreClase);
		
			System.out.println(emp1.getName());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		nombreClase="introspeccion.Persona";

		try {
			emp1 = Class.forName(nombreClase);
		
			System.out.println(emp1.getName());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
}

class Persona{
	
	public Persona(String nombre) {
		
		this.nombre=nombre;
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	private String nombre;
	
}

class Empleado extends Persona{
	
	public Empleado(String nombre, double salario) {
		
		super(nombre);
		this.salario=salario;
	}
	
	public void setIncentivo(double incentivo) {
		
		salario=salario+incentivo;
	}
	
	public String getSalario() {
		
		return "El salario es: " + salario;
	}
	
	private double salario;
}
