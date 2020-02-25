package br.com.clonestaketoys.api.exceptions;

import javax.ws.rs.core.Response.Status;

public class UsuarioLogadoException extends Exception {

private static final long serialVersionUID = 1L;
	
	public UsuarioLogadoException() {
		super("Usuário já logado");
	}
	
	public Integer getCode() {
		return Status.BAD_REQUEST.getStatusCode();
	}
	
}
