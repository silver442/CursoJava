package hernandez.silver.ejerciciospoo;

import java.util.Scanner;

public class ClaseUso_Sucursal_y_Paquete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numSucursal;
		String direccion;
		String ciudad;
		int numPaquetes;
		
		int prioridad;
		
		Scanner entrada =new Scanner(System.in);
		
		System.out.println("Numero de sucursal");
		numSucursal=entrada.nextInt();
		entrada.nextLine(); //Para no capturar el enter
		System.out.println("direccion: ");
		direccion=entrada.nextLine();
		System.out.println("ciudad: ");
		ciudad=entrada.nextLine();
		System.out.println("Num de paquetes:");
		numPaquetes=entrada.nextInt();
		
		ClaseSucursal sucursal1=new ClaseSucursal(numSucursal,direccion,ciudad);
		
		ClasePaquete[] paquetes=new ClasePaquete[numPaquetes];
		
		for(int i=0;i<numPaquetes;i++) {
			System.out.println("Ingresa la referencia del paquete n° " + (i+1));
			int referencia = entrada.nextInt();
			entrada.nextLine();
			
			System.out.println("Ingresa tu DNI");
			int DNI= entrada.nextInt();
			entrada.nextLine();
			System.out.println("Ingresa el peso del paquete");
			double peso=entrada.nextDouble();
			entrada.nextLine();
			System.out.println("Ingresa la prioridad Normal/Alta/Urgente");
			String prioridadIngresada=entrada.nextLine();
			
			if(prioridadIngresada.equals("Normal")) prioridad=0;
			else if(prioridadIngresada.equals("Alta")) prioridad=1;
			else if(prioridadIngresada.equals("Urgente")) prioridad=2;
			else prioridad =0;
			
			paquetes[i]=new ClasePaquete(referencia, peso, DNI, prioridad);
		
			ClaseSucursal.setCalcularPrecio(paquetes[i]);
		}
		
		System.out.println(sucursal1.getDatos());
		System.out.println("La informacion de tus paquetes son: \n");

		for(ClasePaquete elemento:paquetes) {
			System.out.println(elemento.getDatosPaquete());
		}
	}
}
