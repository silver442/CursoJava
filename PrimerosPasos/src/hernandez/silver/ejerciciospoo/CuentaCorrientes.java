package hernandez.silver.ejerciciospoo;

import java.util.Random;

public class CuentaCorrientes {

	public CuentaCorrientes(String nombre, double saldo) {
		nombreTitular=nombre;
		
		this.saldo=saldo;
		
		Random rnd=new Random();

		numeroCuenta=Math.abs(rnd.nextLong());
		
		//numeroCuenta=(long)(Math.random()*100);
	}
	
	//Metodo setter
	public void setIngreso(double ingreso) {
		
		if(ingreso<0) System.out.println("No se permiten ingresos negativos");
		
		saldo = saldo + ingreso;
		
	}
	
	public void setReintegros(double retiro) {
		saldo-=retiro;
	}
	
	//Metodo getter
	public String getSaldo() {
		
		return "El saldo de tu cuenta es: "+saldo;
	}
	
	public String getDatosGenerales() {
		return "El numbre del usuario es: "+nombreTitular+". Con n° de cuenta: "+
				numeroCuenta+ " y saldo de: " + saldo;
	}
	
	//Método que permite realizar transferencia
	public static void setTransferencia(CuentaCorrientes cuenta1,CuentaCorrientes cuenta2, double cantidadTransferir) {
		
		cuenta1.saldo-=cantidadTransferir;
		cuenta2.saldo+=cantidadTransferir;
		
	}
	
	private double saldo;
	private String nombreTitular;
	private long numeroCuenta;

}
