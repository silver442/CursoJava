package hernandez.silvestre.colecciones;

public class UsoLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro1=new Libro("Java SE", "Silver", 11);
		
		Libro libro2=new Libro("Java SE", "Silver", 11);
		
		//libro1=libro2;
		
		if(libro1.equals(libro2)) {
			System.out.println("Son iguales");
		
			System.out.println(libro1.hashCode());
			
			System.out.println(libro2.hashCode());
		
		}
		
		else {
			
			System.out.println("NO son iguales");
			
			System.out.println(libro1.hashCode());
			
			System.out.println(libro2.hashCode());
			
		}
	}
}
