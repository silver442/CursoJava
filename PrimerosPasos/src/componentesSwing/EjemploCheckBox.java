package componentesSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCheckBox mimarco=new MarcoCheckBox();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoCheckBox extends JFrame{
	
	public MarcoCheckBox() {
		
		setBounds(600, 300, 600, 400);
		
		add(new LaminaCheckBox());
		
		setVisible(true);
		
	}
	
	
}

class LaminaCheckBox extends JPanel{
	
	public LaminaCheckBox() {
		
		setLayout(new BorderLayout());
	
		texto=new JLabel("Hola alumnos de Java");
		
		texto.setFont(new Font("Courier", Font.PLAIN, 24));
		
		JPanel superior=new JPanel();
		
		JPanel inferior=new JPanel();
		
		superior.add(texto);
		
		checkboxNegrita=new JCheckBox("Negrita");
		
		checkboxCursiva=new JCheckBox("Negrita");
		
		checkboxCursiva.addActionListener(new ManejaChecks());
		
		checkboxNegrita.addActionListener(new ManejaChecks());
		
		inferior.add(checkboxCursiva);
		inferior.add(checkboxNegrita);
	
		add(superior, BorderLayout.NORTH);
		add(inferior, BorderLayout.SOUTH);
	}
	
	private class ManejaChecks implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
			int negrita_cursiva=0;
			
			if(checkboxNegrita.isSelected()) negrita_cursiva+=Font.BOLD;
			
			if(checkboxCursiva.isSelected()) negrita_cursiva+=Font.ITALIC;
			
			texto.setFont(new Font("Courier", negrita_cursiva, 24));
		}
		
	}
	
	private JCheckBox checkboxNegrita, checkboxCursiva;
	
	private JLabel texto;
}