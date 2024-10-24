package com.krakedev.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.KrakeDevException;
import com.krakedev.utils.ConexionBDD;

public class ClientesBDD {

	public void insertar(Cliente cliente) throws KrakeDevException {

		Connection con = null;

		try {
			con = ConexionBDD.obtenerConexion();
			PreparedStatement ps = con
					.prepareStatement("insert into clientes(cedula, nombre, numeroHijos) values (?,?,?)");
			con = ConexionBDD.obtenerConexion();
			ps.setString(1, cliente.getCedula());
			ps.setString(2, cliente.getNombre());
			ps.setInt(3, cliente.getHijos());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al insertar cliente");
		} catch (KrakeDevException e) {

			throw e;
		} finally {

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}
			}

		}

	}

	public void Actualizar(Cliente cliente) throws KrakeDevException {

		Connection con = null;

		try {
			con = ConexionBDD.obtenerConexion();
			PreparedStatement ps = con
					.prepareStatement("Update clientes set nombre = ?, numerohijos = ? where cedula = ?");

			ps.setString(1, cliente.getNombre());
			ps.setInt(2, cliente.getHijos());
			ps.setString(3, cliente.getCedula());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al actualizar cliente. Detalle: " + e.getMessage());
		} catch (KrakeDevException e) {
			throw e;
		} finally {

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}
			}

		}
	}

	public ArrayList<Cliente> recuperarTodos() throws KrakeDevException {

		ArrayList<Cliente> clientes = new ArrayList<Cliente>();

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente cliente = null;

		try {
			con = ConexionBDD.obtenerConexion();

			try {
				ps = con.prepareStatement("select cedula, nombre, numerohijos from clientes");
				rs = ps.executeQuery();

				while (rs.next()) {

					String cedula = rs.getString("cedula");
					String nombre = rs.getString("nombre");
					int numeroHijos = rs.getInt("numerohijos");

					cliente = new Cliente(cedula, nombre, numeroHijos);

					clientes.add(cliente);

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new KrakeDevException("Error al consultar. Detalles: " + e.getMessage());
			}
		} catch (KrakeDevException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			throw e;
		}

		return clientes;

	}

	public Cliente BuscarPorCedula(String cedulaBusqueda) throws KrakeDevException {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente cliente = null;

		try {
			con = ConexionBDD.obtenerConexion();

			try {
				ps = con.prepareStatement("select cedula, nombre, numerohijos from clientes where cedula=?");

				ps.setString(1, cedulaBusqueda);
				rs = ps.executeQuery();

				if (rs.next()) {

					String cedula = rs.getString("cedula");
					String nombre = rs.getString("nombre");
					int numeroHijos = rs.getInt("numerohijos");

					cliente = new Cliente(cedula, nombre, numeroHijos);
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new KrakeDevException("Error al consultar. Detalles: " + e.getMessage());
			}
		} catch (KrakeDevException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			throw e;
		}

		return cliente;

	}

	public ArrayList<Cliente> buscarPorNHijos(int numeroHijos) throws KrakeDevException, SQLException {

		ArrayList<Cliente> clientes = new ArrayList<Cliente>();

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente cliente = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("select * from clientes where numerohijos = ?");
			ps.setInt(1, numeroHijos);
			rs = ps.executeQuery();

			while (rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				int nHijos = rs.getInt("numerohijos");
				cliente = new Cliente(cedula, nombre, nHijos);
				clientes.add(cliente);
			}
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al obtener la conexión" + e);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new KrakeDevException("Error al realizar consulta, detalles: " + e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {

				throw e;
			}
		}
		return clientes;
	}
}
