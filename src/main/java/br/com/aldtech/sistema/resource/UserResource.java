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

import br.com.aldtech.sistema.model.User;
import br.com.aldtech.sistema.service.UserService;

@Path("users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

	@Inject
	private UserService userService;
	
	@GET
	public List<User> findAll() {
		return userService.findAll();
	} 
	
	@GET
	@Path("/{id}")
	public User findOne(@PathParam("id") Integer id) {
		return userService.findOne(id);
	} 
	
	@POST
	public User create(User user) {
		userService.create(user);
		return user;
	}
	
	@PUT
	public User update(User user) {
		userService.update(user);
		return user;
	}
	
	@DELETE
	@Path("/{id}")
	public void delete(@PathParam("id") Integer id) {
		userService.delete(id);
	}
}
