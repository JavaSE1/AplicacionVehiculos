package ejemplosPOO_MITOCODE;

public class Coche {
	
	private int ruedas;
	private String motor;
	
	public Coche(int ruedas, String motor) {
		this.ruedas = ruedas;
		this.motor = motor;
	}

	public Coche() {
		
		System.out.println("\nSoy un nuevo objeto de la clase COCHE");
	}
	
	public void arrancar() {
		System.out.println("El coche con motor " + motor + " y " + ruedas + " ruedas, está arrancando ");
	}
	
	public void seguir(Coche c) {
		
		System.out.println("El coche con motor " + this.motor +
							" y " + this.ruedas +
							" ruedas, está siguiendo al coche con motor " 
							+ c.motor + " y " + c.ruedas + " ruedas");
	}

}
