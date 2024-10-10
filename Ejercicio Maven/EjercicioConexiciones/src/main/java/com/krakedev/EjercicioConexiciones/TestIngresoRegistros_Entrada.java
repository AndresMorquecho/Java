package com.krakedev.EjercicioConexiciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestIngresoRegistros_Entrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection connection = null;
		PreparedStatement ps = null;

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"israel04");

			ps = connection.prepareStatement("insert into empleado(codigo_empleado, nombre, fecha, hora)" 
			+ "values(?,?,?,?)");

			ps.setInt(1, 1111);
			ps.setString(2, "Fernado Parrales");
			ps.setDate(3, Utilitarios.convertirFechaSql("23/06/22"));
			ps.setTime(4, Utilitarios.ConvertirHora("10:50"));

			ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
