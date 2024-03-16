package ejercicioComponentes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;

public class EjercicioProcesadorTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FrameProcesadorTexto miMarco=new FrameProcesadorTexto();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class FrameProcesadorTexto extends JFrame{
	
	public FrameProcesadorTexto() {
		
		setBounds(600,300, 600, 400);
		
		add(new LaminaProcesadorTexto());
		
		setVisible(true);
		
	}
	
}

class LaminaProcesadorTexto extends JPanel{
	
	public LaminaProcesadorTexto() {
		
		setLayout(new BorderLayout());

		JPanel laminaMenu=new JPanel();
		
		//-------Construcción bara de menú--------------
		
		JMenuBar miBarra=new JMenuBar();
		
		fuente=new JMenu("Fuente");
		estilo=new JMenu("Estilo");
		tamagno=new JMenu("Tamaño");
		
		configuraMenu("Arial", "fuente", "Arial", 1,12);
		configuraMenu("Courier", "fuente", "Courier", 1,12);
		configuraMenu("Verdana", "fuente", "Verdana", 1,12);
		
		miBarra.add(fuente);
		miBarra.add(estilo);
		miBarra.add(tamagno);
		
		//------------------------------------------------
		
		configuraMenu("Negrita", "estilo", "", Font.BOLD,12);
		configuraMenu("Cursiva", "estilo", "", Font.ITALIC,12);
		
		// --------------------------------------------------
		
		configuraMenu("12", "tamaño", "", 1,12);
		configuraMenu("16", "tamaño", "", 1,16);
		configuraMenu("20", "tamaño", "", 1,20);
		configuraMenu("24", "tamaño", "", 1,24);
		
		//------------------------------------------------
		
		laminaMenu.add(miBarra);
		
		add(laminaMenu, BorderLayout.NORTH);
		
		miArea=new JTextPane();
		
		add(miArea, BorderLayout.CENTER);
		
		
		//------------Barra de Herramienta-----------------
		
		EventoColorFondo colorAzul=new EventoColorFondo("Azul", Color.BLUE, new ImageIcon("src/eventos/bolaAzul.png"));
		EventoColorFondo colorRojo=new EventoColorFondo("Rojo", Color.RED, new ImageIcon("src/eventos/bolaRoja.png"));
		EventoColorFondo colorVerde=new EventoColorFondo("Verde", Color.GREEN, new ImageIcon("src/eventos/bolaVerde.png"));
		
		EventoLetra letraNegrita = new EventoLetra("Negrita","Negrita", new ImageIcon("src/ejercicioComponentes/letraN.png"));
		
		JToolBar barra=new JToolBar(JToolBar.VERTICAL);
		
		barra.add(colorAzul);
		barra.add(colorRojo);
		barra.add(colorVerde);
		
		barra.add(letraNegrita);
		
		add(barra, BorderLayout.WEST);
	}
	
	public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tamagnos) {
		
		JMenuItem elemMenu=new JMenuItem(rotulo);
		
		if(menu=="fuente") {
			
			fuente.add(elemMenu);
		
			elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaLetra", tipoLetra));
			
		}
		
		else if(menu=="estilo") {
			
			estilo.add(elemMenu);
		
			if(estilos==Font.BOLD) elemMenu.addActionListener(new StyledEditorKit.BoldAction());
			
			else elemMenu.addActionListener(new StyledEditorKit.ItalicAction());
		}
	
		else if(menu=="tamaño") {
			
			tamagno.add(elemMenu);
		
			elemMenu.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño", tamagnos));
		}
		
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
		
			miArea.setBackground(c);
			
			System.out.println("Nombre: "+ getValue(Action.NAME)+ " Descripcion " + getValue(Action.SHORT_DESCRIPTION));
		}
		
	}
	
	private class EventoLetra extends AbstractAction{

		
		public EventoLetra(String nombre, String tipoLetra, Icon icono) {
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Pone la letra en: " + nombre);
			
			putValue("tipo_letra", tipoLetra);
			
		}
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		
	}
	
	private JTextPane miArea;
	private JMenu fuente, estilo, tamagno;

	private Font letraExistente;
}
