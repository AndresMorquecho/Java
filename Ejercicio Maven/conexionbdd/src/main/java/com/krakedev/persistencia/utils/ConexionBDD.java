package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.ejercicios.AdminPersonas;

public class ConexionBDD {

	private static final Logger LOGGER = org.apache.logging.log4j.LogManager.getLogger(AdminPersonas.class);
	private final static  String DRIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
	private final static String USER = "postgres";
	private final static String PASSWORD = "israel04";
	
	public static Connection Conectar() throws Exception {
		
		
		Connection connection = null;
		
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL,USER,PASSWORD);
			
			LOGGER.debug("Conexion exitosa");
			
		} catch (ClassNotFoundException | SQLException e) {

			LOGGER.error("Error en la instraestructura o conexión",e );
			throw new Exception("Error en la infraestructura o conexión ");
			
		}
		
		
		return connection;
		
		
		
		
		
		
}

}