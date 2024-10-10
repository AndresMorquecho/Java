package com.krakedev.persistencia.ejercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Personas;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {

	private static final Logger LOGGER = org.apache.logging.log4j.LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Personas persona) throws Exception {

		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Persona a insertar >>>>: " + persona);

		try {
			con = ConexionBDD.Conectar();
			ps = con.prepareStatement(
					"INSERT INTO Persona (cedula, nombre, apellido, codigo_estadoCivil, numeroHijos, estura, cantidadAhorrada, fecha_nacimiento, hora_nacimiento)"
							+ "Values (?,?,?,?,?,?,?,?,?)");

			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstadoCivil().getCodigo());
			ps.setInt(5, persona.getNumerHojos());
			ps.setDouble(6, persona.getEstatura());
			ps.setBigDecimal(7, persona.getCantidadAhorra());

			ps.setDate(8, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(9, new Time(persona.getHoraNacimiento().getTime()));

			ps.executeUpdate();

		} catch (Exception e) {

			LOGGER.error("Error al insertar", e);

			throw new Exception("Error al insertar");
		} finally {
			// cerrar la conexion
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error con la base datos", e);
				throw new Exception("Error con la base de datos");
			}

		}

	}

	public static void Actualizar(Personas persona) throws Exception {

		Connection con = null;

		try {
			con = ConexionBDD.Conectar();
			PreparedStatement ps = con.prepareStatement(
					"UPDATE persona SET nombre = ?, apellido = ?, codigo_estadocivil = ?, numerohijos = ?, estatura = ?, "
							+ "cantidadahorrada = ?, fecha_nacimiento = ?, hora_nacimiento = ? WHERE cedula = ?");

			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setString(3, persona.getEstadoCivil().getCodigo());
			ps.setInt(4, persona.getNumerHojos());
			ps.setDouble(5, persona.getEstatura());
			ps.setBigDecimal(6, persona.getCantidadAhorra());

			ps.setDate(7, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(8, new Time(persona.getHoraNacimiento().getTime()));
			ps.setString(9, persona.getCedula());

			ps.executeUpdate();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.error("No se puedo conectar a la base de datos", e);
			throw new Exception("No se puedo conectar a la base de datos");

		} finally {

			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error con la conexión", e);
				throw new Exception("Error al intentar cerrar");
			}

		}

	}
	
	
	
	public static void EliminarPersona(Personas persona) {
		
		
		Connection con = null;
		PreparedStatement ps =null;
		
		try {
			con = ConexionBDD.Conectar();
			ps = con.prepareStatement("Delete from persona where cedula = ?");
			
			ps.setString(1, persona.getCedula());
			
			
			ps.executeUpdate();
			
			

			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.error("Error al conectarse a la base de datos" + e.getMessage());
		}finally {
			
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error al cerrar la conexión" + e.getMessage());
			}
			
		}
		
		
		
		
		
		
		
		
	}
	
	

}
