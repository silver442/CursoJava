package hernandez.silvestre.poo;

public class UsoVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

						// new para llamae al constructor
		Vehiculos miCoche=new Vehiculos(4);
		Vehiculos miCoche2=new Vehiculos(4);
		
		miCoche.setColor("amarillo");
		
		System.out.println(miCoche.getColor());
		
		miCoche2.setColor("rojo");
		
		System.out.println(miCoche2.getColor());
	
		Vehiculos moto1=new Vehiculos(2);
		
		System.out.println(miCoche.getDatosVehiculo());
		System.out.println(moto1.getDatosVehiculo());
	}
}
