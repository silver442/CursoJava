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
		
		miCoche2.setExtra(true, false , true);
		
		System.out.println(miCoche2.getExtra());
	
		Vehiculos moto1=new Vehiculos(2);
		
		System.out.println(miCoche.getDatosVehiculo());
		System.out.println(moto1.getDatosVehiculo());

		Vehiculos miMoto=new Vehiculos(2,1,0.3,200);
		
		miMoto.setColor("gris");
		
		Vehiculos miCamion=new Vehiculos(6,3,1.5,3500);
		
		miCamion.setColor("Azul");
		
		miCamion.setExtra(true, true, true);
		
		System.out.println(miCamion.getExtra());
		System.out.println(miCamion.getDatosVehiculo());
	}
}
