package hernandez.silver.ejerciciospoo;

import java.util.Random;

public class GeneradorContraseñas {

	
	public GeneradorContraseñas(int array, int longitud){
		
		tamanoArray=array;
		
		this.longitud=longitud;
		
	}
	
	// Métodos getters
	public void getContraseñas() {
		
		for(String[] elemento:contra) {
			
			for(String elem:elemento) {
			
				System.out.print(elem);
				
			}
			System.out.println();
		}
	}
	
	public int getLongitud() {
		
		return longitud;
	}
	
	//Metodos setter
	public void setGeneraContraseña() {
	
		Random rnd = new Random();
		
		int numAleatorio;
		
		char caracter;
		
		contra=new String[tamanoArray][longitud];
		
		for(int i=0;i<tamanoArray;i++) {
			
			for(int j=0;j<longitud;j++) {
			
				numAleatorio=rnd.nextInt(123);
				
				if(numAleatorio<10) {
					contra[i][j]=""+numAleatorio;
				}else if(numAleatorio>64 && numAleatorio<91) {
					
					caracter=(char)numAleatorio;
					contra[i][j]=""+caracter;
					
				}else if(numAleatorio>96 && numAleatorio<123) {
				
					caracter=(char)numAleatorio;
					contra[i][j]=""+caracter;
				}			
				else if(i==0){
					
					i=0;
					
				}else {
					
					i--;
				}
			}	
		}
	}
	
	public void getContraSegura() {
		
		for(int i=0;i<tamanoArray-1;i++) {
			
			for(int j=0;i<longitud-1;j++) {
			
				caract = (char)(this.contra[i][j].charAt(j));
				
				caracte=(int)caract;
				
				if(caracte<10) {
					
					numeros++;
				
				}else if(caracte>64 && caracte<91) {
					
					mayusculas++;
					
				}else if(caracte>96 && caracte<123) {
				
					minusculas++;
				}
			}
			
			if(numeros>5 && minusculas>1 && mayusculas>2) {
				System.out.println("Contraseña segura");
			}else {
				
				System.out.println("Contraseña debil");;
			}
		}
		
	}
	
	private int tamanoArray;
	
	private int longitud;
	
	private String[][] contra;
	
	private char caract;
	
	private int caracte;
	
	private int numeros, minusculas, mayusculas;
}
