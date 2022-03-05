package org.service;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RegisterRestClient
public interface ViaCepService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{cep}/json")
    Response getCep(@PathParam("cep") String cep);
}
