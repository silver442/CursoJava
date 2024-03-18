package ejercicioComponentes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.*;
import javax.swing.text.StyledEditorKit;

public class EjercicioProcesadorTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FrameProcesadorTexto miMarco = new FrameProcesadorTexto();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class FrameProcesadorTexto extends JFrame {

	public FrameProcesadorTexto() {

		setBounds(600, 300, 600, 500);

		add(new LaminaProcesadorTexto());

		setVisible(true);

	}

}

class LaminaProcesadorTexto extends JPanel {

	public LaminaProcesadorTexto() {

		setLayout(new BorderLayout());

		JPanel laminaMenu = new JPanel();
		
		JMenuBar miBarra = new JMenuBar();
		
		// -------Construcción bara de menú--------------

		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamagno = new JMenu("Tamaño");

		configuraMenu("Arial", "fuente", "Arial", 9, 10, "");
		configuraMenu("Courier", "fuente", "Courier", 9, 10, "");
		configuraMenu("Verdana", "fuente", "Verdana", 9, 10, "");

		// ------------------------------------------------

		configuraMenu("Negrita", "estilo", "", Font.BOLD, 1, "src/EjercioComponentes/letraN.png");
		configuraMenu("Cursiva", "estilo", "", Font.ITALIC, 1, "src/EjercioComponentes/letraK.png");

		// --------------------------------------------------
		
		ButtonGroup tamagno_letra=new ButtonGroup();
		
		JRadioButtonMenuItem doce=new JRadioButtonMenuItem("12");
		JRadioButtonMenuItem dieciseis=new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem veinte=new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem veinticuatro=new JRadioButtonMenuItem("24");
		
		tamagno_letra.add(doce);
		tamagno_letra.add(dieciseis);
		tamagno_letra.add(veinte);
		tamagno_letra.add(veinticuatro);
		
		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 12));
		dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 16));
		veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 20));
		veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 24));
		
		tamagno.add(doce);
		tamagno.add(dieciseis);
		tamagno.add(veinte);
		tamagno.add(veinticuatro);
		
		// ------------------------------------------------

		miBarra.add(fuente);
		miBarra.add(estilo);
		miBarra.add(tamagno);
		
		laminaMenu.add(miBarra);

		add(laminaMenu, BorderLayout.NORTH);

		miArea = new JTextPane();

		add(miArea, BorderLayout.CENTER);

		JPopupMenu emergente=new JPopupMenu();
		
		JMenuItem negritaE=new JMenuItem("Negrita");
		JMenuItem cursivaE=new JMenuItem("Cursiva");
		
		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		
		emergente.add(negritaE);
		emergente.add(cursivaE);
		
		miArea.setComponentPopupMenu(emergente);
		
		// ------------Barra de Herramienta-----------------

		barra=new JToolBar();
		
		configura_barra("src/ejercicioComponentes/letraN.png").addActionListener(new StyledEditorKit.BoldAction());
		configura_barra("src/ejercicioComponentes/letraK.png").addActionListener(new StyledEditorKit.ItalicAction());
		configura_barra("src/ejercicioComponentes/letraSLine.png").addActionListener(new StyledEditorKit.UnderlineAction());

		barra.addSeparator();
		
		configura_barra("src/eventos/bolaAzul.png").addActionListener(new StyledEditorKit.ForegroundAction("Pne_azul", Color.BLUE));
		configura_barra("src/eventos/bolaRoja.png").addActionListener(new StyledEditorKit.ForegroundAction("Pne_rojo", Color.RED));
		configura_barra("src/eventos/bolaAmarilla.png").addActionListener(new StyledEditorKit.ForegroundAction("Pne_amarillo", Color.YELLOW));

		barra.addSeparator();		
		
		configura_barra("src/ejercicioComponentes/alinear-izquierda.png").addActionListener(new StyledEditorKit.AlignmentAction("Izquierda", 0));
		configura_barra("src/ejercicioComponentes/alineacion-central.png").addActionListener(new StyledEditorKit.AlignmentAction("Centrado", 1));
		configura_barra("src/ejercicioComponentes/alineacion-derecha.png").addActionListener(new StyledEditorKit.AlignmentAction("Derecha", 2));
		configura_barra("src/ejercicioComponentes/alineacion-justificada.png").addActionListener(new StyledEditorKit.AlignmentAction("Justificado", 3));
		
		barra.setOrientation(1);
		
		add(barra, BorderLayout.WEST);
	}
	
	public JButton configura_barra(String ruta) {
		
		JButton boton=new JButton(new ImageIcon(ruta));
		
		barra.add(boton);
		
		return boton;
	}
	

	public void configuraMenu(String rotulo, String menu, String tipo_letra, int estilos, int tam, String ruta_icono) {

		JMenuItem elemMenu = new JMenuItem(rotulo, new ImageIcon(ruta_icono));

		if (menu == "fuente") {

			fuente.add(elemMenu);

			if(tipo_letra=="Arial") {
				
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Arial"));
				
			}else if(tipo_letra=="Courier") {
				
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Courier"));
				
			}else if(tipo_letra=="Verdana") {
				
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Verdana"));
				
			}
		}

		else if (menu == "estilo") {

			estilo.add(elemMenu);

			if (estilos == Font.BOLD) {
				
				elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));;
				
				elemMenu.addActionListener(new StyledEditorKit.BoldAction());
			
			}else if(estilos==Font.ITALIC) {
			
				elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));;				
				
				elemMenu.addActionListener(new StyledEditorKit.ItalicAction());

			}else if(menu=="tamaño") {
				
				tamagno.add(elemMenu);
				
				elemMenu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", tam));

			}

		}

	}
	
	private JTextPane miArea;
	private JMenu fuente, estilo, tamagno;
	private Font letras;
	
	JButton negritaBarra, cursivaBarra, subraBarra, azulBarra, amarilloBarra, a_izquierda, a_centrado, a_derecha, a_justificado;
	JToolBar barra;
}
