package hernandez.silvestre.pooAbstractas;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reloj mireloj=new Reloj();
		
		mireloj.ejecutarTemporizador(3000,true);
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
	}
}

class Reloj{
	
	public void ejecutarTemporizador(int intervalo, boolean sonido) {
	
		/*class DameLaHora implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Date ahora=new Date();
				
				System.out.println("Te pongo la hora cada 3 segundos " + ahora);
			
				if(sonido) Toolkit.getDefaultToolkit().beep();
			}
			
		}
		
		ActionListener oyente=new DameLaHora();*/
		
		Timer miTemporizador=new Timer(intervalo, new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				Date ahora=new Date();
				
				System.out.println("Te pongo la hora cada 3 segundos " + ahora);
			
				if(sonido) Toolkit.getDefaultToolkit().beep();
			}
			
		});
	
		miTemporizador.start();
	
	
	}
	
}