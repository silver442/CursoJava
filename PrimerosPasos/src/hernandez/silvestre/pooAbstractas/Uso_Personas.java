package hernandez.silvestre.pooAbstractas;

import java.sql.Date;

public class Uso_Personas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados Juan=new Empleados("Juan", new Date(5465454), 2500);
		
		System.out.println(Juan.getNombre());
		System.out.println(Juan.getDescripcion());
		
		Jefes Ana=new Jefes("Ana", new Date(654546), 3500);
		
		System.out.println(Ana.getNombre());
		System.out.println(Ana.getDescripcion());
		
		Alumnos Maria=new Alumnos("María", "Dibujo", "Aula 5");
		
		System.out.println(Maria.getNombre());
		System.out.println(Maria.getDescripcion());
	}

}
