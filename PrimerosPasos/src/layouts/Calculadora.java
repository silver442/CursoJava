package layouts;

import java.awt.*;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCalculadora mimarco=new MarcoCalculadora();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora() {
		
		setTitle("Calculadora");
	
		setBounds(500,300,450,300);
		
		PanelCalculadora milamina=new PanelCalculadora();
		
		add(milamina);
	}
}

class PanelCalculadora extends JPanel{
	
	public PanelCalculadora() {
		
		setLayout(new BorderLayout());
		
		JButton pantalla=new JButton("0");
		
		pantalla.setEnabled(false);
		
		add(pantalla, BorderLayout.NORTH);
		
		JPanel numeracion=new JPanel();
		
		numeracion.setLayout(new GridLayout(4,4));
		
	}
}