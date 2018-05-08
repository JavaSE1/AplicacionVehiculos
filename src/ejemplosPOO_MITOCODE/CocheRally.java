package ejemplosPOO_MITOCODE;

import ejemplosPOOModificadoresAcceso.Coche;

public class CocheRally extends Coche {
	
	public CocheRally() {
		this.motor = "1900";
//		this.color = "rojo"; //Esto no compila
	}

	public static void main(String[] args) {

		Coche co = new Coche();
//		co.motor = "1900"; //Esto no compila
		
		CocheRally cr =  new CocheRally();
		cr.motor = "1900";
	}

}
