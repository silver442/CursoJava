package hernandez.silver.ejerciciospoo;

public class Vehiculoo implements Vehiculo{

	public Vehiculoo(double Velocidad) {
		velocidadInicial=Velocidad;
	}
	@Override
	public void setAcelerar(double velocidad) {
		
		velocidadFinal=velocidadInicial + velocidad;
		
		if(velocidadFinal>=VELOCIDAD_MAXIMA) {
			System.out.println("La velocidad Máxima ha sido superado");
		}
	}
	
	public double getVelocidad() {
		// TODO Auto-generated method stub
		return velocidadFinal;
	}

	public void setFrenar(double velocidad) {
		velocidadFinal=velocidadInicial - velocidad;
	}

	@Override
	public int getPlazas() {
		// TODO Auto-generated method stub
		return 0;
	}

	double velocidadInicial;
	
	double velocidadFinal;
}
