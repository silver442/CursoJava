package hernandez.silver.ejerciciospoo;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado empleados[] = new Empleado[4];
		EmpleadoAsalariado empsal1 =  new EmpleadoAsalariado("6546546Z", "Antonio", "López", 2014, 1125);
		empleados[0] = empsal1;
		
		EmpleadoComision empcom1=new EmpleadoComision("7879879S","Sandra", "Nieto", 2011, 169, 7.10); 
		empleados[1] = empcom1;
		
		EmpleadoComision empcom2 = new EmpleadoComision();
		empcom2.setDni("4654654D");
		empcom2.setNombre("Manuel");
		empcom2.setApellidos("Ruiz");
		empcom2.setAgnoIngreso(2010);
		empcom2.setClientesCaptados(35);
		empcom2.setComisionPorCliente(6.90);
		empleados[2]=empcom2;
		
		EmpleadoAsalariado empsal2 = new EmpleadoAsalariado();
		empsal2.setDni("77879878F");
		empsal2.setNombre("Maria");
		empsal2.setApellidos("Ramos");
		empsal2.setAgnoIngreso(2011);
		empsal2.setSalarioBase(1055);
		empleados[3]=empsal2;
		
		sueldoMayor(empleados);
		mostrarTodos(empleados);
	}
	
	public static void sueldoMayor(Empleado empleados[]) {
		int empMayor = 0; double salarioMayor = 0;
		for(int i=0; i<empleados.length;i++) {
			try {
				if(empleados[i].getSalario() > salarioMayor) {
					empMayor= i;
					salarioMayor = empleados[i].getSalario();
				}
			}catch(Exception e) {
				System.out.println(empleados[i].getNombre() + " " + empleados[i].getApellidos() + ": ");
				System.out.println(e.getMessage());
			}
		}
		System.out.printf("\nEl empleado con mayor salario es "
				+ empleados[empMayor].getNombre()+" "+empleados[empMayor].getApellidos()+
				" con salario %.2f\n", salarioMayor);
		System.out.println();
	}

	public static void mostrarTodos(Empleado empleados[]) {
		System.out.println("__Todos los empleados:__\n");
		for(int i=0; i< empleados.length;i++) {
			empleados[i].imprimir();
		}
	}
}
