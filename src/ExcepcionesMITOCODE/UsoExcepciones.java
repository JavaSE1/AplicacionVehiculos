package ExcepcionesMITOCODE;

import java.io.IOException;

public class UsoExcepciones {

	private void proceso1() {
		int a = 7, b = 0;
		double division = a/b;
		System.out.println(division);
	}
	
	public static void main(String[] args) {

		//Si no hacemos nada, la app "cae"
		UsoExcepciones us = new UsoExcepciones();
		us.proceso1();

		/******************************************************/
		
//		try {
//			UsoExcepciones uso = new UsoExcepciones();
//			uso.proceso1();
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		} finally {
//			System.out.println("Bloque finally");
//		}
		
		/******************************************************/
		
//		//Forma 1
//		try {
////			System.out.println(1 / 0);
//			
//			UsoExcepciones uso = new UsoExcepciones();
////			UsoExcepciones uso = null;
////			uso = null;
//			uso.proceso1();
//			
//		} catch (ArithmeticException e) {
//			System.out.println("Error de división por cero: " + e.getMessage());
////			e.printStackTrace();
//		} catch (NullPointerException e) {
//			System.out.println("Excepción por null: " + e.getMessage());
//			
//		//Si no es ninguna de las anteriores, que entre por aqui
//		//Pero "EXCEPTION" debe ir siempre al final de todas (obligatorio)
////		} catch (Exception e) {
////			System.out.println("Excepción general: " + e.getMessage());
//		} finally {
//			System.out.println("Bloque finally");
//		}

		
		
//		//Forma 2		
//		 try {
//		 System.out.println(1 / 0);
//		 } catch (ArithmeticException | NullPointerException e) {
//		 System.out.println("Excepción multicatch: " + e.getMessage());
//		 } finally {
//		 System.out.println("Bloque finally");
//		 }

	}

}
