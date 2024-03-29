package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class EventoFoco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFoco mimarco=new MarcoFoco();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}
}

class MarcoFoco extends JFrame{
	
	public MarcoFoco() {
		
		setBounds (500,300,400,250);
		
		add(new Lamina_Marco_Foco());
	}
}

class Lamina_Marco_Foco extends JPanel{

	private class EventosDeFoco implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// Cuando pierde el Foco
			
			if(e.getSource()==campoTexto1) {
				System.out.println("El cuadro 1 ha perdido el foco");
			}
			
			else {
				System.out.println("El cuadro 2 ha perdido el foco");
			}
		}
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		campoTexto1=new JTextField();
		campoTexto2=new JTextField();
		campoTexto3=new JTextField();
		
		etiq1=new JLabel("Usuario");
		etiq2=new JLabel("Contraseña");
		etiq3=new JLabel("Email");
		
		campoTexto1.setBounds(120, 10, 150, 20);
		campoTexto2.setBounds(120, 50, 150, 20);
		campoTexto3.setBounds(120, 90, 150, 20);
		
		etiq1.setBounds(70, 10, 150, 20);
		etiq2.setBounds(50, 50, 150, 20);
		etiq3.setBounds(70, 90, 150, 20);
		
		
		add(campoTexto1);
		add(campoTexto2);
		add(campoTexto3);
		
		add(etiq1);
		add(etiq2);
		add(etiq3);
		
		EventosDeFoco foco=new EventosDeFoco();
		
		campoTexto1.addFocusListener(foco);
		campoTexto2.addFocusListener(foco);
	}

	private JTextField campoTexto1, campoTexto2, campoTexto3;
	
	private JLabel etiq1, etiq2, etiq3;
}