package ejemplosPOOModificadoresConstructores2;

public class Coche {
	
	public Coche(String motor, String asientoCopiloto) {
		this.motor = motor;
		this.asientoCopiloto = asientoCopiloto;
	}
	public Coche(String motor) {
		this.motor = motor;
	}
	public Coche() {
	}


	// La puede heredar COCHERALLY, COCHEF1 (ambos por heredar de COCHE)
	protected int ruedas = 4;

	// La puede heredar COCHERALLY, COCHEF1 (ambos por heredar de COCHE)
	protected String motor;

	// La puede heredar COCHEF1 (por estar en distinto paquete), pero si COCHERALLY
	// (por estar en el mismo paquete)
	String asientoCopiloto; // normal o deportivo

	// No la puede heredar ni COCHERALLY ni COCHEF1
	private String mp3; // Sony o Philips.

	// public String color;

}
