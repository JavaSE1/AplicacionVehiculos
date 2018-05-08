package ejemplosPOO_MITOCODE;

public class Celular {

	String nombre;
	String color;
	
	public Celular(String nombre, String color) {
		this.nombre = nombre;
		this.color = color;
	}
	
//	public Celular(String nombre) {
//		this.nombre = nombre;
//	}
//
	public Celular() {
		System.out.println("Hola, soy un nuevo objeto de la clase CELULAR");
	}

	public void llamar() {
		System.out.println(nombre + "-" + color + " está llamando...");
	}
	
	public void llamarA(Celular ce) {
		System.out.println("Desde " + nombre + "-" + color + " estoy llamando a " + ce.nombre + "-" + ce.color + "...");
	}
	
	public static void main(String[] args) {
		
	}

	
}
