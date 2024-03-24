package hernandez.silvestre.programaciongenerica;

public class EjemploMetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombresPersonas[]= {"Sara", "Antonio", "María"};
		
		System.out.println(ExaminaArrays.getMenor(nombresPersonas));
		
		
	}
}

class ExaminaArrays{
	
	public static <T extends Comparable> T getMenor(T[]elArray) {
		
		T objetoMenor=elArray[0];
		
		for(int i=1;i<elArray.length;i++) {
			
			if(objetoMenor.compareTo(elArray[i])>0) {
				
				objetoMenor=elArray[i];
				
			}
			
		}
		
		return objetoMenor;
		
	}
	
}