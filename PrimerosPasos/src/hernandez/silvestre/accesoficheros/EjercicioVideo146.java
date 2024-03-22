package hernandez.silvestre.accesoficheros;

import javax.swing.JOptionPane;
import java.io.*;

public class EjercicioVideo146 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nDirectorio=JOptionPane.showInputDialog("Introduce el nombre del directorio");
		
		String nArchivo=JOptionPane.showInputDialog("Introduce el nombre del archivo");
		
		String frase=JOptionPane.showInputDialog("Introduce la frase");
		
		File directorio=new File("C:" + File.separator + "Users" + File.separator+ "silve" + File.separator +"Downloads"+ File.separator + "externoJava" + File.separator + nDirectorio);
		
		// Creación de directorio
		
		directorio.mkdir();
		
		File ruta_archivo=new File("C:" + File.separator + "Users" + File.separator+ "silve" + File.separator +"Downloads"+ File.separator + "externoJava" + File.separator + nDirectorio + File.separator + nArchivo);
		
		// Creacion y escritura
		
		try {
			
			ruta_archivo.createNewFile();
			
			// Escritura
			
			FileWriter escritura=new FileWriter("C:" + File.separator + "Users" + File.separator+ "silve" + File.separator +"Downloads"+ File.separator + "externoJava" + File.separator + nDirectorio + File.separator + nArchivo);
			
			for(int i=0;i<frase.length();i++) {
				
				escritura.write(frase.charAt(i));
				
			}
			escritura.close();
			
		}catch (Exception e) {
			
			
		}
		
	}
}
