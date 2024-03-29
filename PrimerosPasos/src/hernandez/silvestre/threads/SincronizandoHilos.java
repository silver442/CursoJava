package hernandez.silvestre.threads;

public class SincronizandoHilos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SincronizaThreads hilo1=new SincronizaThreads();
		
		SincronizaThreads2 hilo2=new SincronizaThreads2(hilo1);
		
		SincronizaThreads2 hilo3=new SincronizaThreads2(hilo2);
		
		hilo1.start(); // start es la que llama al metodo run
	
		hilo2.start();
		
		hilo3.start();
		
		// hilo de ejecución del main
		System.out.println("Hemos terminado las tareas");
	}
}

class SincronizaThreads extends Thread{
	
	public void run() {
		
		for(int i=0; i<20; i++) {
			
			System.out.println("Ejecutando thread: " + getName());
		
			try {
				sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}	
	}
}

class SincronizaThreads2 extends Thread{
	
	public SincronizaThreads2(Thread thread) {
		this.thread = thread;
	}
	
	public void run() {
	
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0; i<20; i++) {
			
			System.out.println("Ejecutando thread: " + getName());
		
			try {
				sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}	
	}


	private Thread thread;
}
