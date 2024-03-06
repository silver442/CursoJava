package hernandez.silver.ejerciciospoo;

public class Coche extends Vehiculoo{

	public Coche(double Velocidad) {
		
		super(Velocidad);
	}

	@Override
	public int getPlazas() {
		// TODO Auto-generated method stub
		return 5; //numero de plazas para coche
	}
}
