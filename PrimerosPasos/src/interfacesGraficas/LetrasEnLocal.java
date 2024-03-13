package interfacesGraficas;

import java.awt.GraphicsEnvironment;

public class LetrasEnLocal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] misFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String nombreFuente:misFuentes) {
			
			System.out.println(nombreFuente);
		}		
	}
}
