package componentesSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EjemploMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoJMenu mimarco=new MarcoJMenu();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class MarcoJMenu extends JFrame{
	
	public MarcoJMenu() {
		
		setBounds(600, 300, 600, 400);
		
		add(new LaminaJMenu());
		
		setVisible(true);
	}
}

class LaminaJMenu extends JPanel{
	
	public LaminaJMenu() {
	
		JMenuBar miBarra=new JMenuBar();
		
		//--------------Aquí irán los elementos del menú-----------
		
		JMenu archivo =new JMenu("Archivo");
		JMenu edicion =new JMenu("Edición");
		JMenu herramientas =new JMenu("Herramientas");
	
		miBarra.add(archivo);
		miBarra.add(edicion);
		miBarra.add(herramientas);
		
		//------------Aquí irían los elementos de archivo----------
		
		JMenuItem guardar=new JMenuItem("Guardar");
		JMenuItem guardarComo=new JMenuItem("Guardar Como");
		
		guardarComo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Has pulsado en guardar Cómo");
			}
			
		});
		
		archivo.add(guardar);
		archivo.add(guardarComo);
		
		//-----------Aquí irán los elementos de edición ----------
		
		JMenuItem cortar=new JMenuItem("Cortar");
		JMenuItem copiar=new JMenuItem("Copiar");
		JMenuItem pegar=new JMenuItem("Pegar");
		
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		
		//--------- Aquí irán los elementos de herramientas -----------
		
		JMenuItem opciones=new JMenuItem("Opciones");
		JMenu preferencias =new JMenu("Preferencias");
		
		herramientas.add(opciones);
		herramientas.addSeparator(); // agrega un separador
		herramientas.add(preferencias);
		
		//---------Aquí irán las opciones de preferencias ----------------
		
		JMenuItem ayuda=new JMenuItem("Ayuda");
		JMenuItem generales=new JMenuItem("Generales");
		
		preferencias.add(ayuda);
		preferencias.add(generales);
		
		add(miBarra);
	}
}