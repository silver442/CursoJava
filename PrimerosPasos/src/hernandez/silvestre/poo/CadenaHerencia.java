package hernandez.silvestre.poo;

public class CadenaHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clase4 miobj=new Clase4(); 
			
			miobj.metodo1();
		
	}
}

class Clase1{
	
	public void metodo1() {
		
	}
	
}

class Clase2 extends Clase1{

	public void metodo2() {
		
	}
}

class Clase3 extends Clase2{
	
	public void metodo3() {
		
	}
}

class Clase4 extends Clase3{
	private void metodo4() {
		
	}
}

class Clase5 extends Clase4{
	public void metodo5() {
		
	}
}