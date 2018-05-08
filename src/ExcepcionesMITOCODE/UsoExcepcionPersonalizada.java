package ExcepcionesMITOCODE;

import java.util.Scanner;

public class UsoExcepcionPersonalizada {

	public static void main(String[] args) { //throws EdadException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su edad:");
		int edad = sc.nextInt();
		final int EDAD_MAXIMA = 100;
		
		try {
			if(edad < EDAD_MAXIMA) {
				System.out.println("Bienvenido");
			}else {
				throw new EdadException("Edad no permitida, edad no correcta");
			}
		} catch (EdadException e) {
			System.out.println("Se ha producido una excepción: " + e.getMessage());
		}
		
	}

}
