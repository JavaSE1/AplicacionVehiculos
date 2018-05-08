package HilosMITOCODE;

import java.util.concurrent.TimeUnit;

public class PrincipalHilos {

	public static void main(String[] args) {

		THilo hilo1 = new THilo("Hilo1");
		hilo1.start();
		
		THilo hilo2 = new THilo("                 Hilo2");
		hilo2.start();
		
		THilo hilo3 = new THilo("                                      Hilo3");
		hilo3.start();
	
		for( int i = 0 ; i < 1000 ; i++) {
			System.out.println("                                                     Principal: " + i);
			try {
//				Thread.sleep(1 );
				TimeUnit.MILLISECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
