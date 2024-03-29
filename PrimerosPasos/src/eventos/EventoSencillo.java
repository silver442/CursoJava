package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EventoSencillo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoBotonesColores mimarco=new MarcoBotonesColores();
		
		mimarco.setVisible(true);
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class MarcoBotonesColores extends JFrame{
	
	public MarcoBotonesColores() {
		
		setTitle("Botones y Eventos");
		
		setBounds(700,300,500,300);
		
		LaminaBotonesColores milamina=new LaminaBotonesColores();
		
		add(milamina);
	}
}

class LaminaBotonesColores extends JPanel {
	
	JButton botonAzul=new JButton("Azul"); 
	JButton botonRojo=new JButton("Rojo"); 
	JButton botonVerde=new JButton("Verde"); 
	
	public LaminaBotonesColores() {
		
		add(botonAzul);
		add(botonRojo);
		add(botonVerde);
		
		ColorDeFondo Azul=new ColorDeFondo(Color.BLUE);
		ColorDeFondo Rojo=new ColorDeFondo(Color.RED);
		ColorDeFondo Verde=new ColorDeFondo(Color.GREEN);
		
		botonAzul.addActionListener(Azul); // this para usar la propia lamina como quien recibe la acción
		botonRojo.addActionListener(Rojo);
		botonVerde.addActionListener(Verde);
	}
	
	private class ColorDeFondo implements ActionListener{

		public ColorDeFondo(Color c) {
			
			colorDeFondo=c;
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			setBackground(colorDeFondo);
		}
		
		private Color colorDeFondo;
		
		
	}

	
}

