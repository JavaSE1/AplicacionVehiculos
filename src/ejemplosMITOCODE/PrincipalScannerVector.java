package ejemplosMITOCODE;

import java.util.Scanner;

public class PrincipalScannerVector {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Tamaño del array: ");
		String tamano = sc.next();
		int tam = Integer.parseInt(tamano);
		
		String[] array = new String[tam];
		
		Scanner sc2 = new Scanner(System.in);
		for(int i=0 ; i<tam ; i++) {
			System.out.println("Elemento " + (i+1) + " :" );
			array[i] = sc2.nextLine();
		}
		
		for(String s:array) {
			System.out.println("Elemento: " + s);
		}
	}

}
