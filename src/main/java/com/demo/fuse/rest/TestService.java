package com.demo.fuse.rest;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
@WebService
public interface TestService {
	   @GET
	   @Path("/greet/{name}")
	   @Produces(MediaType.APPLICATION_JSON)
	   public Response greet(@PathParam(value = "name") String name);
	 
	   @POST
	   @Path("/sayhello")
	   @Produces(MediaType.APPLICATION_JSON)
	   public Response sayHello(String input);
}
