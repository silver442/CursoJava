package eventos;
/*Usando Barra de Herramientas*/
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.*;

public class Varias_Fuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoFuentes2 mimarco=new MarcoFuentes2();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
	}

}

class MarcoFuentes2  extends JFrame{
	
	public MarcoFuentes2() {
		
		setBounds(600,300,500,350);
		
		milamina=new JPanel();
		
		//add(new LaminaFuentes2());
		
		add(milamina);
		
		//setVisible(true);
	/*}
}

class LaminaFuentes2 extends JPanel{
	
	public LaminaFuentes2(){
		
		/*JButton botonAzul=new JButton("Azul");
		JButton botonRojo=new JButton("Rojo");
		JButton botonVerde=new JButton("Verde");
		
		add(botonAzul);
		add(botonRojo);
		add(botonVerde);*/
		
		EventoColorFondo colorAzul=new EventoColorFondo("Azul", Color.BLUE, new ImageIcon("src/eventos/bolaAzul.png"));
		EventoColorFondo colorRojo=new EventoColorFondo("Rojo", Color.RED, new ImageIcon("src/eventos/bolaRoja.png"));
		EventoColorFondo colorVerde=new EventoColorFondo("Verde", Color.GREEN, new ImageIcon("src/eventos/bolaVerde.png"));
		
		/*add(new JButton(colorAzul));
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
		
		mapaAccion.put("fondo verde", colorVerde);*/
	
		JToolBar barra=new JToolBar();
		
		barra.add(colorAzul);
		barra.add(colorRojo);
		barra.add(colorVerde);
		
		add(barra, BorderLayout.NORTH);
	}

	private class EventoColorFondo extends AbstractAction{

		public EventoColorFondo(String nombre, Color color_fondo, Icon icon) {
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, icon);
			
			putValue(Action.SHORT_DESCRIPTION, "Pone la lámina o JPanel de color: " + nombre);
			
			putValue("color_fondo_JPanel", color_fondo);
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Color c=(Color)getValue("color_fondo_JPanel");
		
			milamina.setBackground(c);
			
			System.out.println("Nombre: "+ getValue(Action.NAME)+ " Descripcion " + getValue(Action.SHORT_DESCRIPTION));
		}
		
	}
	
	JPanel milamina;
}