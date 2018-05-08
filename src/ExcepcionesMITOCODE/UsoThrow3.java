package ExcepcionesMITOCODE;

public class UsoThrow3 {

	public static void main(String[] args) {

		UsoThrow3 u = new UsoThrow3();
		u.metodo1();	
		
	}
	
	public void metodo1() {
		metodo2(); //OJO!! No hace falta crear una instancia para invocar a este metodo
	}
	
	public void metodo2() {
		metodo3();
	}

	public void metodo3() {
		System.out.println(1/0);
	}	
}
