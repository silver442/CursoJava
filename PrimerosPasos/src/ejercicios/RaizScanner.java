package ejercicios;

import java.util.*;

public class RaizScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un npumero:");
		
		double raiz=entrada.nextDouble();
		
		System.out.println("La raíz es = "+ Math.sqrt(raiz));
		
		entrada.close();
	}

}
