package interfacesMITOCODE;

public class PajaroDeDibujos extends Pajaro 
implements iConversador, iConductor {

	@Override
	public void conduce() {
		System.out.println("Conduciendo como un p�jaro...");
	}

	@Override
	public void habla() {
		System.out.println("Hablando como un p�jaro...");
	}

}
