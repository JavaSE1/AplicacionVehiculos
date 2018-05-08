package ejemplosPOO_MITOCODE;

//import ejemplosPOOModificadoresAcceso.Coche;

public class Principal {

	public static void main(String[] args) {

//		Celular ce = new Celular("LG", "NEGRO");
//		ce.llamar();
//		
//		Celular ce2 = new Celular("SAMSUNG", "BLANCO");
//		ce2.llamar();
//		ce2.llamarA(ce);
		
//		Celular ce3 = new Celular();
		
//		Celular2 celular2 = new Celular2();
//		//Esto da error si no creamos un constructor vacio, pq ya hemos declarado otro/s CONSTRUCTOR/es con parametros
//		Celular ce3 = new Celular();
		
		
//		//Pero si hemos creado un constructor vacio, funciona correctamente
//		Celular ce4 = new Celular();
//		//Y si creamos un constructor con solo parte de las propiedades, el resto seran "null"
//		Celular ce5 = new Celular("IPhone");
//		ce5.llamar();
		
		/***********************************/
		           
		Coche miCoche = new Coche();
		Coche miCoche2 = new Coche(4, "1900 Diesel");
//		miCoche.motor = "2000 Diesel"; 
//		miCoche.ruedas = 4;
		
//		miCoche.arrancar(); 
//		miCoche2.arrancar(); 
		
//		
		miCoche.seguir(miCoche2);
	}

}
