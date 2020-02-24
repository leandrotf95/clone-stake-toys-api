package br.com.clonestaketoys.api.controllers;

import br.com.clonestaketoys.api.exceptions.UsuarioInvalidoException;
import br.com.clonestaketoys.api.model.Usuario;

public class UsuarioController {

	public Usuario cadastrarUsuario(Usuario usuario) throws UsuarioInvalidoException {
		if(usuario.getNomeUsuario().contains("@")) {
			throw new UsuarioInvalidoException();
		} else {			
			return usuario;
		}
	}
	
}
