package interfacesGraficas;

import javax.swing.*;

public class PrimerFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame miVentana=new JFrame();
		
		miVentana.setSize(600, 350); // para el tamaño de la ventana(width, height
		
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para indicarle que hacer cuando se cierra la ventana
		
		miVentana.setLocation(600, 350); //para establecer la ubicacion en pantalla

		miVentana.setVisible(true); // para hacerla visible
	}
}
