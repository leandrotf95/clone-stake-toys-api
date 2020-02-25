package br.com.clonestaketoys.api.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import br.com.clonestaketoys.api.model.Mensagem;

@Provider
public class CustomExceptionMapper implements ExceptionMapper<Exception> {

    public Response toResponse(Exception exception) {
    	return Response.status(Status.BAD_REQUEST.getStatusCode()).entity(new Mensagem(exception.getMessage(), Status.BAD_REQUEST.getStatusCode())).type("application/json").build();
    }

}