package hernandez.silvestre.jdbc;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PracticaJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoJdbc mimarco=new MarcoJdbc();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class MarcoJdbc extends JFrame{
	
	public MarcoJdbc() {
		
		setTitle("practica JDBC");
		
		setBounds(200,200,400,450);
		
		PanelJdbc miPanel=new PanelJdbc();
		
		add(miPanel);
		
		setVisible(true);
		
	}
}

class PanelJdbc extends JPanel{
	
	public PanelJdbc() {
		
		setLayout(new BorderLayout());
		
		JPanel panelNorte =new JPanel();
		
		miCombo1 = new JComboBox();
	
		miCombo1.addItem("Todos");
		
		panelNorte.add(miCombo1);
		
		miCombo2 = new JComboBox();
		
		miCombo2.addItem("Todos");
		
		panelNorte.add(miCombo2);
		
		miArea=new JTextArea(10,25);
		
		btnConsultar=new JButton("Consultar");
		
		btnConsultar.addActionListener(new eventBoton());
		
		add(panelNorte, BorderLayout.NORTH);
		
		add(miArea, BorderLayout.CENTER);
		
		add(btnConsultar, BorderLayout.SOUTH);
		
	}

	private class eventBoton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println("boton a la escucha..." + miCombo1.getSelectedItem());
		
			miArea.setText(miCombo1.getSelectedItem().toString());
		
		}
	}
	
	JComboBox miCombo1, miCombo2;
	
	JTextArea miArea;
	
	JButton btnConsultar;
	
}