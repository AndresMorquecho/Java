package com.krakedev.servicios;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.KrakeDevException;
import com.krakedev.persistencia.ClientesBDD;

@Path("customers")
public class ServicioClientes {

	@Path("m1")
	@GET
	public String saludar() {
		return "Hola mundo rest web services";
	}

	@Path("Buscar")
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Cliente buscar() {
		Cliente cliente = new Cliente("0603953761", "Andres", 0);
		return cliente;
	}

	@Path("insertar")
	@POST
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Response insertar(Cliente cliente) {

		System.out.println(">>>>>>>>" + cliente);
		ClientesBDD cli = new ClientesBDD();
		try {
			cli.insertar(cliente);
			return Response.ok().build();
		} catch (KrakeDevException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Response.serverError().build();
		}

	}

	@Path("actualizar")
	@PUT
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Response actualizar(Cliente cliente) {

		System.out.println("Actualizando>>>>>>>>" + cliente);
		ClientesBDD cli = new ClientesBDD();

		try {
			cli.Actualizar(cliente);
			return Response.ok().build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}

	}

	@Path("all")
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Response obtenerClientes() {

		ClientesBDD cli = new ClientesBDD();

		ArrayList<Cliente> clientes = null;
		try {
			clientes = cli.recuperarTodos();
			return Response.ok(clientes).build();
		} catch (KrakeDevException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Response.serverError().build();
		}

	}

	@Path("buscarPorCedula/{cedulaParam}")
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Response buscarPorCedula(@PathParam("cedulaParam") String cedula) {

		ClientesBDD cli = new ClientesBDD();
		Cliente cliente = null;

		try {
			cliente = cli.BuscarPorCedula(cedula);
			return Response.ok(cliente).build();
		} catch (KrakeDevException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@Path("buscarPorNhijos/{NhijosParam}")
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)

	public Response BuscarPorNHijos(@PathParam("NhijosParam") int Nhijos) {

		ClientesBDD cli = new ClientesBDD();
		try {
			ArrayList<Cliente> clientes = cli.buscarPorNHijos(Nhijos);
			return Response.ok(clientes).build();
		} catch (KrakeDevException | SQLException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
}
