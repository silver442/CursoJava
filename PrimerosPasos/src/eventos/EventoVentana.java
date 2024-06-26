package eventos;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class EventoVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoEventoVentana mimarco=new MarcoEventoVentana();
		
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		mimarco.addWindowStateListener(new EventosDeVentana());
	}

}

class MarcoEventoVentana extends JFrame{
	
	public MarcoEventoVentana() {
		
		setBounds(300, 300, 600, 350);
		
		setVisible(true);
	}
}

class EventosDeVentana implements WindowStateListener{
/*
	public void windowClosed(WindowEvent e){
		
		System.out.println("Gracias por trabajar en la App. Hasta pronto");
		
	}
	
	public void windowOpened(WindowEvent e) {
		
		System.out.println("Bienvenido a la App");
	}*/

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
	
		System.out.println("La ventana ha cambiado de estado");

		//System.out.println(e.getNewState());
	
		if(e.getNewState()==Frame.MAXIMIZED_BOTH) System.out.println("Haz maximizado la ventana");
		
		else if(e.getNewState()==Frame.ICONIFIED) System.out.println("Haz minimizado la ventana");
		
		else System.out.println("Haz hecho un cambio sin especificar");
	}
	
}