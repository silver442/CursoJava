package interfacesGraficas;

import java.awt.*;
import javax.swing.*;

public class claseBaseGraficos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco mimarco=new Marco();
	
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class Marco extends JFrame{
	
	public Marco() {
		
		setBounds(300,300,800,450);
		
		Lamina milamina=new Lamina();
		
		add(milamina);
		
		setVisible(true);
	}
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		
	}
}