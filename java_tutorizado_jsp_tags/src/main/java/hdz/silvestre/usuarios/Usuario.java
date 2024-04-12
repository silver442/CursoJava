package hdz.silvestre.usuarios;

public class Usuario {
	
	public Usuario(String nombre, String apellido, String usuario, String pais, double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.pais = pais;
		
		this.salario=salario;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}




	private String nombre;
	
	private String apellido;
	
	private String usuario;
	
	private String pais;
	
	private double salario;
}
