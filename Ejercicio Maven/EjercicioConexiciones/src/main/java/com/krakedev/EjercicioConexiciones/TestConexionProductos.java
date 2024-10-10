package com.krakedev.EjercicioConexiciones;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestConexionProductos {
	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement ps = null;

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"israel04");

			ps = connection.prepareStatement(
					"insert into productos(codigo,nombre, descripcion,precio,stock)" + "values(?,?,?,?,?)");

			ps.setInt(1, 16);
			ps.setString(2, "Billetera");
			ps.setString(3, "Color Rojo");
			ps.setBigDecimal(4, new BigDecimal(23));
			ps.setInt(5, 23);

			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
