package hernandez.silvestre.programaciongenerica;

import java.util.*;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		/*Empleados[] losEmpleados=new Empleados[4];
		
		losEmpleados[0]=new Empleados("Antonio", 2300.5, 2005, 7, 5);
		losEmpleados[1]=new Empleados("Carlos", 5000.5, 2007,6, 5);
		losEmpleados[2]=new Empleados("María", 2500.5, 2006, 11, 7);
		losEmpleados[3]=new Empleados("Ana", 7000, 2009 , 5, 3);*/
		
		ArrayList <Empleados> listaEmpleados=new ArrayList<Empleados>();
		
		//listaEmpleados.ensureCapacity(12); // capacidad por defecto
		
		listaEmpleados.add(new Empleados("Antonio", 2300.5, 2005, 7, 5));
		listaEmpleados.add(new Empleados("Maria", 2300.5, 2005, 7, 5));
		listaEmpleados.add(new Empleados("Ana", 2800.5, 2007, 7, 5));
		listaEmpleados.add(new Empleados("Jose", 2100.5, 2009, 7, 5));
		
		//Remplazo de elemento
		
		listaEmpleados.set(1, new Empleados("Jorge", 1900, 2003, 5, 6));
		
		// Reduce el arrayList al numero de elementos
		// listaEmpleados.trimToSize(); 
		
		// System.out.println(listaEmpleados.size());
		/*
		for(Empleados obj: listaEmpleados) {
			
			System.out.println(obj.getDatosEmpleado() + " y un salario de " + obj.getSueldo());
		}*/
		/*
		for(int i=0;i<listaEmpleados.size();i++) {
			
			Empleados e=listaEmpleados.get(i);
			
			System.out.println(e.getDatosEmpleado() + " y un salario de " + e.getSueldo());
			
		}*/
		
		//System.out.println(listaEmpleados.get(3));
	
		// Copiar el arrayList en un array convencional
		/*Empleados EmpleadosArray[]=new Empleados[listaEmpleados.size()];
	
		listaEmpleados.toArray(EmpleadosArray);
		
		for(int i=0;i<EmpleadosArray.length;i++) {
			
			System.out.println(EmpleadosArray[i].getDatosEmpleado());
			
		}*/
		
		Iterator<Empleados> IteradorEmpleados=listaEmpleados.iterator();
		
		while(IteradorEmpleados.hasNext()) System.out.println(IteradorEmpleados.next().getDatosEmpleado());
		
	}
}


class  Empleados{
	
	public Empleados(String nom, double sue, int agno, int mes, int dia) {
	
		nombre=nom;
		
		sueldo=sue;
		
		calendario=new GregorianCalendar(agno, mes, dia);
		
		Id=IdSiguiente;
		
		IdSiguiente++;
		
	}
	
	public String getDatosEmpleado() {
		
		return "El empleado " + nombre +" tiene el Id " + Id;
		
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
	
	private GregorianCalendar calendario;
	
	private int Id;
	
	private static int IdSiguiente=1;
	
	
}