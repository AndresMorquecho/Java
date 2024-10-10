package com.krakedev.persistencia.ejercicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

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

	public static ArrayList<Empleado> BusquedaEmpleados(String nombreEmpleado) throws Exception {

		ArrayList<Empleado> empleadosHayados = new ArrayList<Empleado>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = ConexionBDD.Conectar();
			ps = con.prepareStatement("select * from empleado where nombre like ?");

			ps.setString(1, "%" + nombreEmpleado + "%");

			rs = ps.executeQuery();

			while (rs.next()) {

				int codigo_empleado = rs.getInt("codigo_empleado");
				String nombre = rs.getString("nombre");
				Date fecha = rs.getDate("fecha");
				Date hora = rs.getTime("hora");

				Empleado empleado = new Empleado(codigo_empleado, nombre, fecha, hora);

				empleadosHayados.add(empleado);

			}

		} catch (Exception e) {
			LOGGER.error("No fue posible conectarse a la base de datos", e);
			throw new Exception("No fue posible conectarse a la base de  datos", e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("No fue posible conectarse a la base de datos", e);
				throw new Exception("No fue posible conectarse a la base de  datos", e);
			}
		}

		return empleadosHayados;
	}

	public static Empleado BuscarporCodigoEmpleado(int codigoEmpleado) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		Empleado empleadoHaydo = new Empleado();
		
		
		try {
			con = ConexionBDD.Conectar();
			ps = con.prepareStatement("select * from empleado where codigo_empleado = ?");
			
			ps.setInt(1, codigoEmpleado);
			
			rs = ps.executeQuery();
			
			 if (rs.next()) {
					int codigo_empleado = rs.getInt("codigo_empleado");
					String nombre=  rs.getString("nombre");
					Date fecha = rs.getDate("fecha");
					Date hora = rs.getTime("hora");
					
					empleadoHaydo.setCodigoEmpleado(codigo_empleado);
					empleadoHaydo.setNombre(nombre);
					empleadoHaydo.setFecha(fecha);
					empleadoHaydo.setHora(hora);
					 
			 }
			

			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			LOGGER.error("No fue posible realizar la consulta SQL", e);
			throw new Exception("No fue posible realizar la consulta SQL", e);

		} finally {

			con.close();
		}
		
		
		return empleadoHaydo;
	}
}
