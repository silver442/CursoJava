package ejercicios;

import javax.swing.JOptionPane;

public class DireccionEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email;
		
		boolean arroba=false;
		boolean punto=false;
		boolean caracter=false;
		
		int numArroba=0;
		
		while(!(arroba && punto && caracter)) {
			email=JOptionPane.showInputDialog("Ingresa tu correo");
			
			for(int i=0;i<email.length();i++) {
				
				if(email.charAt(i)=='@') {
					numArroba=numArroba+1;
				}
				if(email.charAt(i)=='.') {
					punto=true;
				}
				if(email.length()>4) {
					caracter=true;
				}
				if(numArroba>=2 || numArroba==0) {
					arroba=false;
				}else {
					arroba=true;
				}
			}
		}
		System.out.println("Programa finalizado");
	}
}
