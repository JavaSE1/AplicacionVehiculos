package jdbc_MITOCODE.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jdbc_MITOCODE.Persona;
import jdbc_MITOCODE.interfaces.DAOPersona;

public class DAOPersonaImpl extends Conexion implements DAOPersona{

	@Override
	public void registrar(Persona per) throws Exception {

		String sql = "INSERT INTO PERSONA(nombre) VALUES(?)";
		try {
			this.conectar();
			PreparedStatement st = conexion.prepareStatement(sql);
			st.setString(1, per.getNombree());
			st.executeUpdate();
			
		} catch (Exception e) {
			throw e; 
			
		} finally {
			this.cerrar();
		}
	}

	@Override
	public void modificar(Persona per) throws Exception {

		String sql = "UPDATE PERSONA SET NOMBRE=? WHERE ID=?";
		try {
			this.conectar();
			PreparedStatement st = conexion.prepareStatement(sql);
			st.setString(1, per.getNombree());
			st.setInt(2, per.getIde());
			st.executeUpdate();
			
		} catch (Exception e) {
			throw e; 
			
		} finally {
			this.cerrar();
		}
	}

	@Override
	public void eliminar(Persona per) throws Exception {

		String sql = "DELETE FROM PERSONA WHERE ID=?";
		try {
			this.conectar();
			PreparedStatement st = conexion.prepareStatement(sql);
			st.setInt(1, per.getIde());
			st.executeUpdate();
			
		} catch (Exception e) {
			throw e; 
			
		} finally {
			this.cerrar();
		}
	}

	@Override
	public List<Persona> listar() throws Exception {
		String sql = "SELECT * FROM PERSONA";
		List<Persona> lista = new ArrayList<>();
		
		try {
			this.conectar();
			PreparedStatement st = conexion.prepareStatement(sql);
			
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Persona p = new Persona();
				p.setIde(rs.getInt("id"));
				p.setNombree(rs.getString("nombre"));
				lista.add(p);
			}
			rs.close();
			st.close();
			
			System.out.println(lista);
			
		} catch (Exception e) {
			System.out.println("Excepción: " + e.getMessage());
			e.printStackTrace();
		} 	
		return lista;
	}

	
}
