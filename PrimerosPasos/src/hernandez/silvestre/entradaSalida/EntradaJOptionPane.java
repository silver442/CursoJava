package hernandez.silvestre.entradaSalida;

import javax.swing.*;

public class EntradaJOptionPane {

	public static void main(String[] args) {

		String nombre=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor"));
		
		System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años");
		
	}
}
