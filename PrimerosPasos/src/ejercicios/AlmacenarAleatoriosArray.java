package ejercicios;

public class AlmacenarAleatoriosArray {

	public static void main(String[] args) {
		
		int []numAleatorios=new int[100];
		
		for(int i=0;i<numAleatorios.length;i++) {
			numAleatorios[i]=(int)(Math.random()*100);
		}
		
		for(int elemento:numAleatorios) {
			System.out.print(elemento + " ");
		}

	}

}
