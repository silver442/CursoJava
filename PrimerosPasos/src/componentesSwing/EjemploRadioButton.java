package componentesSwing;

import javax.swing.*;
import java.awt.event.*;

public class EjemploRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoRadioButton mimarco=new MarcoRadioButton();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRadioButton extends JFrame{
	
	public MarcoRadioButton() {
		
		setBounds(600,300,600,400);
		
		add(new LaminaRadioButton());
		
		setVisible(true);
			
	}
}

class LaminaRadioButton extends JPanel{
	
	public LaminaRadioButton() {
		
		// Crear grupos de botones
		ButtonGroup miGrupo1=new ButtonGroup();
		
		boton1=new JRadioButton("Masculino");
		boton2=new JRadioButton("Femenino");
		boton3=new JRadioButton("Neutro");
		
		boton1.addActionListener(new ManejaRadioButton());
		
		miGrupo1.add(boton1);
		miGrupo1.add(boton2);
		miGrupo1.add(boton3);
		
		add(boton1);
		add(boton2);
		add(boton3);
		
	}
	
	private class ManejaRadioButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			// if(boton1.isSelected()) System.out.println("Has seleccionado la opcion Masculino");
		
			// getSource devuelve el origen del evento
			if(e.getSource()==boton1) System.out.println("Haz seleccionado masculino");
		}
		
	}
	
	private JRadioButton boton1, boton2, boton3;
}