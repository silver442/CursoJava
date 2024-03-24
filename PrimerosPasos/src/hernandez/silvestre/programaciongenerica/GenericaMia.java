package hernandez.silvestre.programaciongenerica;

public class GenericaMia<T> {

	public GenericaMia() {
		
		objeto=null;
		
	}
	
	public void setObjeto(T nuevoValor) {
		
		objeto=nuevoValor;
	}
	
	public T getObjeto() {
	
		return objeto;
	}
	
	private T objeto; // Campo generico
}
