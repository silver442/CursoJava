package ejercicios;

import javax.swing.JOptionPane;

public class AlmacenarArrays {

	public static void main(String[] args) {

		int arrayNum[]=new int[10];
		
		for(int i=0;i<10;i++) {
			
			arrayNum[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero."));
			
		}
		
		for(int elemento:arrayNum) {
			
			if(elemento>0) {
				System.out.println("positivo: "+elemento);
			}else if(elemento==0) {
				System.out.println("valor 0: "+elemento);
			}else {
				System.out.println("Negativo: "+ elemento);
			}
		}
	}
}
