package hernandez.silver.ejerciciospoo;

public class UsoVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculoo []vehiculo=new Vehiculoo[2];
	
		vehiculo[0]=new Coche(150);
		
		vehiculo[0].setAcelerar(130);
		
		vehiculo[1]=new Moto(100);
		
		vehiculo[1].setAcelerar(50);
		
		System.out.println(vehiculo[0].getPlazas());
		System.out.println(vehiculo[0].getVelocidad());
		
		System.out.println(vehiculo[1].getPlazas());
		System.out.println(vehiculo[1].getVelocidad());
	}

}
