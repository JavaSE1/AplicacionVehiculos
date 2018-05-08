package ejemplosCOLECCIONES_MITOCODE;

public class Persona {

	private int id;
	private String nombre;
	
	//GETTERS y SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@Override
	public String toString() {
		return "Persona [getId()=" + getId() + ", getNombre()=" + getNombre() + "]";
	}
	
	
	
}
