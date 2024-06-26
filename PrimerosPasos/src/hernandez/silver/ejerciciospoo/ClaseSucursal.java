package hernandez.silver.ejerciciospoo;

public class ClaseSucursal {
	
	public ClaseSucursal(int numSucursal, String direccion, String ciudad) {
		
		this.numSucursal=numSucursal;
		this.direccion=direccion;
		this.ciudad=ciudad;
	
	}
	
	// Métodos getter
	public String getSucursal() {
		return "el numero de la sucursal es " + numSucursal;
	}
	
	public String getDireccion() {
		return "La dirección es: " + direccion;
	}
	
	public String getCiudad() {
		return "en la ciudad de: " + ciudad;
	}
	
	//Método setter
	public static void setCalcularPrecio(ClasePaquete paquete) {
		
		switch(paquete.getPrioridad()) {
		case 0:
			paquete.setPrecio(0);
			break;
		case 1:
			paquete.setPrecio(10);;
			break;
		case 2:
			paquete.setPrecio(20);;
			break;
		}	
	}
	
	//Datos
	public String getDatos() {
		return "N° sucursal: "+numSucursal+". direccion: "+direccion+" ciudad: "+ciudad;
	}
	
	private int numSucursal;
	private String direccion;
	private String ciudad;
}

class ClasePaquete{
	
	ClasePaquete(int referencia, double peso, int DNI, int prioridad){
		
		this.referencia=referencia;
		this.peso=peso;
		this.DNI=DNI;
		this.prioridad=prioridad;
		
		precio=100;
	}
	
	//Métodos setter
	
	public void setPeso(double peso) {
		this.peso=peso;
	}
	
	public void setPrioridad(int prioridad) {
		this.prioridad=prioridad;
	}
	
	public void setPrecio(double precio) {
		
		this.precio+=precio;
	}
	
	// Métodos Getter
	public double getPeso() {
		return peso;
	}
	
	public int getPrioridad() {
		return prioridad;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	//Datos
	public String getDatosPaquete() {
		return "N° Referencia: "+referencia+". peso: "+peso+" Prioridad: "+prioridad+" Precio: $"+precio;
	}
	
	private int referencia;
	private double peso;
	private int DNI;
	private int prioridad;
	
	private double precio;
}