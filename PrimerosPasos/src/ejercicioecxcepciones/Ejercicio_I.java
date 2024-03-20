package ejercicioecxcepciones;

import javax.swing.JOptionPane;

public class Ejercicio_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un n°"));
			
			if(num%2==0) {
				
				JOptionPane.showMessageDialog(null, "El n° " + num + " es par");
				
			}
		}catch(NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "El valor no es numerido, \n el programa se cerrará");
			
			System.exit(0);
		}
		
		
	}
}
