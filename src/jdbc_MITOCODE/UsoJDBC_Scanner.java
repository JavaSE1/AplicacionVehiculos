package jdbc_MITOCODE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UsoJDBC_Scanner {

	private String solicitarDatos() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Di un nombre:");
		String nombre = sc.next();
		return nombre;
	}
	
	public void registrarBD(String valor) {
		
		final String JDBC_DRIVER = "org.postgresql.Driver";
		final String DB_URL = "jdbc:postgresql://localhost:5432/ejemplo";
		final String USER = "postgres";
		final String PASS = "123456789";
		
		
		String sql = "INSERT INTO PERSONA(nombre) VALUES(?)";
		
		try (Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS)) {
			Class.forName(JDBC_DRIVER);
			PreparedStatement st = conexion.prepareStatement(sql);
			st.setString(1, valor);
			
			st.executeUpdate();
			st.close();
		} catch (Exception e) {
			System.out.println("Excepción: " + e.getMessage());
//			e.getMessage();
		} 
	}
	
	public static void main(String[] args) throws SQLException {
		
		UsoJDBC_Scanner u = new UsoJDBC_Scanner();
		String valor = u.solicitarDatos();
		if (valor != null) {
			u.registrarBD(valor);
		}
		
	}



}
