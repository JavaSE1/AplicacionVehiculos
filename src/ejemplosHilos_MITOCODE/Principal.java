package ejemplosHilos_MITOCODE;

public class Principal {

	public static void main(String[] args) {

		Hilo hilo1 = new Hilo("");
		hilo1.start();
		
		Hilo hilo2 = new Hilo("         ");
		hilo2.start();
	}

}
