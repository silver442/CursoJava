package hernandez.silver.ejerciciospoo;

public class UsoCuenta {

	public static void main(String[] args) {
		
		CuentaCorrientes Cuenta1=new CuentaCorrientes("Persona1", 1200);

		CuentaCorrientes Cuenta2=new CuentaCorrientes("Persona2", 1200);

		Cuenta1.setIngreso(300);
		
		CuentaCorrientes.setTransferencia(Cuenta1, Cuenta2, 50);
		
		System.out.println(Cuenta1.getDatosGenerales());
		System.out.println(Cuenta2.getDatosGenerales());
		
		System.out.println(Cuenta1.getSaldo());
	}
}
