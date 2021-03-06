package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.jboss.resteasy.annotations.jaxrs.PathParam;




@Path("/hello")
public class GreetingResource {
    @Inject
    GreetingService service;

    @GET
    @Produces({MediaType.TEXT_PLAIN})
    @Path("/second")
    public String secondService(@PathParam("name") String name){
        return service.secondService(name);
    }


    @GET
    @Produces({MediaType.TEXT_PLAIN})
    @Path("/first")
    public String firstService(@PathParam String name){
        return service.firstService(name);

    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("greeting/{name}")
    public String greeting (@PathParam String name)  {
        return service.greeting(name);
    }

}


