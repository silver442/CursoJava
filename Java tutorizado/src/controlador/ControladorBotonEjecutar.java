package controlador;

import java.awt.event.*;
import java.sql.*;

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
	
		resultadoConsulta=obj.consultaBBDD(seleccionSeccion, seleccionPais);
		
		try {
		
			miFrame.getResultados().setText("");
			
			while(resultadoConsulta.next()) {
				
				for(int i=1;i<5;i++) {
					
					miFrame.getResultados().append(resultadoConsulta.getString(i));
					
					miFrame.getResultados().append(", ");
				
				}
				
				miFrame.getResultados().append("\n");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

	private MarcoMVC miFrame;
	
	private EjecutaConsultas obj=new EjecutaConsultas();
	
	private ResultSet resultadoConsulta;
}
