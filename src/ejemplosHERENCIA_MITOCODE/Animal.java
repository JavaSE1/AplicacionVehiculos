package ejemplosHERENCIA_MITOCODE;

public class Animal {

	private String nombre;
	private String tipo_alimentacion;
	private int edad;
	
	public Animal(String nombre, int edad, String tipo_alimentacion) {
		this.nombre = nombre;
		this.edad = edad;
		this.tipo_alimentacion = tipo_alimentacion;
	}

	public Animal() {
	}

	//GETTERS y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTipo_alimentacion() {
		return tipo_alimentacion;
	}

	public void setTipo_alimentacion(String tipo_alimentacion) {
		this.tipo_alimentacion = tipo_alimentacion;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", tipo_alimentacion=" + tipo_alimentacion + ", edad=" + edad + "]";
	}

	
	
	
}
