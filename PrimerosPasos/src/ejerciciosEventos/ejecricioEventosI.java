package ejerciciosEventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class ejecricioEventosI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoEjercicio mimarco=new MarcoEjercicio();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoEjercicio extends JFrame{
	
	MarcoEjercicio(){
		
		setBounds(250,250,350,200);
		
		panel miPanel = new panel();
		
		add(miPanel);
		
		setVisible(true);
	}
	
}

class panel extends JPanel{
	
	public panel() {
		
		addMouseListener(new EventoRaton());
		
	}
	
}

class EventoRaton implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Haz precionado en la pantalla");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
