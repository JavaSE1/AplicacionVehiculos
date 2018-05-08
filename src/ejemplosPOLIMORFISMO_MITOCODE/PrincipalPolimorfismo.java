package ejemplosPOLIMORFISMO_MITOCODE;

public class PrincipalPolimorfismo {

	public static void main(String[] args) {

		Animal a = new Perro("Kaiser",3,"Carnívoro", "Pastor");
		a.alimentarse();
		a.moverse();
		
		Animal b = new Caballo();
		b.alimentarse();
		b.moverse();
		
		
		
		
		/*******************************************/
		
		String texto = "hola,pepe";
		String[] elementos = texto.split(",");
		//TODO: Recorrerlo con FOREACH
		System.out.println("Elemento1: " + elementos[0]);
		System.out.println("Elemento2: " + elementos[1]);
		
	}

}
