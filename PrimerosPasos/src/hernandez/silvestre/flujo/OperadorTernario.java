package hernandez.silvestre.flujo;
import javax.swing.JOptionPane;

public class OperadorTernario {

	public static void main(String[] args) {
		/*
		double salario1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer salario"));
		double salario2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo salario"));

		double salario_mayor;
		
		if(salario1>salario2) salario_mayor=salario1;
		else salario_mayor=salario2;
		
		// Operador Ternario
		salario_mayor=(salario1>salario2)?salario1:salario2;
		
		System.out.println("El salario mayor es: " + salario_mayor);*/
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
		
		String mayor=(edad>18)?"Eres mayor de edad":"Eres menor de edad";
		
		System.out.println(mayor);
	}
}
