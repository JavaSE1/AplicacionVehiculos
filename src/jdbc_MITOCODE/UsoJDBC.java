package jdbc_MITOCODE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsoJDBC {

	public static void main(String[] args) throws SQLException {
		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";//"org.postgresql.Driver";
		final String DB_URL = "jdbc:mysql://localhost:3306/dbtest";//"jdbc:postgresql://localhost:5432/ejemplo";
		final String USER = "root";//"postgres";
		final String PASS = "123456789";
		
		
		/*******************************************************/
		
		Connection conexion = null;
		String sql = "INSERT INTO PERSONA(nombre) VALUES('Mitocode')";
		try {
//			Class.forName(JDBC_DRIVER); //Registra el Driver
			conexion = DriverManager.getConnection(DB_URL, USER, PASS);
			
			PreparedStatement st = conexion.prepareStatement(sql);
			
			st.executeUpdate();
			st.close();
			
		} catch (Exception e) {
			System.out.println("Excepción: " + e.getMessage());
//			e.printStackTrace();
		} finally {
			
			//if(conexion != null && !conexion.isClosed() ) {
			if(conexion != null) {
				if(!conexion.isClosed()) {
					conexion.close();
				}
			}
		}
		
		/*******************************************************/
		
//		//Usando TRY-WITH-RESOURCES
//		String sql = "INSERT INTO PERSONA(nombre) VALUES('Mitocode')";
//		
//		try (Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS)) {
//			Class.forName(JDBC_DRIVER);
//			PreparedStatement st = conexion.prepareStatement(sql);
//			
//			st.executeUpdate();
//			st.close();
//		} catch (Exception e) {
//			System.out.println("Excepción: " + e.getMessage());
////			e.printStackTrace();
//		} 

		/*******************************************************/
		
//		//Usando un parametro
//		String sql = "INSERT INTO PERSONA(nombre) VALUES(?)";
//		
//		try (Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS)) {
//			Class.forName(JDBC_DRIVER);
//			PreparedStatement st = conexion.prepareStatement(sql);
//			st.setString(1, "Pepe");
//			
//			st.executeUpdate();
//			st.close();
//		} catch (Exception e) {
//			System.out.println("Excepción: " + e.getMessage());
//			e.printStackTrace();
//		} 
		
	}

}
