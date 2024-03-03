package hernandez.silver.ejerciciospoo;

import java.util.Random;

import javax.swing.JOptionPane;

public class UsoGeneradorContraseña {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tamanioArray=Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array"));
		
		int longitudPass=Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud del password"));
		
		CreaPassword ArrayPasswords[]=new CreaPassword[tamanioArray];
		
		for(int i=0;i<ArrayPasswords.length;i++) {
			
			ArrayPasswords[i]=new CreaPassword(longitudPass);
		
			System.out.println("Password: " + ArrayPasswords[i].getPasswords() + " Longitud: " + ArrayPasswords[i].getLongitud() +
					" caracteres " + " "+ ArrayPasswords[i].esSegura());
		}
		
	}
}
