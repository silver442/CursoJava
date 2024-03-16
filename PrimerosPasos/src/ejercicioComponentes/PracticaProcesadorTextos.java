package ejercicioComponentes;

import java.awt.*;

import javax.swing.*;

public class PracticaProcesadorTextos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoProcesadorTexto mimarco=new MarcoProcesadorTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoProcesadorTexto extends JFrame{
	
	public MarcoProcesadorTexto() {
		
		setBounds(600, 300, 600, 400);
		
		add(new LaminaProcesadorTextos());
		
		setVisible(true);
	}
}

class LaminaProcesadorTextos extends JPanel{
	
	public LaminaProcesadorTextos() {
		
		setLayout(new BorderLayout());
		
		JPanel laminaMenu=new JPanel();
		
		//-------Construcción bara de manú--------------
		
		JMenuBar miBarra=new JMenuBar();
		
		JMenu fuente=new JMenu("Fuente");
		JMenu estilo=new JMenu("Estilo");
		JMenu tamagno=new JMenu("Tamaño");
		
		miBarra.add(fuente);
		miBarra.add(estilo);
		miBarra.add(tamagno);
		
		//------------------------------------------------
		//----------- Elementos de menú fuente-------------
		
		JMenuItem arial=new JMenuItem("Arial");
		JMenuItem courier=new JMenuItem("Courier");
		JMenuItem verdana=new JMenuItem("Verdana");
		
		fuente.add(arial);
		fuente.add(courier);
		fuente.add(verdana);
		
		//------------------------------------------------
		
		//----------- Elementos de menú estilos-------------
		
		JMenuItem negrita=new JMenuItem("Negrita");
		JMenuItem cursiva=new JMenuItem("Cursiva");
		
		estilo.add(negrita);
		estilo.add(cursiva);
		
		
		//------------------------------------------------
		
		//----------- Elementos de menú Tamaño-------------
		
		JMenuItem tam_12=new JMenuItem("12");
		JMenuItem tam_16=new JMenuItem("16");
		JMenuItem tam_18=new JMenuItem("18");
		JMenuItem tam_20=new JMenuItem("20");
		
		tamagno.add(tam_12);
		tamagno.add(tam_16);
		tamagno.add(tam_18);
		tamagno.add(tam_20);
		
		//------------------------------------------------
		
		laminaMenu.add(miBarra);
		
		add(laminaMenu, BorderLayout.NORTH);
		
	}
}