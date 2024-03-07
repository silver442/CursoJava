package ejerciciosInterfacesGraficas;

import javax.swing.JFrame;

public class EjercicioFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstruirVentana Frame=new ConstruirVentana(3);
		
		
	}
}

class MiFrame extends JFrame{
	
	public MiFrame(int x, int y, String titulo) {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setBounds(x,y,350,350);
	
		setTitle(titulo);
		
		setVisible(true);
		
	}
}

class ConstruirVentana{
	
	public ConstruirVentana(int num){
		
		MiFrame []miFrame=new MiFrame[num];
		
		for(int i=0;i<num;i++) {
			
			miFrame[i]=new MiFrame((150*(i+1)),(150*(i+1)), "Ventana " + (i+1));
			
		}
	}
}