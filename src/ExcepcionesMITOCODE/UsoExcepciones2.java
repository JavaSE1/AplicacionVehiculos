package ExcepcionesMITOCODE;

import java.io.IOException;

public class UsoExcepciones2 {

	private void proceso1() {
		int a = 7, b = 0;
		double division = a/b;
		System.out.println(division);
	}
	
	public static void main(String[] args) {

		//Forma 1
		try {
//			System.out.println(1 / 0);
			
			UsoExcepciones2 uso = new UsoExcepciones2();
			uso.proceso1();
			
		} catch (ArithmeticException e) {
			System.out.println("Error de división por cero: " + e.getMessage());
//			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Excepción por null: " + e.getMessage());
//		} catch (Exception e) {
//			System.out.println("Excepción general: " + e.getMessage());
		} finally {
			System.out.println("Bloque finally");
		}

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
