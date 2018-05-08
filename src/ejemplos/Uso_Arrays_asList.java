package ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Uso_Arrays_asList {

	public static void main(String[] args) {

		/*
		 * Transformar un array en ArrayList 
		 */
		List<String> miListaDePalabras = new ArrayList<String>();
		String[] miArrayDePalabras = { "Oso", "León", "Buey", "Guepardo" };
		
		System.out.println("Contenido inicial del ArrayList: " + miListaDePalabras);
		miListaDePalabras = Arrays.asList(miArrayDePalabras);
		System.out.println("Contenido actual del ArrayList: " + miListaDePalabras + "\n");

		List<Integer> miListaDeEnteros = new ArrayList<Integer>();
		Integer[] miArrayDeEnteros = { 11, -34, 56, 78 };
		
		System.out.println("Contenido inicial del ArrayList: " + miListaDeEnteros);
		miListaDeEnteros = Arrays.asList(miArrayDeEnteros);
		System.out.println("Contenido actual del ArrayList: " + miListaDeEnteros);
		
		/**********************************************************/

		/*
		 * Como creamos un ArrayList pasando como parametro un tipo Collection: LinkedList  
		 */
		LinkedList<String> miListaStrings = new LinkedList<String>();
        miListaStrings.add ("Liebre");
        miListaStrings.add ("Perro");
        
        ArrayList <String> miArrayListStrings = new ArrayList <String> (miListaStrings); //Ejemplo nuevo constructor
        System.out.println ("\nContenido del LinkedList " + miListaStrings);
        System.out.println ("Contenido del ArrayList " + miArrayListStrings);
	}

}
