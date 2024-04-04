package controlador;

import java.awt.event.*;

import modelo.EjecutaConsultas;
import vista.MarcoMVC;

public class ControladorBotonEjecutar implements ActionListener{

	
	
	public ControladorBotonEjecutar(MarcoMVC miFrame) {
		super();
		this.miFrame = miFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String seleccionSeccion=(String)miFrame.getSecciones().getSelectedItem();
		
		String seleccionPais=(String)miFrame.getPaises().getSelectedItem();
		
		miFrame.getResultados().append(obj.consultaBBDD(seleccionSeccion, seleccionPais));
	
		miFrame.getResultados().append("\n");
	}

	private MarcoMVC miFrame;
	
	private EjecutaConsultas obj=new EjecutaConsultas();
	
}
