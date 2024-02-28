package hernandez.silvestre.flujo;

import javax.swing.JOptionPane;

public class EjemploWhile1 {

	public static void main(String[] args) {
		
		String clave ="Silver";
		
		String acceso="";
		
		while(!clave.equals(acceso)) {
			acceso = JOptionPane.showInputDialog("Ingresa la clave de acceso");
			if(!clave.equals(acceso)) {
				System.out.println("La clave es incorrecta");
			}
		}
		
		System.out.println("Bienvenido a la zona de usuarios");

	}
}
