package br.com.clonestaketoys.api.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.clonestaketoys.api.controllers.UsuarioController;
import br.com.clonestaketoys.api.exceptions.UsuarioInvalidoException;
import br.com.clonestaketoys.api.model.Usuario;

@Path("/usuario")
public class UsuarioResources {

	private UsuarioController usuarioController = new UsuarioController();
	
	@Path("/cadastrar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response cadastrarUsuario(Usuario usuario) throws UsuarioInvalidoException {
		
		return Response.ok(usuarioController.cadastrarUsuario(usuario)).build();
	}
	
}
