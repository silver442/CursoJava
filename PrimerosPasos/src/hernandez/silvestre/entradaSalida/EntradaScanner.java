package hernandez.silvestre.entradaSalida;

import java.util.Scanner;
public class EntradaScanner {

	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad=entrada.nextInt();
		
		entrada.nextLine(); // para no capturar el enter
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre=entrada.nextLine();
		
		System.out.println("Te llamas " + nombre + " y tienes " + edad + " años");
				
		entrada.close(); // es buena practica cerrar la entrada de scanner
	}
}
