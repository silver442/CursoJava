package silvestre.BBDD;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.*;


public class AplicacionUniversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoBBDD miJFrame=new MarcoBBDD();
		
		miJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miJFrame.setVisible(true);
	}
}

class MarcoBBDD extends JFrame{
	
	public MarcoBBDD() {
		
		setBounds (300,300,700,700);
		
		PanelBBDD miPanel=new PanelBBDD();
		
		add(miPanel);
		
	}
}

class PanelBBDD extends JPanel{
	
	public PanelBBDD() {
		
		setLayout(new BorderLayout());
	
		tablas = new JComboBox();
	
		info=new JTextArea();
		
		add(tablas, BorderLayout.NORTH);
		
		add(info, BorderLayout.CENTER);
		
		conectaBBDD();
		
		nombreTablas();

		tablas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//System.out.println(tablas.getSelectedItem());
				
				ejecutaConsultaTablas((String)tablas.getSelectedItem());
			
			}
			
		});
		
		
	}
	
	public void conectaBBDD() {
		
		miConexion=null;

		String datosFichero[]=new String[3];
		
		
		try {
		
			accesoConf=new FileReader("C:/Users/silve/OneDrive/Escritorio/confBBDD.txt");
			
			BufferedReader miBuffer=new BufferedReader(accesoConf);
			
			for(int i=0;i<=2;i++) {
				
				datosFichero[i]=miBuffer.readLine();
				
			}
			
			//miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas","root","");
			
			miConexion=DriverManager.getConnection(datosFichero[0],datosFichero[1],datosFichero[2]);
			
		}catch(IOException e) {

			JOptionPane.showMessageDialog(this, "Revisa el archivo de configuración");
		
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void nombreTablas() {
		
		ResultSet miRs=null;
		
		try {
			
			// Obtención de los metadatos
			DatabaseMetaData datosBBDD=miConexion.getMetaData();
			
			// Obtener todas las tablas de la base de datos
			miRs=datosBBDD.getTables(null, null, null, null);
			
			while(miRs.next()) {
				
				//tablas.addItem(miRs.getString("TABLE_NAME"));
				
				// Excluir las tablas de las bases de datos del sistema
	            if (!esBaseDatosDelSistema(miRs.getString("TABLE_CAT"))) {
	                tablas.addItem(miRs.getString("TABLE_NAME"));
	            }

			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public void ejecutaConsultaTablas(String nombreTabla) {
		
		ArrayList<String> nCampos=new ArrayList<String>();
		
		String consulta="SELECT * FROM "+ nombreTabla;
		
		try {
			
			info.setText("");
			
			Statement miSt=miConexion.createStatement();
			
			ResultSet miRs=miSt.executeQuery(consulta);
			
			ResultSetMetaData rsBD=miRs.getMetaData();
			
			for(int i=1;i<rsBD.getColumnCount();i++) {
				
				nCampos.add(rsBD.getColumnName(i));
				
			}
			
			while(miRs.next()) {
				
				for(String infoCampo:nCampos) {
					
					info.append(miRs.getString(infoCampo)+"  ");
					
				}
				
				info.append("\n");
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	// Método para verificar si una base de datos es del sistema
	private boolean esBaseDatosDelSistema(String nombreBaseDatos) {
	    return nombreBaseDatos != null && 
	           (nombreBaseDatos.equalsIgnoreCase("information_schema") ||
	            nombreBaseDatos.equalsIgnoreCase("performance_schema") ||
	            nombreBaseDatos.equalsIgnoreCase("test") ||
	            nombreBaseDatos.equalsIgnoreCase("phpmyadmin") ||
	            nombreBaseDatos.equalsIgnoreCase("mysql"));
	}
	
	private JComboBox tablas;
	
	private JTextArea info;

	private Connection miConexion;

	private FileReader accesoConf;
}