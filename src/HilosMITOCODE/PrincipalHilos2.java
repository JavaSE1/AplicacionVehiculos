package HilosMITOCODE;

import java.util.concurrent.TimeUnit;

public class PrincipalHilos2 {

	public static void main(String[] args) throws InterruptedException {

		THilo hilo1 = new THilo("Hilo1");
		hilo1.start();
//		hilo1.join();
		
//		Thread.sleep(2000);
		Thread hilo2 = new Thread(new RHilo("             Hilo2"));
		hilo2.start();
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for( int i = 0 ; i < 1000 ; i++) {
					System.out.println("                           Hilo3 - " + i);
					try {
						TimeUnit.MILLISECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}				
			}
		};
		Thread hilo3 = new Thread(r);
		hilo3.start();
	}

}
