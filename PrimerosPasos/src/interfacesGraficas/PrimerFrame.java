package interfacesGraficas;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class PrimerFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*JFrame miVentana=new JFrame();
		
		miVentana.setSize(600, 350); // para el tamaño de la ventana(width, height
		
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para indicarle que hacer cuando se cierra la ventana
		
		miVentana.setLocation(600, 350); //para establecer la ubicacion en pantalla

		miVentana.setVisible(true); // para hacerla visible
		*/
		
		MiJFrame miVentana=new MiJFrame();
	
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class MiJFrame extends JFrame{
	
	public MiJFrame() {
		
		// setSize(600,350); // Tamaño del Frame
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// setLocation(600, 350); // ubicacion de la pantalla
		
		setBounds(600,350,450,450); // Ubica y da tamaño a la pantalla
		
		//setResizable(false); // para que no redimencione el Frame
		//setLocationRelativeTo(null); // ubicar el JFrame en el centro
		
		//setExtendedState(Frame.MAXIMIZED_BOTH); // Maximizar toda la pantalla
		
		setTitle("Ventana de pruebas");// dar titulo al Frame
		
		Toolkit miSistema=Toolkit.getDefaultToolkit();
		
		//Image miIcono=miSistema.getImage("EsferaAzul.jpg"); // partiendo de la raiz
		
		Image miIcono=miSistema.getImage("src/interfacesGraficas/EsferaAzul.jpg");
		
		setIconImage(miIcono);
		
		setVisible(true);
	}
}