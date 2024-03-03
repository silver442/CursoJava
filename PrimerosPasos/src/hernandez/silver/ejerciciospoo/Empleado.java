package hernandez.silver.ejerciciospoo;

import java.util.Calendar;

public abstract class Empleado {
	
	public Empleado() {
		dni= "00000000";
		nombre = "No disponible";
		apellidos = "No disponible";
		agnoIngreso = 2010;
		
	}
	
	public Empleado(String dni,String nombre, String apellidos, int agnoIngreso) {
		
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.agnoIngreso=agnoIngreso;
		
	}
	
	
	public void imprimir() {
	
		System.out.println("DNI: " + getDni() +
				"\nNombre y Apellidos: " + getNombre() + " " + getApellidos() +
				"\nAño de ingreso: " + getAgnoIngreso());
	}
	
	public abstract double getSalario();
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellidos (String apellidos) {
		this.apellidos=apellidos;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setAgnoIngreso(int agnoIngreso) {
		this.agnoIngreso=agnoIngreso;
	}
	
	public int getAgnoIngreso() {
		return agnoIngreso;
	}
	
	private String dni;
	private String nombre;
	private String apellidos;
	protected int agnoIngreso;
	
}
// ----------------------------------------------------------------------
class EmpleadoAsalariado extends Empleado{

	public EmpleadoAsalariado() {
		super();
		salarioBase= 0.0;
	}
	
	public EmpleadoAsalariado(String dni,String nombre, String apellidos, int annio, double salarioBase) {
		super(dni,nombre, apellidos, annio);
		// TODO Auto-generated constructor stub
		this.salarioBase=salarioBase;
	}

	@Override
	public double getSalario() {
		Calendar ahora = Calendar.getInstance();
		int agnoActual = ahora.get(Calendar.YEAR);
		int agnos = agnoActual - getAgnoIngreso();
		if(agnos<0) {
			System.out.println("Los años no pueden ser negativos");
		}
		if(agnos < 2) return salarioBase;
		else if(agnos >=2 && agnos<=3) return salarioBase*1.07;
		else if(agnos >=4 && agnos<=8) return salarioBase*1.11;
		else if(agnos >=9 && agnos<=15) return salarioBase*1.17;
		else return salarioBase*1.22;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.printf("Salario: %.2f\n", getSalario());
		System.out.println();
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	private double salarioBase;
	
}
// ---------------------------------------------------------------------
class EmpleadoComision extends Empleado{

	public EmpleadoComision() {
		super();
		clientesCaptados = 0;
		comisionPorCliente = 0;
	}
	
	public EmpleadoComision(String nombre, String apellidos, String DNI, int annio,int clientes, double comision) {
		super(nombre, apellidos,DNI, annio);
		// TODO Auto-generated constructor stub
		clientesCaptados=clientes;
		this.comisionPorCliente=comision;
	}

	@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		if(comisionPorCliente*clientesCaptados > salarioMinimo) {
			return comisionPorCliente*clientesCaptados;
		}else return salarioMinimo;
		
	}
	
	public void imprimir () {
		super.imprimir();
		System.out.printf("Salario: %.2f\n", getSalario());
		System.out.println();
	}
	
	public void setClientesCaptados (int clientesCaptados) {
		this.clientesCaptados = clientesCaptados;
	}
	
	public int getClientesCaptados() {
		return clientesCaptados;
	}
	
	public void setComisionPorCliente(double comisionPorCliente) {
		this.comisionPorCliente = comisionPorCliente;
	}
	
	public double getMontoPorCliente() {
		return comisionPorCliente;
	}
	
	private int clientesCaptados;
	private double comisionPorCliente;
	public static final double salarioMinimo = 950;

}