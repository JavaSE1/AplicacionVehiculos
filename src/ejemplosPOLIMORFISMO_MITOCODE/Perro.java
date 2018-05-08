package ejemplosPOLIMORFISMO_MITOCODE;

public class Perro extends Animal {

	String raza;

	public Perro(String nombre, int edad, String tipo_alimentacion, String raza) {
		super(nombre, edad, tipo_alimentacion);
		this.raza = raza;
	}
	
//	public Perro(String nombre, int edad, String tipo_alimentacion) {
//	super(nombre, edad, tipo_alimentacion);
//}	

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", nombre=" + nombre + ", edad=" + edad + ", tipo_alimentacion="
				+ tipo_alimentacion + "]";
	}

	@Override
	public void alimentarse() {
		System.out.println("Come carne");
	}
		
	
	
}
