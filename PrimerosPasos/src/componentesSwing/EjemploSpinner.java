package componentesSwing;

import java.awt.Dimension;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EjemploSpinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoJSpinner mimarco=new MarcoJSpinner();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class MarcoJSpinner extends JFrame{
	
	public MarcoJSpinner() {
		
		setBounds(600, 300, 600, 400);
		
		add(new LaminaJSpinner());
		
		setVisible(true);
	}
}

class LaminaJSpinner extends JPanel{
	
	public LaminaJSpinner() {
		
		String meses[]= {"Enero", "Febrero", "Marzo", "Abril"};
		
		// JSpinner control=new JSpinner(new SpinnerListModel(meses));
		
		JSpinner control=new JSpinner(new SpinnerNumberModel(5, -5, 15,1));
				
		//Dimension d=new Dimension(100,20);
		
		control.setPreferredSize(new Dimension(100,20));
		
		control.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				
				// Imprime los valores que tiene el Spinner
				System.out.println(control.getValue());
				
			}
			
		});
		
		add(control);
		
	}
}