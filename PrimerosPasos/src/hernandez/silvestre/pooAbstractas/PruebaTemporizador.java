package hernandez.silvestre.pooAbstractas;

import java.awt.event.*;
import java.util.Date;

import javax.swing.*;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Temporizador oyente =new Temporizador();
		
		Timer miTemporizador=new Timer(5000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				Date horaActual=new Date();
				
				System.out.println(horaActual);
			}	
			
		});
		
		miTemporizador.start();
		
		JOptionPane.showConfirmDialog(null, "Pulsa aceptar para detener");
	}

}

/*class Temporizador implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Date horaActual=new Date();
		
		System.out.println(horaActual);
	}
}*/