package interfacesGraficas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoTexto miMarco=new MarcoTexto();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	}

}

class  MarcoTexto extends JFrame{
	
	public MarcoTexto() {
		
		setBounds(400, 200, 600, 450);
		
		setTitle("Escritura en JFrame");
		
		setVisible(true);
		
		PrimerPanel milamina=new PrimerPanel();
		
		add(milamina); // agregamos la lamina al Marco
	}
}

class PrimerPanel extends JPanel{
	
	public PrimerPanel() {
		
		setBackground(new Color(195));
	}
	
	
	public void paintComponent(Graphics g) { // método que se invoca automaticamente
		
		super.paintComponent(g);
		
		Color micolor=new Color(0,54,92);
		
		g.setColor(micolor);
		
		Font miletra=new Font("Verdana", 3, 30);
		
		g.setFont(miletra);
		
		g.drawString("Primer panel", 40, 50);

	}
}