package hernandez.silvestre.arrays;

public class Ejemplo_Arrays {

	public static void main(String[] args) {
		/*
		int []valores=new int[5];
		
		valores[0]=15;
		valores[1]=7;
		valores[2]=1500;
		valores[3]=9;
		valores[4]=-5;*/
		
		String [] nombre_personas= {"Juan", "María", "Antonio", "Laura"};
		
		//int [] valores= {15,7,1500,9,-5};
		/*
		for(int  i=0;i<nombre_personas.length;i++) {
			System.out.println(nombre_personas[i]);
		}*/
		//Recorrer el array con el for each
		for(String elemento:nombre_personas) {
			System.out.println(elemento);
		}
	}
}
