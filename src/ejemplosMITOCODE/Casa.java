package ejemplosMITOCODE;

public class Casa implements Comparable<Casa>{

	private String nombre;
	private int pisos;
	
	public Casa(String nombre, int pisos) {
		this.nombre = nombre;
		this.pisos = pisos;
	}


	@Override
	public int compareTo(Casa c) {
//		return this.nombre.compareTo(c.nombre);
//		return c.pisos - this.pisos;
		if(c.nombre.equals(this.nombre)) {
			return this.pisos - c.pisos;
		}else {
			return this.nombre.compareTo(c.nombre);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + pisos;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Casa other = (Casa) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (pisos != other.pisos)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Casa [nombre=" + nombre + ", pisos=" + pisos + "]";
	}
	
	//GETTERS y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPisos() {
		return pisos;
	}
	public void setPisos(int pisos) {
		this.pisos = pisos;
	}	
	
}
