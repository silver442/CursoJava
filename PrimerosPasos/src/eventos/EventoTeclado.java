package eventos;

import java.awt.event.*;

import javax.swing.*;

public class EventoTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoEventoTeclado mimarco=new MarcoEventoTeclado();
		
		mimarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		mimarco.addKeyListener(new EventoDeTeclado());
	}
}

class MarcoEventoTeclado extends JFrame{
	
	public MarcoEventoTeclado() {
		
		setBounds(300, 300, 600, 350);
		
		setVisible(true);
	}
}

class EventoDeTeclado implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Haz tecleado una tecla");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Haz pulsado la tecla: " + e.getKeyCode());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Haz soltado una tecla");
	}
}