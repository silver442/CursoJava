package ejercicios;

import javax.swing.JOptionPane;

public class EjercicioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorio = (int)(Math.random()*100);
		int numero=0;
		int contador = 0;
		
		while(aleatorio!=numero) {
			numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero de 1 a 100"));
			if(aleatorio<numero) {
				System.out.println("El numero es menor");
			}else if(aleatorio>numero) {
				System.out.println("el numero es mayor");
			}else {
				System.out.println("Ganaste");
			}
			contador++;
		}
		
		System.out.println("Lo has conseguido, en " +contador +" intentos");
		
	}

}
