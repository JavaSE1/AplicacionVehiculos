package ejemplosHERENCIA_MITOCODE;

public class Perro extends Animal {

	private String raza;

	public Perro(String nombre, int edad, String tipo_alimentacion, String raza) {
		super(nombre, edad, tipo_alimentacion);
		this.raza = raza;
	}

	public Perro() {
	}
	

//	@Override
//	public String toString() {
//		return "Perro [raza=" + this.raza 
//				+ ", nombre=" + this.getNombre() 
//				+ ", edad=" + this.getEdad()
//				+ ", tipo_alimentacion=" + this.getTipo_alimentacion() + "]";
//	}

	//GETTERS y SETTERS
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
		
	@Override
	public String toString() {
		return "Animal [ nombre=" + getNombre() 
				+ ", tipo_alimentacion=" + getTipo_alimentacion()
				+ ", edad=" + getEdad() 
				+ ", raza=" + getRaza() 
				+ "]";
	}
	
	
	
}
