package hernandez.silvestre.colecciones;

import java.util.Objects;

public class Cliente {

	public Cliente(String nombre, String nCuenta, double saldo) {
		
		this.nombre=nombre;
		
		this.nCuenta=nCuenta;
		
		this.saldo=saldo;
		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nCuenta);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(nCuenta, other.nCuenta);
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getnCuenta() {
		return nCuenta;
	}

	public void setnCuenta(String nCuenta) {
		this.nCuenta = nCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	private String nombre;
	
	private String nCuenta;
	
	private double saldo;
	
}
