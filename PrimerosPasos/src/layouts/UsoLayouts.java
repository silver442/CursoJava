package layouts;

import java.awt.*;

import javax.swing.*;

public class UsoLayouts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaroConLayout miMarco=new MaroConLayout();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}

class MaroConLayout extends JFrame{
	
	
	public MaroConLayout(){
		
		setTitle("Disposiciones");
		
		setBounds(600,350,600,300);
		
		PanelconLayout lamina=new PanelconLayout();
		
		PanelConLayout2 lamina2=new PanelConLayout2();
		//FlowLayout disposicion=new FlowLayout(FlowLayout.RIGHT);
		
		//lamina.setLayout(disposicion); // disposicion a la derecha
		
		//lamina.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		add(lamina, BorderLayout.SOUTH);
	
		add(lamina2, BorderLayout.NORTH);
	}
	
}

class PanelconLayout extends JPanel{
	
		public PanelconLayout(){
			// disposicion al centro, con gap horizonta, vertical
			//setLayout(new FlowLayout(FlowLayout.CENTER, 50, 150));
			
			setLayout(new BorderLayout()); // 10 de Gap	
			
			add(new JButton("Azul"), BorderLayout.EAST);	
			
			add(new JButton("Verde"), BorderLayout.WEST);	
			
			add(new JButton("Morado"), BorderLayout.CENTER);
			
		}
}

class PanelConLayout2 extends JPanel{
	
	public PanelConLayout2() {
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JButton("Amarillo"));
		
		add(new JButton("Rojo"));
	}
}