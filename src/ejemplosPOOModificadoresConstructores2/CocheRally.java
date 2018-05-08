package ejemplosPOOModificadoresConstructores2;

public class CocheRally extends Coche {

	//Hereda RUEDAS, MOTOR, ASIENTOCOPILOTO
	//NO hereda MP3 (private)
	private String aleron; //Normal o extra

	
	public CocheRally(String motor, String asientoCopiloto, String aleron) {
		super(motor, asientoCopiloto);
		this.aleron = aleron;
	}
	public CocheRally() {
		
	}

	/***********************/
	
	public String getAleron() {
		return aleron;
	}
	public int getRuedas() {
		return ruedas;
	}
	public String getMotor() {
		return motor;
	}
	public String getAsientoCopiloto() {
		return asientoCopiloto;
	}
	
	/***********************/
	
	public void setAleron(String aleron) {
		this.aleron = aleron;
	}
	public void setMotor(String motor) {
		this.aleron = motor;
	}	
	public void setAsientoCopiloto(String asientoCopiloto) {
		this.asientoCopiloto = asientoCopiloto;
	}	
//	public void setRuedas(int numRuedas) {
//		this.ruedas = numRuedas;
//	}
	
	/***********************/
	
	@Override
	public String toString() {
		return "CocheRally [aleron=" + aleron + ", motor=" + motor + ", asientoCopiloto=" + asientoCopiloto + "]";
	}
	
}
