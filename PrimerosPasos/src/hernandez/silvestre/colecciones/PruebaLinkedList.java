package hernandez.silvestre.colecciones;

import java.util.*;

public class PruebaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String>personas=new LinkedList<String>();
		
		personas.add("Ana");
		personas.add("Antonio");
		personas.add("Sara");
		personas.add("Pedro");
		
		System.out.println(personas.size());
		
		ListIterator<String> it=personas.listIterator();
		
		it.next();
		
		it.add("Silver");
		
		for (String persona : personas) {
			
			System.out.println(persona);
			
		}
		
	}

}
