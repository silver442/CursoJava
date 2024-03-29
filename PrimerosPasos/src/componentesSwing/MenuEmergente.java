package componentesSwing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuEmergente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmergenteFrame mimarco=new EmergenteFrame();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class EmergenteFrame extends JFrame{
	
	public EmergenteFrame() {
		
		setBounds(600, 350, 600, 350);
		
		add(new EmergentePanel());
		
		setVisible(true);
	}
}

class EmergentePanel extends JPanel{
	
	public EmergentePanel() {
		
		JPopupMenu emergente=new JPopupMenu();
		
		JMenuItem azul=new JMenuItem("Azul");
		JMenuItem verde=new JMenuItem("Verde");
		JMenuItem rojo=new JMenuItem("Rojo");
		
		azul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
				setBackground(Color.BLUE);
				
			}
			
		});
		
		verde.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				setBackground(Color.GREEN);
				
			}
		});
		

		rojo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				setBackground(Color.RED);
				
			}
		});
		
		emergente.add(azul);
		emergente.add(verde);
		emergente.add(rojo);
		
		setComponentPopupMenu(emergente);
		
	}
}

