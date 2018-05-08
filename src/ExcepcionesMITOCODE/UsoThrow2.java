package ExcepcionesMITOCODE;

public class UsoThrow2 {

	public static void main(String[] args) {

		UsoThrow2 u = new UsoThrow2();
		
		try {
			u.metodo1();	
		} catch (Exception e) {
			System.out.println("Soy main: Hay excepción");
		}
		
	}
	
	public void metodo1() {
		try {
			metodo2();	
		} catch (Exception e) {
//			throw e;
			System.out.println("Soy metodo1: Capturo la excepción");
		}
		
	}
	
	public void metodo2() {
		try {
			System.out.println(1/0);
		} catch (Exception e) {
//			System.out.println("Hay una excepción");
			throw e;
		}
		
	}
}
