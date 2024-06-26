package ejercicioComponentes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ComprobacionEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoEmail mimarco=new MarcoEmail();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class MarcoEmail extends JFrame{
	
	public MarcoEmail() {
		
		setBounds(300,300,450,250);
		
		setTitle("Comprueba correo electronico");
		
		PanelEmail miPanel=new PanelEmail();
		
		add(miPanel);
		
		setVisible(true);
	}
	
	
}


class PanelEmail extends JPanel{
	
	public PanelEmail() {
		
		campoTexto=new TextField(40);
		
		boton=new Button("Enviar");
		
		etiquetaEmail=new JLabel("Ingresa un correo:");
		etiqueta=new JLabel("");
		
		add(etiquetaEmail, BorderLayout.SOUTH);
		add(campoTexto);
		add(boton);
		add(etiqueta);
		
		boton.addActionListener(new comprobacionCorreo());
	}

	private class comprobacionCorreo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			int arroba=0, punto=0;
			
			String text=campoTexto.getText();
			
			for(int i=0; i<text.length();i++) {
				
				if(text.charAt(i)=='@') arroba++;
				if(text.charAt(i)=='.') punto++;
				
			}
			if(arroba==1 && punto>0) {
				etiqueta.setText("Email Correcto!");
			}
			else {
				etiqueta.setText("Email incorrecto");
			}
		}
		
	}
	
	private TextField campoTexto;
	private Button boton;
	private JLabel etiquetaEmail, etiqueta;
}