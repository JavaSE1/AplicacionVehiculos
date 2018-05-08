package jdbc_MITOCODE;

public class Persona {

	private int ide;
	private String nombree;
	
	public Persona() {
	}

	public Persona(int ide, String nombree) {
		this.ide = ide;
		this.nombree = nombree;
	}
	
	public int getIde() {
		return ide;
	}
	public void setIde(int ide) {
		this.ide = ide;
	}
	public String getNombree() {
		return nombree;
	}
	public void setNombree(String nombree) {
		this.nombree = nombree;
	}

	@Override
	public String toString() {
		return "Persona [ide=" + ide + ", nombree=" + nombree + "]";
	}
	
	
}
