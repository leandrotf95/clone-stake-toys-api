package br.com.clonestaketoys.api.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class CustomExceptionMapper implements ExceptionMapper<Exception> {

    public Response toResponse(Exception exception) {
    	return Response.status(500).entity(exception.getMessage()).type("text/plain").build();
    }

}
