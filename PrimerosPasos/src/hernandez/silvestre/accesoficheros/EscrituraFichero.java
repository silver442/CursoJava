package hernandez.silvestre.accesoficheros;

import java.io.FileWriter;
import java.io.IOException;

public class EscrituraFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Escritura escribeFichero=new Escritura();
	
		escribeFichero.escribiendo();
	}
}

class Escritura{
	
	public void escribiendo() {
		
		String texto=". Esta es la segunda frase";
		
		try {
			
			FileWriter escritura=new FileWriter("C:/Users/silve/Downloads/streamsNuevo.txt", true);
		
			for(int i=0;i<texto.length();i++) {
				
				// escribiendo en el fichero creado
				escritura.write(texto.charAt(i));
				
			}
			escritura.close();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
