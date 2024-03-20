package hernandez.silvestre.excepciones;

import javax.swing.JOptionPane;

public class VariasExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			division();
		
		}catch(ArithmeticException e){
			
			System.out.println("has intentado dividir por 0");
		
		}catch(NumberFormatException e) {
			
			//System.out.println("Has introducido un valor numerico no valido");
			
			System.out.println("Se ha lanzado una excepción de tipo: " + e.getClass().getName());
		}
	}

	static void division() {
		
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
		
		int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
		
		System.out.println("El resultado es: " + num1/num2);
	}
	
}

