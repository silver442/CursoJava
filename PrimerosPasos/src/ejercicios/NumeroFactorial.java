package ejercicios;

import javax.swing.JOptionPane;

public class NumeroFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero para obtener su factorial"));
		
		int factorial=numero;
		
		for(int i=numero-1;i>=1;i--) {
			
			factorial=factorial*i;
		}
		if(numero==0) {
			factorial = 1;
		}
		
		System.out.println("el factorial de "+numero+" = "+factorial);
	}
}
