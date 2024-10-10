package com.krakedev.persistencia.ejercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Time;

import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Empleado;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminEmpleado {

	private static final Logger LOGGER = org.apache.logging.log4j.LogManager.getLogger(AdminEmpleado.class);

	public static void AgregarEmpleado(Empleado empleado) throws Exception {

		Connection con = null;
		PreparedStatement ps = null;

		try {

			con = ConexionBDD.Conectar();
			ps = con.prepareStatement("insert into empleado(codigo_empleado, nombre, fecha, hora)" + "values(?,?,?,?)");

			ps.setInt(1, empleado.getCodigoEmpleado());
			ps.setString(2, empleado.getNombre());
			ps.setDate(3, new java.sql.Date(empleado.getFecha().getTime()));
			ps.setTime(4, new Time(empleado.getHora().getTime()));

			ps.executeUpdate();

		} catch (Exception e) {

			LOGGER.error("Error en la conexión a la base de datos" + e.getMessage());
			throw new Exception("Error en la conexión a la base de datos");

		} finally {

			con.close();

		}

	}

	public static void ActualizarEmpleado(Empleado empleado) throws Exception {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = ConexionBDD.Conectar();
			ps = con.prepareStatement("update empleado set nombre = ?, fecha = ?, hora = ? where codigo_empleado = ?");

			ps.setString(1, empleado.getNombre());
			ps.setDate(2, new java.sql.Date(empleado.getFecha().getTime()));
			ps.setTime(3, new Time(empleado.getHora().getTime()));
			ps.setInt(4, empleado.getCodigoEmpleado());

			ps.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.error("Error al conectarse a la base da datos", e);
			throw new Exception("Error en la conexión de base de datos" + e.getMessage());
		} finally {
			con.close();
		}

	}

	public static void EliminarEmpleado(Empleado empleado) throws Exception {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = ConexionBDD.Conectar();
			ps = con.prepareStatement("delete from empleado where codigo_empleado  = ?");

			
			ps.setInt(1, empleado.getCodigoEmpleado());
			ps.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.error("Error al conectarse a la base datos", e);
			throw new Exception("Error al conectarse a la base da datos", e);
		}

	}
}
