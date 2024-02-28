package hernandez.silvestre.flujo;
import javax.swing.JOptionPane;

public class Anidamiento_IF {

	public static void main(String[] args) {

		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad, por favor: "));
		
		boolean mayor_edad=false;
		
		if(edad>=18)mayor_edad=true;
		
		
		if(mayor_edad) { // evalue si la variable mayor_edad es verdadera
			
			String carnet=JOptionPane.showInputDialog("¿Tienes carnet?: ");
			
			if(carnet.equals("si"))JOptionPane.showMessageDialog(null, "Puedes comprar el coche");
		
			else JOptionPane.showMessageDialog(null, "Sin carnet no hay el coche");
				
		}else JOptionPane.showMessageDialog(null, "si eres menor no puedes tener carnet y por lo tanto tampoco comprar el coche");

	}
}
