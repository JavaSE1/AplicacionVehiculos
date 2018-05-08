package ejemplosMITOCODE;

import java.util.Scanner;

public class Principal_Arrays_Vectores {

	public static void main(String[] args) {

//		String[] arreglo = new String[2];
//		arreglo[0] = "Hola";
		
//		String[] arreglo = {"Mito","Code"};
		
//		String[] arreglo = null;
		
//		for( String s:arreglo) {
//			System.out.println(s);
//		}
		
//		for(int i=0; i<arreglo.length ; i++) {
//			System.out.println(arreglo[i]);
//		}
		
		/**********************/
		System.out.println("Introduzca un número para el tamaño del array:" );
		
		
		Scanner sc = new Scanner(System.in);
		int tama;
		try {
			tama = sc.nextInt();
		} catch (Exception e) {
			tama = 1;
		}
		
		String[] arreglo2 = new String[tama];

		Scanner sc2 = new Scanner(System.in);
		
		for(int i=0 ; i<arreglo2.length ; i++) {
			System.out.println("Elemento " + (i+1) + " :" );
			arreglo2[i] = sc2.nextLine();
		}
		
		for( String s:arreglo2) {
			System.out.println(s);
		}
	}

}
