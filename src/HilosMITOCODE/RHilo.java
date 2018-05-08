package HilosMITOCODE;

import java.util.concurrent.TimeUnit;

public class RHilo implements Runnable {

	private String nombre;
	
	public RHilo(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public void run() {

//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e1) {}
		
		for( int i = 0 ; i < 1000 ; i++) {
			System.out.println(nombre + " - " + i);
			
			try {
//				Thread.sleep(1 );
				TimeUnit.MILLISECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
