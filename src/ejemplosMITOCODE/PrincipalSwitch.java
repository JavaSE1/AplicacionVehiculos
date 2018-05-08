package ejemplosMITOCODE;

public class PrincipalSwitch {

	public static void main(String[] args) {

//		String cad = "Mito";
//		String cad = "Code";
		String cad = "aaa";
		
		switch (cad) {
		case "Mito":
			System.out.println("cad vale \"Mito\"");
			break;
		case "Code":
			System.out.println("cad vale \"Code\"");
			break;
		default:
			System.out.println("Por defecto");
			break;
		}
		
		System.out.println("FIN");
		
	}

}
