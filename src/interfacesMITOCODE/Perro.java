package interfacesMITOCODE;

public class Perro implements iAnimal, iSerVivo {

	@Override
	public void mostrarTipoDeAnimal() {
		System.out.println("Soy un mamífero");
	}

	@Override
	public String mostrarNombre() {
		return "Kaiser";
	}

	@Override
	public void mostrarVida() {
		System.out.println("100% vivo");
	}

}
