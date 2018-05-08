 package jdbc_MITOCODE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsoJDBCListar {

	public static void main(String[] args)  {
		
		UsoJDBCListar u = new UsoJDBCListar();
		List<Persona> lista2 = u.listar();
		
		for(Persona p:lista2) {
			System.out.println(p.toString());
		}
	}
	
	public List<Persona> listar() {
		
		List<Persona> lista = new ArrayList<>();
		
		final String JDBC_DRIVER = "org.postgresql.Driver";
		final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
		final String USER = "postgres";
		final String PASS = "123456789";
		
//		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//		final String DB_URL = "jdbc:mysql://localhost:3306/dbtest";
//		final String USER = "root";
//		final String PASS = "123456789";
		
		
		String sql = "SELECT * FROM PERSONA";
//		sql = "SELECT * FROM `persona`";
;		
		try (Connection conexion = 
				DriverManager.getConnection(DB_URL, USER, PASS)) {
//			System.out.println("conexion.getClass().getName(): " + conexion.getClass().getName());
			
//			Class.forName(JDBC_DRIVER);
			
			PreparedStatement st = conexion.prepareStatement(sql);
//			System.out.println("st.getClass().getName(): " + st.getClass().getName());

			ResultSet rs = st.executeQuery();
//			System.out.println("rs.getClass().getName(): " + rs.getClass().getName());
			
			while (rs.next()) {
				Persona p = new Persona();
//				int x1 = rs.getInt("id");
//				p.setIde(x1);
//				String x2 = rs.getString("nombre");
//				p.setNombree(x2);
				
				p.setIde(rs.getInt("id"));
				p.setNombree(rs.getString("nombre"));
				
				lista.add(p);
			}
			rs.close();
			st.close();
			
//			System.out.println(lista);
			
		} catch (Exception e) {
			System.out.println("Excepción: " + e.getMessage());
//			e.printStackTrace();
		} 
		return lista;

	}

}
