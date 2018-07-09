package br.com.aldtech.sistema.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.aldtech.sistema.model.Pedido;
import br.com.aldtech.sistema.service.PedidoService;

@Path("/pedido")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PedidoResource {
	
	@Inject
	private PedidoService pedidoService;
	
	@GET
	public List<Pedido> findAll(){
		return pedidoService.findAll();
	}
	
	@GET
	@Path("/{id}")
	public Pedido findOne(@PathParam("id") Integer id) {
		return pedidoService.findOne(id);
	} 
	
	@POST
	public Pedido create(Pedido pedido) {
		pedidoService.create(pedido);
		return pedido;
	}

	
	@PUT
	public Pedido update(Pedido pedido) {
		pedidoService.update(pedido);
		return pedido;
	}
	
	@DELETE
	@Path("/{id}")
	public void delete(@PathParam("id") Integer id) {
		pedidoService.delete(id);
	}
}
