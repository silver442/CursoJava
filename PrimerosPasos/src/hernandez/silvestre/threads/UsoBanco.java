package hernandez.silvestre.threads;

import java.util.concurrent.locks.*;


public class UsoBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banco b=new Banco();
		
		for(int i=0;i<100;i++) {
			
			EjecutandoTransferencias r=new EjecutandoTransferencias(b, i, 2000);
			
			Thread t=new Thread(r);
			
			t.start();
			
		}
		
	}
}

class Banco{
	
	public Banco() {
		
		cuentas=new double[100];
		
		for(int i=0;i<100;i++) {
			
			cuentas[i]=2000;
			
		}
		
		saldoSuficiente=bloqueaBanco.newCondition();
		
	}
	
	public void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException {
	
		bloqueaBanco.lock();
		
		try {
		
			//if(cuentas[cuentaOrigen]<cantidad) return; //evitar que se haga la trransferencia
			
			while(cuentas[cuentaOrigen]<cantidad) saldoSuficiente.await();
			
			//Informa cual es el hilo que hace la transferencia
			System.out.println(Thread.currentThread());
			
			cuentas[cuentaOrigen]-=cantidad;
			
			cuentas[cuentaDestino]+=cantidad;
	
			//System.out.println("$" + cantidad +" de la cuentad " + cuentaOrigen + " a la cuenta " + cuentaDestino);
		
			System.out.printf("%10.2f de %d para la cuenta %d", cantidad, cuentaOrigen, cuentaDestino);
			System.out.println();
			//System.out.println(getSaldoTotal());
			
			System.out.printf("Saldo total: %10.2f%n", getSaldoTotal());
	
			saldoSuficiente.signalAll();
		}finally {
			
			bloqueaBanco.unlock();
		}
	}
	
	public double getSaldoTotal() {
		
		double sumaSaldoBanco=0;
		
		for(double a: cuentas) {
			
			sumaSaldoBanco+=a;
		}
		
		return sumaSaldoBanco;
	}
	
	private final double [] cuentas;
	
	private Lock bloqueaBanco=new ReentrantLock();
	
	private Condition saldoSuficiente;
}

class EjecutandoTransferencias implements Runnable{
	
	public EjecutandoTransferencias(Banco miBanco, int cuentaDeOrigen, double cantidadMaxima) {
		this.miBanco = miBanco;
		this.cuentaDeOrigen = cuentaDeOrigen;
		this.cantidadMaxima = cantidadMaxima;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true) {
			
			int cuentaDeDestino=(int)(Math.random()*100);
			
			double cantidadATransferir=cantidadMaxima*Math.random();
			
			try {

				miBanco.transferencia(cuentaDeOrigen, cuentaDeDestino, cantidadATransferir);
		
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	private Banco miBanco;
	
	private int cuentaDeOrigen;
	
	private double cantidadMaxima;
	
}
