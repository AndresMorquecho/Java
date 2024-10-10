package com.krakedev.conexionbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestConexcion {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "israel04");
			System.out.println("Conexión exitosa");
			
			
			
			ps = connection.prepareStatement("INSERT INTO personas2 (cedula, nombre, apellido)" + "values(?,?,?)" );
			
			
			ps.setString(1, "97531");
			ps.setString(2, "Sofia");
			ps.setString(3, "Gómez");
			
			
			ps.executeUpdate();
			
			
			
		} catch (ClassNotFoundException  | SQLException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
