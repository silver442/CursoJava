package hernandez.silvestre.accesoficheros;

import java.io.*;

public class AccesoRutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File directorio=new File("C:" + File.separator + "Users" + File.separator+ "silve" + File.separator +"Downloads"+ File.separator + "externoJava");
		
		System.out.println(directorio.getAbsolutePath());
		
		//System.out.println(directorio.exists());
		
		String [] nombres=directorio.list();
		
		for(int i=0; i<nombres.length; i++) {
			
			System.out.println(nombres[i]);
			
			File f=new File(directorio.getAbsolutePath(), nombres[i]);
			
			if(f.isDirectory()) {
				
				String [] archivos_subcarpeta=f.list();
				
				for(int j=0;j<archivos_subcarpeta.length;j++) {
					
					System.out.println(archivos_subcarpeta[j]);
					
				}
			}	
		}
	}
}
