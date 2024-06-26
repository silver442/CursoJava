package ejercicioComponentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EjercicioComponentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoComponentes mimarco=new MarcoComponentes();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoComponentes extends JFrame{
	
	public MarcoComponentes() {
		
		setBounds(600,200, 550, 300);
		
		add(new LaminaComponentes());
		
		setVisible(true);
	}

}

class LaminaComponentes extends JPanel{
	
	public LaminaComponentes(){
		
		setLayout(new BorderLayout());
		
		JPanel superior=new JPanel();
		JPanel central=new JPanel();
		JPanel inferior=new JPanel();
		
		etiqNombre = new JLabel("Nombre:");
		etiqApellido = new JLabel("Apellido:");
		
		cuadroNombre= new JTextField(15);
		cuadroApellido= new JTextField(15);
	
		superior.add(etiqNombre);
		superior.add(cuadroNombre);
		superior.add(etiqApellido);
		superior.add(cuadroApellido);
		
		area= new JTextArea(10,41);
		JScrollPane laminaScroll=new JScrollPane(area);
		area.setLineWrap(true);
		central.add(laminaScroll);
		
		btnLimpiar=new JButton("Limpiar");
		btnLimpiar.addActionListener(new EventoComponentes());
		central.add(btnLimpiar);
		
		boton1= new JButton("Boton1");
		boton2= new JButton("Boton2");
		
		casilla1=new JCheckBox("casilla1");
		casilla2=new JCheckBox("casilla2");
		casilla1.setSelected(true);
		
		ButtonGroup grupo1=new ButtonGroup();
		
		radio1=new JRadioButton("Radio1");
		radio2=new JRadioButton("Radio2");
		
		grupo1.add(radio1);
		grupo1.add(radio2);
		
		inferior.add(boton1);
		inferior.add(boton2);
		inferior.add(casilla1);
		inferior.add(casilla2);
		inferior.add(radio1);
		inferior.add(radio2);
		
		boton1.addActionListener(new EventoComponentes());
		boton2.addActionListener(new EventoComponentes());
		casilla1.addActionListener(new EventoComponentes());
		casilla2.addActionListener(new EventoComponentes());
		radio1.addActionListener(new EventoComponentes());
		radio2.addActionListener(new EventoComponentes());
		
		add(superior, BorderLayout.NORTH);
		add(central, BorderLayout.CENTER);
		add(inferior, BorderLayout.SOUTH);
		
	}
	
	private class EventoComponentes implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(contador) {
				area.append(cuadroNombre.getText() + " " + cuadroApellido.getText() 
				+" y refleja las siguientes acciones \n");
				contador=false;
			}
			
			if(e.getSource()==boton1)area.append("Botón 1 pulsado \n");
			else if(e.getSource()==boton2) area.append("Botón 2 pulsado\n");
			else if(e.getSource()==casilla1) {
				if(casilla1.isSelected()) area.append("Casilla 1 activada\n");
				else area.append("Casilla 1 desactivada\n");
			}
			else if(e.getSource()==casilla2 && casilla2.isSelected()) area.append("Casilla 2 activada\n");
			else if(!casilla2.isSelected()) area.append("Casilla 2 desactivada\n");
			else if(e.getSource()==radio1) {
				if(radio1.isSelected() ) area.append("Radio 1 activado\n");
				else area.setText("Radio 1 desactivado\n");
			}
			else if(e.getSource()==radio2) {
				if(radio1.isSelected()) area.append("Radio 2 activada\n");
				else area.append("Radio 2 desactivado\n");
			}
			
			if(e.getSource()==btnLimpiar) area.setText("");
		}
	}
	
	private JLabel etiqNombre, etiqApellido;
	private JTextField cuadroNombre, cuadroApellido;
	private JTextArea area;
	private JButton boton1, boton2, btnLimpiar;
	private JCheckBox casilla1, casilla2;
	private JRadioButton radio1, radio2;

	private static boolean contador=true;
}