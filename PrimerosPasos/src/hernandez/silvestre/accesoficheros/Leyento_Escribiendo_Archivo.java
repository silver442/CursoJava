package hernandez.silvestre.accesoficheros;

import java.io.*;

public class Leyento_Escribiendo_Archivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador=0;
		
		int bytesImagen[]=new int[6321];
		
		try {
		
			FileInputStream lectura_archivo=new FileInputStream("C:/Users/silve/Downloads/miGato.jpg");
		
			boolean final_archivo=false;
			
			while(!final_archivo) {
				
				int byteImagenEntrada=lectura_archivo.read();
				
				if(byteImagenEntrada!=-1) bytesImagen[contador]=byteImagenEntrada;
				
				else final_archivo=true;
				
				System.out.println(bytesImagen[contador]);
				
				contador++;
			}
			
			lectura_archivo.close();
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		//System.out.println(contador);

		CreaFichero(bytesImagen);
	
	}

	static void CreaFichero(int arrayExterno[]) {
		
		try {
			
			FileOutputStream ficheroExterno=new FileOutputStream("C:/Users/silve/Downloads/escritura/gatoClon.jpg");
			
			for(int i=0;i<arrayExterno.length;i++) {
				
				ficheroExterno.write(arrayExterno[i]);
				
			}
			
			ficheroExterno.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
