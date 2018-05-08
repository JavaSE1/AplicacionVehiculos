package jdbc_MITOCODE;

import jdbc_MITOCODE.dao.DAOPersonaImpl;
import jdbc_MITOCODE.interfaces.DAOPersona;

public class UsoDAO {

	public static void main(String[] args) {

		//Registrar
		Persona per = new Persona();
		per.setNombree("Paco");
		
		try {
			DAOPersona dao = new DAOPersonaImpl();
			dao.registrar(per);
		} catch (Exception e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		
//		//Modificar
//		Persona per = new Persona();
//		per.setNombree("Paco");
//		per.setIde(3);
//		
//		try {
//			DAOPersona dao = new DAOPersonaImpl();
//			dao.modificar(per);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			//e.printStackTrace();
//		}
		
		//Eliminar
//		Persona per = new Persona();
//		per.setIde(2);
//		
//		try {
//			DAOPersona dao = new DAOPersonaImpl();
//			dao.eliminar(per);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			//e.printStackTrace();
//		}		
		
//		//Listar
//		try {
//			DAOPersona dao = new DAOPersonaImpl();
//			dao.listar();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
////			e.printStackTrace();
//		}			
	}

}
