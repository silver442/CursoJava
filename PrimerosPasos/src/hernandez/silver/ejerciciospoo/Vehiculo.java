package hernandez.silver.ejerciciospoo;

public interface Vehiculo {

	void setAcelerar(double velocidad);
	
	void setFrenar(double velocidad);
	
	double getVelocidad();
	
	int getPlazas();
	
	double VELOCIDAD_MAXIMA=120;
}
