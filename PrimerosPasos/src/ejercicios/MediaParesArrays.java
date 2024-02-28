package ejercicios;

import javax.swing.JOptionPane;

public class MediaParesArrays {

	public static void main(String[] args) {

		int []numeros=new int[10];
		
		int Media = 0;
		int numPares=0;
		
		for(int i=0;i<numeros.length;i++) {
			numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa numeros"));
		}
		
		for(int elem:numeros) {
			
			if(elem%2==0) {
				numPares++;
				Media = Media+elem;
			}
		}
		Media = Media/numPares;
		System.out.println("La media es: "+Media);
			
	}

}
