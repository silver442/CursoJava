package disposicionesSwing;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisposicionLibre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoDispLibre mimarco=new MarcoDispLibre();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}

}

class MarcoDispLibre extends JFrame{
	
	public MarcoDispLibre() {
		
		setBounds(450,350,350,400);
		
		LaminaDispLibre milamina=new LaminaDispLibre();
		
		add(milamina);
		
		setVisible(true);
	}
}

class LaminaDispLibre extends JPanel{
	
	public LaminaDispLibre() {
		
	}
		
	
}