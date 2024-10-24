package krakedev.com.inventario.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import krakedev.com.inventario.entidades.Categoria;

@Path("Categoria")
public class ServiciosCategoria {

	
	@Path("insertar")
	@POST
	@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public void insertar(Categoria categoria) {
		
		
		System.out.println("Nueva categoria agregada: " + categoria);
		
		
	}
	
	
	
	
}
