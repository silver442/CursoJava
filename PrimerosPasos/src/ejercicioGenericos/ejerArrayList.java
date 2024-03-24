package ejercicioGenericos;

import java.util.*;

public class ejerArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> array = leerDatos();
		double suma = calcularSuma(array);
		double media = suma / array.size();
		mostrarResultados(array, suma, media);
		
	}

	//Método que pide números por consola y los almacena en un ArrayList
	// finaliza cuando se introduce 0
	public static ArrayList<Integer> leerDatos(){
		ArrayList<Integer> datos = new ArrayList();
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.println("Introduce entero. 0 para salir: ");
		num= entrada.nextInt();
		while(num != 0) {
			datos.add(num);
			System.out.println("Introduce un n°. 0 para salir");
			num=entrada.nextInt();
		}
		return datos;
	}
	
	//recorre el ArrayList y suma tdos los número almacenados
	public static double calcularSuma(ArrayList<Integer> valores) {
		double suma=0;
		Iterator it = valores.iterator();
		while(it.hasNext()) {
			suma=suma + (Integer) it.next();
			
			//next() devuelve un dato de tipo Object. Hay que convertirlo a Integer
		}
		return suma;
	}
	
	//Muestra de resultados (suma, media y superiores a la media)
	public static void mostrarResultados(ArrayList<Integer> valores, double suma, double media) {
		
		int contador=0;
				System.out.println("Valores introducidos: ");
				System.out.println(valores);
				System.out.println("Suma: " + suma);
				System.out.printf("Media: %2f %n", media);
				for(Integer i : valores) {
					if(i > media) {
						contador++;
					}
				}
				System.out.println(contador + " valores superiores a la media");
	}
	
}
