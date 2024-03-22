package hernandez.silvestre.accesoficheros;

import java.io.File;
import java.io.IOException;

public class CreandoDirectorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File ruta_archivo=new File("C:" + File.separator + "Users" + File.separator+ "silve" + File.separator +"Downloads"+ File.separator + "externoJava" + File.separator + "Datos economicos" + File.separator + "Balance Rimestre1.xlsx");
		
		//directorio.mkdir();	
		
		try {
			
			ruta_archivo.createNewFile();
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
