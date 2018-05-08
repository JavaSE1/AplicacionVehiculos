package ejemplosPOOModificadoresConstructores;

import ejemplosPOOModificadoresConstructores2.Coche;

public class CocheF1 extends Coche {

	public CocheF1(String motor, String difusor) {
		super(motor);
		this.difusor = difusor;
	}

	public CocheF1() {

	}

	// Hereda RUEDAS, MOTOR
	// NO hereda MP3 (private), ASIENTOCOPILOTO (package)
	private String difusor; // Normal o soplado

	/**************************/

	public int getRuedas() {
		return this.ruedas;
	}

	public String getMotor() {
		if (motor == null) {
			motor = "SIN MOTOR";
		}
		return motor;
	}

	public String getDifusor() {
		return difusor;
	}

	/**************************/

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public void setDifusor(String difusor) {
		this.difusor = difusor;
	}

	/*****************************/
	
	@Override
	public String toString() {
		return "CocheF1 [difusor=" + difusor + ", motor=" + motor + "]";
	}
	
	
	
	
	
}
