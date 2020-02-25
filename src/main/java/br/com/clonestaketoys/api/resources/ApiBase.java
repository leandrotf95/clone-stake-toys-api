package br.com.clonestaketoys.api.resources;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.NotAuthorizedException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response.Status;

import br.com.clonestaketoys.api.enums.EnumUser;
import br.com.clonestaketoys.api.model.Usuario;

public class ApiBase {

	@Context
	private HttpServletRequest request;
	
	@Context
	private HttpServletResponse response;
	
	
	protected HttpSession getSession() {
		return request.getSession();
	}
	
	public HttpServletRequest getRequest() {
		return request;
	}
	
	protected Usuario getUsuario() throws NotAuthorizedException {
		Object user = request.getSession().getAttribute(EnumUser.USER.name());
		
		if (user == null) {
			getSession().invalidate();
			throw new NotAuthorizedException("Autorização negada", Status.UNAUTHORIZED);
		}
		
		return (Usuario) user;
	}
}
