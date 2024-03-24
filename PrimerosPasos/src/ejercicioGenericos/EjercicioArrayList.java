package ejercicioGenericos;

import java.util.*;

import javax.swing.JOptionPane;

public class EjercicioArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Enteros> miLista=new ArrayList<Enteros>();
	
		int numeroUsuario=1, contador=0;
		
		double suma=0, media, superMedia;
		
		while(numeroUsuario!=0) {
			
			numeroUsuario=Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero"));
			
			miLista.add(new Enteros(numeroUsuario));
			
		}
		
		miLista.remove(miLista.size()-1);
		
		for(int i=0;i<miLista.size();i++) {
			
			Enteros e=miLista.get(i);
			
			suma+=e.getNumero();
	
		}
		
		media=suma/miLista.size();
		
		for(int i=0;i<miLista.size();i++) {
			
			Enteros e=miLista.get(i);
			
			if(e.getNumero()>media) {
				
				contador++;
				
			}
		}
		
		System.out.println("La suma es "+suma + "\ny la media " + media);
		System.out.println("y hay " + contador +" superiores a la media");
		
	}
}

class Enteros{
	
	public Enteros(int num) {
		
		numero=num;
	}
	
	public int getNumero() {
		
		return numero;
	}
	
	
	private int numero;
}