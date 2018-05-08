 package ejemplosMITOCODE;

public class PrincipalStatic {

	public static void main(String[] args) {

		Persona p = new Persona();
		p.nombre = "Pepe";
		
		Persona p2 = new Persona();
		p2.nombre = "Paco";
		/**********************************/
		
//		System.out.println(p.nombre);
//		System.out.println(p2.nombre);
		
//		System.out.println(Persona.nombreDeClase);
		
//		/**********************************/
//		
//		p.metodoDeInstancia();
//		
//		/**********************************/
//		
//		//Se puede invocar de las 2 formas, pero la mas correcta es esta:
//		Persona.metodoDeClase_o_Estatico();
		
//		//Segunda forma
////		p.metodoDeClase_o_Estatico();
//
//		
//		/**********************************/
//		
		Persona.nombreDeClase = "Clase Personaaaaaaaaaa";
		System.out.println(Persona.nombreDeClase);
		
		Persona.metodoDeClase_o_Estatico();
		
	}

}
