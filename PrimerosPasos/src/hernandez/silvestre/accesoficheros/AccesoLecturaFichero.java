package hernandez.silvestre.accesoficheros;

import java.io.*;

public class AccesoLecturaFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LeerFichero acceso_externo=new LeerFichero();
		
		acceso_externo.leeDatos();
		
	}

}

class LeerFichero{
	
	public void leeDatos() {
		
		try {
			
			FileReader entrada=new FileReader("C:/Users/silve/Downloads/primerfichero.txt");
		
			int caracter=entrada.read();
			
			while(caracter!=-1) {
				
				System.out.print((char)caracter);
				
				caracter=entrada.read();
				
			}
			entrada.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se ha encontrado el archivo");
		} 
	}
	
}
