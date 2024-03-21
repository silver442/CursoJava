package ejercicioficheros;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class EscribiendoLeyendoFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoStream miMarco=new MarcoStream();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class MarcoStream extends JFrame{

	public MarcoStream(){
		
		setBounds(200,200, 600, 350);
		
		PanelStream miPanel=new PanelStream();
		
		add(miPanel);
		
		setVisible(true);
	}
	
}

class PanelStream extends JPanel{
	
	public PanelStream() {
		
		setLayout(new BorderLayout());
		
		miArea=new JTextArea();
		
		JPanel panelBotones=new JPanel();
		
		escribir=new JButton("Escribir");
		borrar=new JButton("Borrar");
		leer=new JButton("Leer");
		
		escribir.addActionListener(new eventoStream());
		borrar.addActionListener(new eventoStream());
		leer.addActionListener(new eventoStream());
		
		
		add(miArea, BorderLayout.CENTER);
		
		panelBotones.add(escribir);
		panelBotones.add(borrar);
		panelBotones.add(leer);

		add(panelBotones, BorderLayout.SOUTH);
	
	}
	
	private class eventoStream implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource()==escribir) {
				EscribiendoFichero escribeFichero=new EscribiendoFichero();
				
				escribeFichero.escribirFichero(miArea.getText());
			
			}else if(e.getSource()==borrar) {
			
				miArea.setText("");
				
			}else {
				
				leerFichero miFichero=new leerFichero();
				
				miArea.setText(miFichero.leeFichero());
				
			}
			
		}
		
	}
	
	
	private JTextArea miArea;
	
	private JButton escribir, borrar, leer;
}

class EscribiendoFichero{
	
	public void escribirFichero(String texto) {
		
		String text=texto;
		
		try {
			
			FileWriter escritura=new FileWriter("C:/Users/silve/Downloads/FicheroPrueba.txt", true);
		
			for(int i=0;i<text.length();i++) {
				
				escritura.write(text.charAt(i));
			}
			
			escritura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}

class leerFichero{
	
	public String leeFichero() {
		
		try {
			
			String palabra="";
			
			FileReader entrada=new FileReader("C:/Users/silve/Downloads/FicheroPrueba.txt");
		
			int caracter=entrada.read();
			
			while(caracter!=-1) {
				
				//System.out.print((char)caracter);
				
				palabra+=(char)caracter;
				
				caracter=entrada.read();
			}
			
			entrada.close();
			return palabra;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
			
	}
}
