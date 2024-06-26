package hernandez.silvestre.pooAbstractas;

import java.sql.Date;
import java.util.Arrays;

public class Uso_Personas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Empleados Juan=new Empleados("Juan", new Date(5465454), 2500);
		
		System.out.println(Juan.getNombre());
		System.out.println(Juan.getDescripcion());
		
		Jefes Ana=new Jefes("Ana", new Date(654546), 3500);
		Ana.setCargo("Directora comercial");
		System.out.println(Ana.getNombre());
		System.out.println(Ana.getDescripcion() + Ana.getCargo());
		
		Alumnos Maria=new Alumnos("María", "Dibujo", "Aula 5");
		
		System.out.println(Maria.getNombre());
		System.out.println(Maria.getDescripcion());
	
		Jefes David=new Jefes("David", new Date(654654), 4800);
		David.setCargo("Director de RRHH");
		System.out.println(David.getNombre());
		System.out.println(David.getDescripcion() + David.getCargo());*/
	
		Empleados losEmpleados[]=new Empleados[5];
		
		losEmpleados[0]=new Empleados("Juan", new Date(6456546), 2500);
		losEmpleados[1]=new Empleados("María", new Date(6456546), 1500);
		losEmpleados[2]=new Empleados("Anna", new Date(6456546), 3500);
		losEmpleados[3]=new Empleados("Sandra", new Date(6456546), 6000);
		losEmpleados[4]=new Empleados("Antonio", new Date(6456546), 2100);
		
		Arrays.sort(losEmpleados); // los ordena de menor a mayor
		
		for(Empleados e:losEmpleados) {
			
			System.out.println(e.getDescripcion());
			
		}
		
		Jefes Manuel=new Jefes("Manuel", new Date(54654), 5000);
		
		Empleados Sonia=new Empleados("Sonia", new Date(654654), 3000);
	
		System.out.println("El trabajador " + Manuel.getNombre() + " tiene un bonus de : "+
		Manuel.setBonus(500));
	}
}
