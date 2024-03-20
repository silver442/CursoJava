package ejercicioecxcepciones;

import javax.swing.JOptionPane;

public class NumeroFueraRango {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un n° entre 1 y 100"));
		
		try {
			compruebaNumero(num);
		} catch (RangoErroneo e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	static void compruebaNumero(int numero) throws RangoErroneo{
		
		if(numero<1 || numero>100) {
			
			throw new RangoErroneo("El n° está fuera de rango");
			
		}else {
			
			System.out.println("N° correcto");
			
		}
		
	}

}

class RangoErroneo extends Exception{
	
	public RangoErroneo() {
		
	}
	
	public RangoErroneo(String mensaje) {
		
		super(mensaje);
	}
	
}


