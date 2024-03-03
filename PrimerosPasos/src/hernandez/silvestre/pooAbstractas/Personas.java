package hernandez.silvestre.pooAbstractas;

import java.util.Date;

public abstract class Personas {

	public Personas(String nom) {
		
		nombre=nom;
		
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public  abstract String getDescripcion();
	
	
	private String nombre;
	
}

class Empleados extends Personas{

	public Empleados(String nom, Date fechaAlta, double sueldo) {
		super(nom);
		// TODO Auto-generated constructor stub
		
		this.fechaAlta=fechaAlta;
		
		this.sueldo=sueldo;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "El empleado "+ this.getNombre() + " tiene un sueldo"
				+ " de $" + sueldo + " y entró a trabajar en " + fechaAlta;
	}
	
	private double sueldo;
	
	private Date fechaAlta;
}

class Jefes extends Empleados{

	public Jefes(String nom, Date fechaAlta, double sueldo) {
		super(nom, fechaAlta, sueldo);
		// TODO Auto-generated constructor stub
	}
	
	public void setIncentivo(double incentivo) {
		
		this.incentivo=incentivo;
	}
	
	private double incentivo;
	
}

class Alumnos extends Personas{

	public Alumnos(String nom, String optativas, String aula) {
		super(nom);
		// TODO Auto-generated constructor stub
		
		a_optativas=optativas;
		
		this.aula=aula;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "El alumno " + this.getNombre() + " está en el aula " + aula + " y " 
				+ " ha escogido la asignatura " + a_optativas;
	}
	
	private String a_optativas;
	
	private String aula;
}