package ejemplosMITOCODE;

public class PrincipalStrings {

	public static void main(String[] args) {

//		String texto1 = "A";
//		String texto2 = "C";
//		System.out.println(texto1.charAt(0));
		
//		int resultado = texto1.compareTo(texto2);
//		System.out.println(resultado);
 
		
//		String texto3 = "MITOCODE";
//		String texto4 = "mitocode";
//		
//		int resultado2 = texto3.compareToIgnoreCase(texto4);
//		System.out.println(resultado2);
		
		/*************/
		
//		String texto1 = "MITOCODE";
//		String texto2 = "mitocode";
		
//		System.out.println(texto1.concat(" ").concat(texto2));
//		System.out.println(texto1 + " " + texto2);
		
//		System.out.println(texto1.contains("CODE"));
//		System.out.println(texto1.indexOf("CO"));
		
//		System.out.println(texto1.indexOf("M"));
		
//		System.out.println(texto1.lastIndexOf('O'));
//		System.out.println(texto1.substring(2, 4));
//		System.out.println(texto1.length());
		
		/****************/
		
		//Dividir esta cadena en 2 sin usar "split"
		String cadena = "Pepe Pérez";
		int pos_blanco =  cadena.indexOf(" ");
		int longitudCadena = cadena.length();
		
		String nombre = cadena.substring(0,pos_blanco);
		String apellido = cadena.substring(pos_blanco+1, longitudCadena);
		
		System.out.println("Nombre: " + nombre + " Apellido:" + apellido);

	}

}
