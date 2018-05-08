package HilosMITOCODE;

import java.util.concurrent.TimeUnit;

public class THilo extends Thread {

	private String nombre;
	
	public THilo(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public void run() {

		for( int i = 0 ; i < 1000 ; i++) {
			System.out.println(nombre + " - " + i);
			try {
//				Thread.sleep(1 );
				TimeUnit.MILLISECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//		while(true) {
//			System.out.println(nombre);
//		}
	}

	
}
