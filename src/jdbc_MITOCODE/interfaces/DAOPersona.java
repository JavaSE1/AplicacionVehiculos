package jdbc_MITOCODE.interfaces;

import java.util.List;

import jdbc_MITOCODE.Persona;

public interface DAOPersona {
	
	public void registrar(Persona per) throws Exception;
	public void modificar(Persona per) throws Exception;
	public void eliminar(Persona per) throws Exception;
	public List<Persona> listar() throws Exception;

}
