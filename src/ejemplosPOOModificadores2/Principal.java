package ejemplosPOOModificadores2;

import ejemplosPOOModificadoresAcceso.CocheRally;

public class Principal {

	public static void main(String[] args) {

		CocheRally miCocheRally = new CocheRally();
		miCocheRally.setAleron("Extra");
//		miCocheRally.setRuedas(3);
		
//		miCocheRally.get //Ruedas, Motor, AsientoCopiloto, Aleron
//		miCocheRally.set //Motor, AsientoCopiloto, Aleron
		
		CocheF1 miCocheF1 = new CocheF1();
//		miCocheF1.setMotor("20000 K");
		System.out.println(miCocheF1.getMotor());
		
//		CocheF1 miSegundoCocheF1 = new CocheF1("Difusor soplado");
		
//		miCocheF1.get //Ruedas, Motor, Difusor
//		miCocheF1.set //Motor Difusor,

	
	}

}
