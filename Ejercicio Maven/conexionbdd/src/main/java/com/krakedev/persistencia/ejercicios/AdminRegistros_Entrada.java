package com.krakedev.persistencia.ejercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.RegistrosEntrada;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminRegistros_Entrada {

	private static final Logger LOGGER = org.apache.logging.log4j.LogManager.getLogger(AdminRegistros_Entrada.class);

	public static void agregarRegistroEntrada(RegistrosEntrada registroEntrada) {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = ConexionBDD.Conectar();
			ps = con.prepareStatement(
					"insert into registros_entrada(codigo_registro, cedula_empleado, fecha, hora, codigo_empleado)"
							+ "values(?,?,?,?,?)");

			ps.setInt(1, registroEntrada.getCodigo_registro());
			ps.setString(2, registroEntrada.getCedula_empleado());
			ps.setDate(3, new java.sql.Date(registroEntrada.getFecha().getTime()));
			ps.setTime(4, new Time(registroEntrada.getHora().getTime()));
			ps.setInt(5, registroEntrada.getCodigoEmpleado().getCodigoEmpleado());

			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al intentar conectar a la base de datos", e);

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error al intentar cerrar la conexión", e);
			}
		}

	}

	public static void ActualizarRegistrosEntrada(RegistrosEntrada registroEntrada) {

		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = ConexionBDD.Conectar();
			ps = con.prepareStatement(
					"update registros_Entrada set cedula_empleado = ?, fecha = ?, hora =? where codigo_registro = ?");

			ps.setString(1, registroEntrada.getCedula_empleado());
			ps.setDate(2, new java.sql.Date(registroEntrada.getFecha().getTime()));
			ps.setTime(3, new Time(registroEntrada.getHora().getTime()));
			ps.setInt(4, registroEntrada.getCodigo_registro());

			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al intentar conectar a la base de datos", e);

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error al intentar cerrar la conexión", e);
			}

		}

	}
	
	
	public static void eliminarRegistrosEntrada(RegistrosEntrada registroEntrada) throws Exception {
		
		
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = ConexionBDD.Conectar();
			ps = con.prepareStatement("delete from registros_Entrada where codigo_registro  = ?");

			
			ps.setInt(1, registroEntrada.getCodigo_registro());
			ps.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.error("Error al conectarse a la base datos", e);
			throw new Exception("Error al conectarse a la base da datos", e);
		}		
		
		
	}
	

}
