package ExcepcionesMITOCODE;

public class UsoExcepcionPersonalizada2 {

	public static void main(String[] args) {//throws EdadException {

		try {
			UsoExcepcionPersonalizada2 u  = new UsoExcepcionPersonalizada2();
			u.metodo1();			
		} catch (Exception e) {
			System.out.println("Soy main. Capturada excepci�n: " + e.getMessage());
		}
	}

	public void metodo1() {// throws EdadException {
		System.out.println("Soy m�todo1");
		try {
			throw new EdadException("Mensaje erroneo");	
		} catch (Exception e) {
			System.out.println("Soy metodo1. Capturada excepci�n: " + e.getMessage());
		}
//		System.out.println("FIN");
	}
}
