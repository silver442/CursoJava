package hernandez.silvestre.poo;

import java.util.GregorianCalendar;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		Empleados Antonio= new Empleados("Antonio", 2300.5, 2005, 7, 15);
		
		Jefes Ana=new Jefes("Ana", 2900, 2008, 8, 9);
		
		Ana.setIncentivo(300.5);
		
		System.out.println(Ana.getSueldo());*/
	
		Jefes Juan =new Jefes("Juan", 8000, 2013,8,5);
		
		Juan.setIncentivo(200);
		
		Empleados[] losEmpleados=new Empleados[6];
		
		losEmpleados[0]=new Empleados("Anotonio", 2300.5, 2005, 7, 5);
		losEmpleados[1]=new Empleados("Carlos", 500.5, 2007, 6, 5);
		losEmpleados[2]=new Empleados("María", 2500.5, 2006, 11, 7);
		losEmpleados[3]=new Empleados("Ana", 7000, 2009, 5, 3);
		losEmpleados[4]=Juan; // Principio de sustitucion
		losEmpleados[5]=new Jefes("Isabel",8000,2007,4,2);
		
		Jefes Isabel=(Jefes)losEmpleados[5];
		
		Isabel.setIncentivo(500);
		/*Empleados Patricia=new Jefes("Patricia", 2500,2007,5,6);
		
		Jefes PatriciaDirector=(Jefes)Patricia;*/
		
		for(Empleados obj:losEmpleados) {
			
			System.out.println(obj.getDatosEmpleado() + " y un salario de " + obj.getSueldo());
			
		}	
	}
}

class Empleados{
	
	public Empleados(String nom, double sue, int agno, int mes, int dia) {
		
		nombre=nom;
		
		sueldo=sue;
		
		calendario=new GregorianCalendar(agno, mes, dia);
		
		Id=IdSiguiente;
		
		IdSiguiente++;
	}
	
	public String getDatosEmpleado() {
		
		return "El empleado " + nombre + " tiene el Id "+Id;
	}
	
	public double getSueldo() {
		
		return sueldo;
		
	}
	
	public GregorianCalendar getFechaAlta() {
		
		return calendario;
		
	}
	
	public void setSubeSueldo(double porcentaje) {
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
		
	}
	
	public static String getIdSiguiente() {
		
		return "El Id del siguiente Empleado será: " + IdSiguiente;
		
	}
	
	private final String nombre;

	private double sueldo;
	
	GregorianCalendar calendario;
	
	private int Id;
	
	private static int IdSiguiente=1;
}

class Jefes extends Empleados{

	public Jefes(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
		// TODO Auto-generated constructor stub
	}
	
	public void setIncentivo(double b) {
		
		incentivo=b;
		
	}
	
	public double getSueldo() { // sobre escribe el metodo getSueldo de la clase padre
		
		double sueldoJefe=super.getSueldo(); //con super llama a la clase padre
		
		return sueldoJefe + incentivo;
		
	}
	
	private double incentivo;
	
}

