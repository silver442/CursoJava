package interfacesGraficas;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ManejoImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoImagenes mimarco=new MarcoImagenes();
	
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class MarcoImagenes extends JFrame{
	
	public MarcoImagenes() {
		
		setBounds(300,300,800,450);
		
		LaminaImagenes milamina=new LaminaImagenes();
		
		add(milamina);
		
		setVisible(true);
	}
}

class LaminaImagenes extends JPanel{
	
	public void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		
		File miImagen=new File("src/interfacesGraficas/sol.gif");
		
		try {
			imagen=ImageIO.read(miImagen);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			
			System.out.println("Lo siento la imagen no se ha encontrado");
		}
	
		int anchuraImagen=imagen.getWidth(this);
		
		int alturaImagen=imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
		
		for(int i=0;i<800;i++) {
			
			for(int j=0;j<450;j++) {
				
				g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
				
			}
			
		}
		
	}
	
	private Image imagen;
}