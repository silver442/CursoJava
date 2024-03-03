package hernandez.silver.ejerciciospoo;

public class CreaPassword {
	
	public CreaPassword(int longitud) {
		this.longitud=longitud;
		password=generaPassword();
	}
	
	public int getLongitud() {
		return longitud;
	}
	
	public String getPasswords() {
		return password;
	}
	
	public String generaPassword() {
		
		String password="";
		
		for(int i=0;i<longitud;i++) {
			
			// Generamos un numero aleatorio y en función del mismo, genera mayúsculas, minusculas o número
			
			int mayusMinus=((int)(Math.random()*3+1));
			
			if(mayusMinus==1) {
				char minusculas=(char)((int)(Math.random()*(123-97)+97));
				
				password+=minusculas;
			
			}else if(mayusMinus==2) {
				
				char mayusculas=(char)((int)(Math.random()*(91-65)+65));
				
				password+=mayusculas;
				
			}else {
				
				char numeros=(char)((int)(Math.random()*(58-48)+48));
				
				password+=numeros;
				
			}
		}
		
		return password;
		
	}
	
	public String esSegura() {
		int numeros=0;
		int minusculas=0;
		int mayusculas=0;
		
		for(int i=0;i<password.length();i++) {
			
			if(Character.isLowerCase(password.charAt(i))) {
				
				minusculas+=1;
				
			}else if (Character.isUpperCase(password.charAt(i))) {
				
				mayusculas+=1;
				
			}else {
				
				numeros+=1;
				
				}
			}
			
		if(numeros>=5 && minusculas>=1 && mayusculas>=2) {
			
			return "Contraseña segura";
			
		}else {
			
			return "Contraseña débil";
		}
	}
	
	private int longitud;
	
	private String password;

}
