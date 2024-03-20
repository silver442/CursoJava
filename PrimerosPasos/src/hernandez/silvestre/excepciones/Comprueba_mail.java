package hernandez.silvestre.excepciones;

import javax.swing.JOptionPane;

public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mail=JOptionPane.showInputDialog("Introduce mail");
		
			try {
				examinaMail(mail);
			} catch (LongitudMailErronea e) {
				// TODO Auto-generated catch block
				System.out.println("El mail es demasiado corto");
				e.printStackTrace();
			}	
	}

	static void examinaMail(String email) throws LongitudMailErronea{
		
		int arroba=0;
		
		boolean punto=false;
		
		if(email.length()<=3) {
			
			throw new LongitudMailErronea("Mail con 3 o menos caracteres");
			
			//throw miException;
		}
		
		for(int i=0; i<email.length();i++) {
			
			if(email.charAt(i)=='@') {
				arroba++;
			}
			if(email.charAt(i)=='.') {
				punto=true;
			}
		}
		
		if(arroba==1 && punto==true) {
			
			System.out.println("Es correcto");
		}else {
			
			System.out.println("No es correcto");
			
		}
	}
}

class LongitudMailErronea extends Exception{
	
	public LongitudMailErronea() {
		
	}
	
	public LongitudMailErronea(String mensajeError) {
		
		super(mensajeError);
		
	}
	
}

