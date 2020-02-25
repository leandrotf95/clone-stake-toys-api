package br.com.clonestaketoys.api.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.clonestaketoys.api.enums.EnumUser;
import br.com.clonestaketoys.api.exceptions.UsuarioLogadoException;
import br.com.clonestaketoys.api.model.Usuario;

@Path("/login")
@Consumes(MediaType.APPLICATION_JSON)
public class LoginResources extends ApiBase {

	@POST
	public Response login(Usuario usuario) throws UsuarioLogadoException {
		
		/**
		 * getAttribute é um método da interface HttpSession que devolve um Object
		 */
		
		if(getSession().getAttribute(EnumUser.USER.name()) == null) {
			getSession().setAttribute(EnumUser.USER.name(), usuario);
			return Response.ok().build();
		}
		
		throw new UsuarioLogadoException();
	}
	
}
