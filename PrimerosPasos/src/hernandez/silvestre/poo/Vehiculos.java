package hernandez.silvestre.poo;

public class Vehiculos {

	public Vehiculos(int ruedas) { // Constructor de la clase. Mismo nombre que la clase
		
		//Esstado inicial
		this.ruedas=ruedas;
		largo=2;
		ancho=1;
		peso=2;
		color="sin color";
		
	}
	
	// Método setter. Establecen  valor de la propiedad
	public void setColor(String color){
		// this hace referencia a la clases
		this.color=color;
		
	}
	
	//Método getter. Devuelven el valor de la propiedad
	public String getColor() {
		
		return color;
	}
	
	public String getDatosVehiculo() {
		
		return "Tu vehiculo tiene " + ruedas + " ruedas.Ademá"+
				" tiene "+ largo + " m de largo.";
		
	}
	
	//Propiedades
	private int ruedas;
	private String color;
	private int largo;
	private int ancho;
	private int peso;
}
