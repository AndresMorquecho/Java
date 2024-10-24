package krakedev.com.inventario.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import krakedev.com.inventario.entidades.Categoria;
import krakedev.com.inventario.entidades.Producto;

@Path("productos")
public class ServiciosProductos {

	@Path("insertar")
	@POST
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public void insertar(Producto producto) {
		System.out.println("Nuevo Producto Agregado >>>>>: " + producto);
	}

	@Path("actualizar")
	@PUT
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public void actualizar(Producto producto) {
		System.out.println("Actualizando Producto >>>>>: " + producto);
	}

	@Path("consultar")
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public ArrayList<Producto> recuperarTodos() {

		ArrayList<Producto> productos = new ArrayList<Producto>();
		Categoria cat = new Categoria(1, "Dulces");
		Producto p1 = new Producto("a1", "Chupete", cat, 0.50, 100);
		Producto p2 = new Producto("a2", "Barrilete", cat, 0.45, 20);
		Producto p3 = new Producto("a3", "Tango", cat, 0.10, 20);
		productos.add(p1);
		productos.add(p2);
		productos.add(p3);

		return productos;
	}

}
