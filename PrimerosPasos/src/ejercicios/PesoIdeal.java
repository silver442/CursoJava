package ejercicios;

import javax.swing.JOptionPane;

public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String genero = JOptionPane.showInputDialog("Eres mujer o hombre");
		
		double peso_ideal;
		
		if(genero.equalsIgnoreCase("mujer")) {
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu estatura en cm: "));
			
			peso_ideal = altura - 120;
			
			JOptionPane.showMessageDialog(null, "Tu pero ideal es: " + peso_ideal);
		}else if(genero.equalsIgnoreCase("hombre")) {
			double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu estatura en cm: "));
			
			peso_ideal = altura - 110;
			
			JOptionPane.showMessageDialog(null, "Tu pero ideal es: " + peso_ideal);
		}else {
			JOptionPane.showMessageDialog(null, "Introduce un genero correcto");
		}
	}
}
