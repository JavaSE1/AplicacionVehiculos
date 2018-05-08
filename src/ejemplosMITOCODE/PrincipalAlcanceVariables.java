package ejemplosMITOCODE;

public class PrincipalAlcanceVariables {

	int edad = 24;
	
	public void mostrarEdad() {
		int edad = 23;
		System.out.println(edad);
	}

	public void mostrarEdad2() {
		System.out.println(edad);
	}

	public static void main(String[] args) {

		PrincipalAlcanceVariables pa = new PrincipalAlcanceVariables();
		pa.mostrarEdad();
		pa.mostrarEdad2();
	}

}
