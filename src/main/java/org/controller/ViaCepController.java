package org.controller;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.model.ViaCepModel;
import org.service.ViaCepService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/viacep")
public class ViaCepController {

    @Inject
    @RestClient
    ViaCepService viaCepService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ViaCepModel getCep(@QueryParam("cep") String cep) {
        return viaCepService.getCep(cep);
    }

}
