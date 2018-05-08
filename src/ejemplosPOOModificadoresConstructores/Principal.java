package ejemplosPOOModificadoresConstructores;

import ejemplosPOOModificadoresConstructores2.CocheRally;

public class Principal {

	public static void main(String[] args) {

		CocheRally miCocheRally = new CocheRally();
		miCocheRally.setAleron("Extra");
//		miCocheRally.setRuedas(3);
		
//		miCocheRally.get //Ruedas, Motor, AsientoCopiloto, Aleron
//		miCocheRally.set //Motor, AsientoCopiloto, Aleron
		
		CocheRally miSegundoCocheRally = new CocheRally("Turbo 3000", "Ergonómico", "Plateado");
		System.out.println(miSegundoCocheRally.toString());
		
		
		CocheF1 miCocheF1 = new CocheF1();
//		miCocheF1.setMotor("20000 K");
//		System.out.println(miCocheF1.getMotor());
		
		CocheF1 miSegundoCocheF1 = new CocheF1("20000 K","Difusor soplado");
		System.out.println(miSegundoCocheF1.toString());
		
//		miCocheF1.get //Ruedas, Motor, Difusor
//		miCocheF1.set //Motor Difusor,

	
	}

}
