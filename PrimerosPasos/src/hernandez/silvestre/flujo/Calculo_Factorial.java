package hernandez.silvestre.flujo;

import javax.swing.JOptionPane;

public class Calculo_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		
		long factorial=numero;
		
		for(int i=numero-1;i>0;i--) {
			factorial*=i;
		}
		
		System.out.println("El factorial de " + numero + " es " + factorial);
	}

}
