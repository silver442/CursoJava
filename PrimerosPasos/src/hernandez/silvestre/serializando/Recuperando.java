package hernandez.silvestre.serializando;

import java.io.*;

public class Recuperando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// abrir el canal de stream
			ObjectInputStream flujoEntrada=new ObjectInputStream(new FileInputStream("C:/Users/silve/Downloads/externoJava/miObjetoSerializado.dat"));
		
			// Leeer la informacion
			Empleado [] entradaObjeto=(Empleado[])flujoEntrada.readObject();
		
			flujoEntrada.close();
			
			// Imprimir la ininformación del objeto
			for(Empleado e: entradaObjeto) {
				
				System.out.println(e);
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
