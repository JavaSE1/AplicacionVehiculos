package ejemplosHilos_MITOCODE;

import java.util.Iterator;

public class Hilo extends Thread {

	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(mensaje + i);
		}
		
	}

	/*********************************/
	
	private String mensaje;

	public Hilo(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
}
