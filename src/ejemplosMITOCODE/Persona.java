package ejemplosMITOCODE;

public class Persona {

	public String nombre;
	public static String nombreDeClase = "Clase Persona";
	
	//TODO: Poner "nombre" como "private" y crear GET y SET
	
	//TODO: Me falta no se que
	
	public void metodoDeInstancia() {
		System.out.println("Método de instancia de la persona: " + nombre);
	}
	
	public static void metodoDeClase_o_Estatico() {
		System.out.println("Método estático: " + nombreDeClase);
	}
	
}
