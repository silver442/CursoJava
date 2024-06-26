package ejerciciosEventos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class EjercicioEventosII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoLogin mimarco=new MarcoLogin();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class MarcoLogin extends JFrame{
	
	public MarcoLogin(){
	
		setBounds(300,300,400,300);
		
		setTitle("Mi marco de ejercicio");
		
		PanelLogin miPanel=new PanelLogin();
		
		add(miPanel);
		
		setVisible(true);
	}
	
}

class PanelLogin extends JPanel{
	
	public void paintComponent (Graphics g) {
	
		super.paintComponent(g);
		
		etiqUsuario= new JLabel("Usuario");
		etiqContrasena= new JLabel("Contraseña");
		etiqEmail= new JLabel("Email");
		
		etiqUsuario.setBounds(70, 10, 150, 20);
		etiqContrasena.setBounds(50, 50, 150, 20);
		etiqEmail.setBounds(70, 90, 150, 20);
		
		campoUsuario=new JTextField();
		campoContrasena=new JTextField();
		campoEmail=new JTextField();
	
		campoUsuario.setBounds(120, 10, 150, 20);
		campoContrasena.setBounds(120, 50, 150, 20);
		campoEmail.setBounds(120, 90, 150, 20);
		
		add(etiqUsuario);
		add(etiqContrasena);
		add(etiqEmail);
		
		add(campoUsuario);
		add(campoContrasena);
		add(campoEmail);

		EventoFoco foco=new EventoFoco();
		
		campoUsuario.addFocusListener(foco);
		campoContrasena.addFocusListener(foco);
		campoEmail.addFocusListener(foco);
	}
	
	private class EventoFoco implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
				
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource()==campoUsuario) {
				
				if(campoUsuario.getText().equals("")) {
					
					JOptionPane.showMessageDialog(getParent(), "EL campo usuario no puede estar vacio");
					campoUsuario.requestFocus();
				}else {
					System.out.println(campoUsuario.getText());
				}
				

			}else if(e.getSource()==campoContrasena){
				
				if(campoContrasena.getText().equals("")) {
					
					JOptionPane.showMessageDialog(getParent(), "EL campo Contraseña no puede estar vacio");
					campoContrasena.requestFocus();
				}else {
					System.out.println(campoContrasena.getText());
				}
			}else {
			
				if(campoEmail.getText().equals("") && !campoContrasena.getText().equals("")) {
					
					JOptionPane.showMessageDialog(getParent(), "EL campo Email no puede estar vacio");
					campoEmail.requestFocus();
				}else {
					System.out.println(campoContrasena.getText());
				}
			
			}
			
				
		}
		
	}
	
	private JTextField campoUsuario, campoContrasena, campoEmail;

	private JLabel etiqUsuario, etiqContrasena, etiqEmail;
}