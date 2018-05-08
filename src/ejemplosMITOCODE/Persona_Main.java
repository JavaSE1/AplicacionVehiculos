package ejemplosMITOCODE;

public class Persona_Main {

	private String nombre;
	private int edad;
	
	public void saludar() {
		nombre = "Mitocode";
		edad = 24;
		System.out.println("Hola, soy " + nombre);
		System.out.println("Mi edad es " + edad);
	}
	
	public void saludar(String p_nombre) {
		System.out.println("Hola, soy " + p_nombre);
	}
	
	public String despedir(String nombre) {
//		saludar("Pepe");
		return "Adiós, me despido. " + nombre;
	}
	
	
	public static void main(String[] args) {

//		saludar(); //Esto nunca desde un main (desde otro método si)
//		Persona_Main.saludar(); //Si todo es static, esto se permite
		
		Persona_Main persona1 = new Persona_Main();
		persona1.saludar();
		
//		//Forma 1
//		String resultado = persona1.despedir("Pepe");
//		System.out.println(resultado);
		
//		//Forma 2
//		System.out.println(persona1.despedir("Paco"));
	}

}
