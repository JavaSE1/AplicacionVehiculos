package ejemplosPOLIMORFISMO_MITOCODE;

public abstract class Animal {

	String nombre;
	int edad;
	String tipo_alimentacion;
	
	public Animal(String nombre, int edad, String tipo_alimentacion) {
		this.nombre = nombre;
		this.edad = edad;
		this.tipo_alimentacion = tipo_alimentacion;
	}

	public Animal() {
	}
	
	public abstract void alimentarse();
	
	public void moverse() {
		System.out.println("El animal se está moviendo");
	}
	
}
