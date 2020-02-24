package br.com.clonestaketoys.api.exceptions;

import javax.ws.rs.core.Response.Status;

public class UsuarioInvalidoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UsuarioInvalidoException() {
		super("Usuário inválido");
	}
	
	public Integer getCode() {
		return Status.BAD_REQUEST.getStatusCode();
	}

	
	
}
