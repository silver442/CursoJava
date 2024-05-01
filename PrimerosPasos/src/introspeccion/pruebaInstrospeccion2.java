package introspeccion;

import java.lang.reflect.*;
import java.util.Scanner;

public class pruebaInstrospeccion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce el nombre de la clase a examinar");
		
		String nombreClase;
		
		nombreClase=entrada.next();
		
		try {
			
			Class cl=Class.forName(nombreClase);
			
			Class superCl=cl.getSuperclass();
			
			System.out.println("Clase: " + nombreClase);
			
			if(superCl!=null && superCl!=Object.class) System.out.println("hereda de "+ superCl.getName());
			
			System.out.println();
			
			getConstructores(cl);
			
			System.out.println();
			
			getMetodos(cl);
			
			System.out.println();
			
			getCampos(cl);
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public static void getConstructores(Class cl) {
		
		Constructor[] constructores=cl.getDeclaredConstructors();
		
		for (Constructor c : constructores) {
			
			String nombreConstructor=c.getName();
		
			System.out.print(" "+ Modifier.toString(c.getModifiers()));
			
			System.out.print(" "+nombreConstructor +"(");
			
			Class[]tipoParams=c.getParameterTypes();
			
			for (int i=0;i<tipoParams.length;i++) {
				
				System.out.println(tipoParams[i].getName());
				
				if(i>0) System.out.print(", ");
				
			}
			
			System.out.println(");");
		
		}		
	}

	public static void getMetodos(Class cl) {
		
		Method [] metodos=cl.getDeclaredMethods();
		
		for(Method m:metodos) {
			
			Class tipoDevuelto=m.getReturnType();
			
			String nombre=m.getName();
			
			System.out.print(" "+Modifier.toString(m.getModifiers()));
			
			System.out.print(" "+tipoDevuelto.getName() + " "+nombre + "(");
			
			Class[] tipoParams=m.getParameterTypes();
			
			for(int i=0;i<tipoParams.length;i++) {
				
				if(i>0) System.out.print(", ");
				
				System.out.print(tipoParams[i].getName());
				
			}
	
			System.out.println(");");		
		}
	}
	
	public static void getCampos(Class cl) {
		
		Field[] campos=cl.getDeclaredFields();
		
		for(Field f:campos) {
			
			Class tipoCampo=f.getType();
			
			String nombre=f.getName();
		
			System.out.print(" "+ Modifier.toString(f.getModifiers()));
		
			System.out.println(" "+ tipoCampo.getName()+" "+nombre+";");
		}
	}
}
