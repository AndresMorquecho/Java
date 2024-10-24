package com.krakedev.evaluacion.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.persistencia.HistorialBDD;

@Path("funciones")
public class ServiciosCategoria {

	@Path("probarInsertar")
	@POST
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)

	public Response insertarCategoria(Categoria categoria) {
		HistorialBDD his = new HistorialBDD();
		try {
			his.insertar(categoria);

			return Response.ok().build();

		} catch (Exception e) {
			return Response.serverError().entity("Error al insertar: " + e.getMessage()).build();

		}

	}

	@Path("probarActualizar")
	@PUT
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Response ActualizarCategoria(Categoria categoria) {

		HistorialBDD his = new HistorialBDD();

		try {
			his.Actualizaar(categoria);

			return Response.ok().entity("Actualización realizada").build();

		} catch (KrakeException e) {

			return Response.serverError().entity("Error al actualizar: " + e.getMessage()).build();

		}

	}

	@Path("probarBuscar/{idParam}")
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Response BuscarPorId(@PathParam("idParam") String id) {

		HistorialBDD his = new HistorialBDD();

		try {
			Categoria categoria = new Categoria();

			categoria = his.BuscarPorId(id);

			return Response.ok().entity("Categoria encontrada: " + categoria).build();

		} catch (KrakeException e) {

			return Response.serverError().entity("Error en la busqueda de categoria: " + e.getMessage()).build();
		}

	}

	@Path("todos")
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public Response RecuperarTodos() {
		HistorialBDD his = new HistorialBDD();

		try {
			ArrayList<Categoria> cat = his.recuperarTodos();

			return Response.ok(cat).build();

		} catch (KrakeException e) {
			// TODO Auto-generated catch block
			return Response.serverError().entity("Error al intentar recuperar todas la categorias: " + e.getMessage())
					.build();
		}

	}

}
