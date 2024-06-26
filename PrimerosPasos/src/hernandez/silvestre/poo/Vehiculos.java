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
	
	public Vehiculos(int ruedas, int largo, double ancho, int peso) {
		this.ruedas=ruedas;
		this.largo=largo;
		this.ancho=ancho;
		this.peso=peso;
		color="sin color";
	}
	
	public void setExtra(boolean climatizador) {
		
		this.climatizador = climatizador;
		
	}
	
	public void setExtra(boolean gps, boolean climatizador, boolean tapiceria_cuero) {
		
		this.climatizador=climatizador;
		this.gps=gps;
		this.tapiceria_cuero=tapiceria_cuero;
		
	}
	
	public String getExtra() {
		
		if(climatizador && gps==false && tapiceria_cuero==false) return "Tu vehiculo lleva el pack 1 de extras";
		else if(climatizador && gps && tapiceria_cuero) return "Tu vehiculo lleva el pack 2 de extras" ;
		else return "la combinación de extras ecogida no se admite";
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
	private int ruedas; //  valor por defecto cero
	private String color; // valor por defecto null
	private int largo;
	private double ancho;
	private int peso;
	private boolean climatizador; // el valor por defecto de una variable boolean es false
	private boolean tapiceria_cuero;
	private boolean gps;
}
