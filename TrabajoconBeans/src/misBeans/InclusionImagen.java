package misBeans;

import java.awt.Dimension;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;

public class InclusionImagen extends JLabel{

	
	
	public InclusionImagen() {
	
		setBorder(BorderFactory.createEtchedBorder());
		
	}

	
	
	
	public String getLaImagen() {

		if(laImagen==null) return null;
		
		else return laImagen.getPath();
		
	}


	public Dimension getPreferredSize() {
		
		return new Dimension(600, 400);
	}


	public void setLaImagen(String escogeImagen) {
		
		try {
			
			laImagen=new File(escogeImagen);
			
			setIcon(new ImageIcon(ImageIO.read(laImagen)));
			
			
		}catch(Exception IO) {
		
			laImagen=null;
			
			setIcon(null);
			
			
		}
		
		
	}




	private File laImagen=null;
	
}
