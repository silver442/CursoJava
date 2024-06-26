package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class VariasFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoFuentes mimarco=new MarcoFuentes();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoFuentes  extends JFrame{
	
	public MarcoFuentes() {
		
		setBounds(600,300,500,350);
		
		add(new LaminaFuentes());
		
		setVisible(true);
	}
}

class LaminaFuentes extends JPanel{
	
	public LaminaFuentes(){
		
		/*JButton botonAzul=new JButton("Azul");
		JButton botonRojo=new JButton("Rojo");
		JButton botonVerde=new JButton("Verde");
		
		add(botonAzul);
		add(botonRojo);
		add(botonVerde);*/
		
		EventoColorFondo colorAzul=new EventoColorFondo("Azul", Color.BLUE);
		EventoColorFondo colorRojo=new EventoColorFondo("Rojo", Color.RED);
		EventoColorFondo colorVerde=new EventoColorFondo("Verde", Color.GREEN);
		
		add(new JButton(colorAzul));
		add(new JButton(colorRojo));
		add(new JButton(colorVerde));
		
		InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		//KeyStroke teclaAzul=KeyStroke.getKeyStroke("ctrl A");
		
		KeyStroke teclaRojo=KeyStroke.getKeyStroke("ctrl R");
		
		KeyStroke teclaVerde=KeyStroke.getKeyStroke("ctrl V");
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo azul");
		
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo azul");
		
		mapaEntrada.put(teclaRojo, "fondo rojo");
		
		mapaEntrada.put(teclaVerde, "fondo verde");
		
		ActionMap mapaAccion=getActionMap();
		
		mapaAccion.put("fondo azul", colorAzul);
		
		mapaAccion.put("fondo rojo", colorRojo);
		
		mapaAccion.put("fondo verde", colorVerde);
	}

	private class EventoColorFondo extends AbstractAction{

		public EventoColorFondo(String nombre, Color color_fondo) {
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SHORT_DESCRIPTION, "Pone la lámina o JPanel de color: " + nombre);
			
			putValue("color_fondo_JPanel", color_fondo);
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Color c=(Color)getValue("color_fondo_JPanel");
		
			setBackground(c);
			
			System.out.println("Nombre: "+ getValue(Action.NAME)+ " Descripcion " + getValue(Action.SHORT_DESCRIPTION));
		}
		
	}
}