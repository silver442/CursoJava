package controlador;

import java.awt.event.*;
import java.sql.ResultSet;

import modelo.CargaMenus;
import vista.MarcoMVC;

public class ControladorCargaMenus extends WindowAdapter {

	public ControladorCargaMenus(MarcoMVC miJFrame) {
		
		this.miJFrame=miJFrame;
		
	}
	
	public void windowOpened(WindowEvent e) {
	
		resultadosCombos=new ResultSet[2];
		
		resultadosCombos=obj.ejecutaConsultas();
		
		try {
			
			resultadosCombos[0].previous();
			
			while(resultadosCombos[0].next()) {
				
				//miJFrame.secciones.addItem(resultadosCombos[0].getString(1));
			
				miJFrame.getSecciones().addItem(resultadosCombos[0].getString(1));
				
			}
			
			while(resultadosCombos[1].next()) {
				
				//miJFrame.paises.addItem(resultadosCombos[1].getString(1));
			
				miJFrame.getPaises().addItem(resultadosCombos[1].getString(1));
				
			
			}
			
		}catch(Exception ev) {
			
			ev.printStackTrace();
		}
	}
	
	
	CargaMenus obj=new CargaMenus();
	
	private MarcoMVC miJFrame;
	
	private ResultSet[] resultadosCombos;
}
