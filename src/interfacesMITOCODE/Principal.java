package interfacesMITOCODE;

public class Principal {

	public static void main(String[] args) {

//		Perro p = new Perro();
//		
//		p.mostrarTipoDeAnimal();
//		
//		String nombre = p.mostrarNombre();
//		System.out.println("nombre: " + nombre);
//		
//		p.mostrarVida();
		
		/*********************************/
		
		PajaroDeDibujos piolin = new PajaroDeDibujos();
		piolin.vuela();
		piolin.conduce();
		piolin.habla();
		
		RatonDeDibujos mickey = new RatonDeDibujos();
		mickey.roe();
		mickey.habla();
		mickey.conduce();
		
		/*********************************/
		
		iConversador woodywoodpeker = new PajaroDeDibujos();
		woodywoodpeker.habla();
		
		
		
	}

}
