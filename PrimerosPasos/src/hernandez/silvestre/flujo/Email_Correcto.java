package hernandez.silvestre.flujo;

import javax.swing.JOptionPane;

public class Email_Correcto {

	public static void main(String[] args) {
		
		boolean valido=false;
		
		do {
			
			String email=JOptionPane.showInputDialog("Introduce direccion de email, por favor");
			
			int arroba=0;
			
			boolean punto=false;
			
			for(int i=0;i<email.length();i++) {
				
				if(email.charAt(i)=='@')arroba++;
				
				if(email.charAt(i)=='.')punto=true;
				
			}
			
			if(arroba==1 && punto==true && email.length()>=4) valido=true;
			else JOptionPane.showMessageDialog(null, "Email no valido");
			
		}while(valido==false);
		
		System.out.println("Email correcto");
	}
}
