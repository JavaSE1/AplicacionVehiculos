package ExcepcionesMITOCODE;

public class UsoThrow1 {

	public static void main(String[] args) {

		UsoThrow1 u = new UsoThrow1();
		
		try {
			u.metodo1();	
//			u.lanzarExcepcion();
		} catch (Exception e) {
			System.out.println("Main: Hay excepci�n");
		}
		
	}
	
//	public void lanzarExcepcion() {
//		throw new ArithmeticException();
//	}
	
	public void metodo1() {
		try {
			metodo2(); //OJO!! No hace falta crear una instancia para invocar a este metodo
		} catch (Exception e) {
			System.out.println("M�todo1: Capturo la excepci�n: " + e.getMessage());
//			throw e;
		}
		
	}
	
	public void metodo2() throws Exception {
		try {
			metodo3();
		} catch (Exception e) {
			System.out.println("M�todo 2. Hay una excepci�n: " + e.getMessage());
			throw e;
		}
		
	}

	public void metodo3() throws Exception  {
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			System.out.println("M�todo 3: Hay una excepci�n: " + e.getMessage());
			throw e;
//			throw new Exception("Enviando otra excepci�n");
		}
		
	}	
}
