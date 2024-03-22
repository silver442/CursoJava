package ejercicioficheros;

import java.io.*;

import javax.swing.JOptionPane;

public class EjercicioCreacionFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombreCarpeta=JOptionPane.showInputDialog("Ingresa el nombre de la carpeta a crear");
		
		String nombreArchivo=JOptionPane.showInputDialog("Ingresa el nombre del archivo a crear");
		
		String texto=JOptionPane.showInputDialog("Ingresa el texto que contendra el archivo");
		
		File carpeta=new File("C:" + File.separator + "Users" + File.separator+ "silve" + File.separator +"Downloads"+ File.separator + "externoJava" + File.separator + nombreCarpeta);
		
		File archivo=new File("C:" + File.separator + "Users" + File.separator+ "silve" + File.separator +"Downloads"+ File.separator + "externoJava" + File.separator + nombreCarpeta + File.separator + nombreArchivo);
		
		carpeta.mkdir();
		
		try {
			archivo.createNewFile();
			
			FileWriter escribir=new FileWriter("C:" + File.separator + "Users" + File.separator+ "silve" + File.separator +"Downloads"+ File.separator + "externoJava" + File.separator + nombreCarpeta + File.separator + nombreArchivo);
			
			for(int i=0;i<texto.length();i++) {
				
				escribir.write(texto.charAt(i));
				
			}
			
			escribir.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
