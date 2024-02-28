package ejercicios;

import javax.swing.JOptionPane;

public class CalculoPotenciaJOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base"));

		double exponente = Double.parseDouble(JOptionPane.showInputDialog("Introduce el exponente"));

		System.out.println("El resultado de "+base+" elevado a "+exponente+" es "+ Math.pow(base, exponente));
	}

}
