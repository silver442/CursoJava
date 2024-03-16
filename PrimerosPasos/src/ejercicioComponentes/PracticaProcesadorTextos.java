package ejercicioComponentes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;

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
	
		//elemMenu.addActionListener(new GestionaEventos(rotulo, tipoLetra, estilos, tamagnos));
		
		
	}
	
	/*
	private class GestionaEventos implements ActionListener{

		GestionaEventos(String rotulo, String tipoLetra, int estilos, int tamagnos) {
			
			this.tipoLetra=tipoLetra;
			this.estilos=estilos;
			this.tamagnos=tamagnos;
			this.rotulo=rotulo; // item
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			letraExistente=miArea.getFont(); // para obtener la fuente del JTextPane
			
			if(rotulo=="Arial" || rotulo=="Courier" || rotulo=="Verdana") {
				
				estilos=letraExistente.getStyle();
				
				tamagnos=letraExistente.getSize();
				
			}else if(rotulo=="Cursiva" || rotulo=="Negrita") {
				
				if(letraExistente.getStyle()==1 || letraExistente.getStyle()==2) estilos=3;
				
				tipoLetra=letraExistente.getFontName();
				
				tamagnos=letraExistente.getSize();
			}else if(rotulo=="12" || rotulo=="16" || rotulo=="20" || rotulo=="24") {
				
				tipoLetra=letraExistente.getFontName();
				
				estilos=letraExistente.getStyle();
				
			}
			
			miArea.setFont(new Font(tipoLetra, estilos, tamagnos));
		
		}
		
		String tipoLetra, rotulo;
		int estilos, tamagnos;
	}*/
	
	private JTextPane miArea;
	private JMenu fuente, estilo, tamagno;

	private Font letraExistente;
}