package componentesSwing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AreasTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoAreaTexto mimarco=new MarcoAreaTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class  MarcoAreaTexto extends JFrame{
	
	public MarcoAreaTexto() {
		
		setBounds(600,300,600,400);
		
		add(new LaminaAreaTexto());
		
		setVisible(true);
		
	}
}

class LaminaAreaTexto extends JPanel{
	
	public LaminaAreaTexto() {
		
		JTextArea miareaTexto=new JTextArea(7,25);
		
		// el area te dexto se agrega al JScrollPane
		JScrollPane laminaScroll=new JScrollPane(miareaTexto);
		
		// para que haga un salto de linea al llegaral final
		miareaTexto.setLineWrap(true); 
		
		add(laminaScroll);
		
		JButton miBoton=new JButton("Dale!");
		
		add(miBoton);
		
		miBoton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				System.out.println(miareaTexto.getText());
			
			}
			
		});
	}
}
