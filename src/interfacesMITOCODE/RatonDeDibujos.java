package interfacesMITOCODE;

public class RatonDeDibujos extends Raton 
implements iConductor, iConversador {

	@Override
	public void habla() {
		System.out.println("Hablando como un rat�n...");
	}

	@Override
	public void conduce() {
		System.out.println("Conduciendo como un rat�n...");
	}

}
