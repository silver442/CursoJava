package hernandez.silvestre.flujo;

import javax.swing.JOptionPane;

public class Ejemplo_Do_while {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Este programa cuenta los caracteres de la palabra o frase introducida \n"
					+ "Para terminar escribe salir");
		
		String texto;
		
		do{
			
			texto=JOptionPane.showInputDialog("Introduce el texto");
			
			JOptionPane.showMessageDialog(null, "El texto introducido tiene " + texto.length() + 
					" caracteres");
			
		}while(!texto.equals("salir"));

		System.out.println("Haz salido del programa");
		
	}
}
